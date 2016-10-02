package com.collegesearch.dao.school;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.transaction.Transactional;

import java.util.Map.Entry;

import org.hibernate.CacheMode;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.springframework.stereotype.Repository;

import com.collegesearch.dao.GenericDaoImpl;
import com.collegesearch.domain.school.School;
import com.collegesearch.dto.SchoolDto;
import com.collegesearch.util.school.SearchInterval;

@Repository("SchoolDao")
public class SchoolDaoImpl extends GenericDaoImpl<School, Integer> implements SchoolDao {
	public School getSchoolByName(String schoolName) {
		List<School> list = findByParameter("name", schoolName);
		if (list != null || !list.isEmpty()) {
			return list.get(0);
		} else {
			return null;
		}
	}

	public School getSchoolByName(Session session, String name) {
		session.setCacheMode(CacheMode.REFRESH);
		Query query = session.createQuery("From Applicant where name = :name");
		query.setString("name", name);
		return (School) query.uniqueResult();
	}
	@Transactional
	public List<School> getSchools(LinkedHashMap<String, List<String>> queryParams) {
		if (queryParams == null)
			return null;
		List<School> schoolList = null;
		Set<Map.Entry<String, List<String>>> entrySet = queryParams.entrySet();
		Iterator<Map.Entry<String, List<String>>> iterator = entrySet.iterator();
		String key, value = null;
		List<String> values = null;
		DetachedCriteria internationalApplicationCriteria = null;
		DetachedCriteria schoolCriteria = DetachedCriteria.forClass(School.class);
		while (iterator.hasNext()) {
			Entry<String, List<String>> entry = (Entry<String, List<String>>) iterator.next();
			key = entry.getKey();
			Object obj = entry.getValue();
			values = new ArrayList<String>();
			if (obj instanceof String) {
				values.add((String) obj);
			} else if (obj instanceof Integer) {
				values.add(Integer.toString((Integer) obj));
			} else {
				values = entry.getValue();
			}
			if (values.size() == 1) {
				value = values.get(0);
			}
			if (values == null || values.isEmpty())
				continue;
			switch (key) {
			case "topRank":
				int topRank = Integer.parseInt(value);
				schoolCriteria.add(Restrictions.le("rankOverall", topRank));
				break;
			case "bottomRank":
				int bottomRank = Integer.parseInt(value);
				schoolCriteria.add(Restrictions.ge("rankOverall", bottomRank));
				break;
			case "state":
				schoolCriteria.add(Restrictions.in("state", values));
				break;
			case "tuitionFee":
			case "RoomBoard":
				int totalCost = Integer.parseInt(value);
//				schoolCriteria.add(Restrictions.le(key, totalCost));
				schoolCriteria.add(Restrictions.sqlRestriction("Tuition_Fee + Room_Board<"+value.toString()));
				break;
			case "averageGpa":
				schoolCriteria.add(Restrictions.gt(key, 0f));
				schoolCriteria.add(Restrictions.le(key, Float.parseFloat(value)));
				break;
			case "internationalStudentApplication.minimumToeflScore":
				if (internationalApplicationCriteria == null)
					internationalApplicationCriteria = schoolCriteria.createCriteria("internationalStudentApplication",
							JoinType.LEFT_OUTER_JOIN);
				internationalApplicationCriteria.add(Restrictions.le(key, Integer.parseInt(value)));
				internationalApplicationCriteria.add(Restrictions.gt(key, 0));
				break;
			case "internationalStudentApplication.Minimum_IELTS_Score_Required":
				if (internationalApplicationCriteria == null)
					internationalApplicationCriteria = schoolCriteria.createCriteria("internationalStudentApplication",
							JoinType.LEFT_OUTER_JOIN);
				internationalApplicationCriteria.add(Restrictions.le(key, Integer.parseInt(value)));
				internationalApplicationCriteria.add(Restrictions.gt(key, 0));
				break;
			case "internationalStudentApplication.TOEFL_Accepted_Instead_Of_SAT_Or_ACT":
				key = "TOEFL_Accepted_Instead_Of_SAT_Or_ACT";
				if (internationalApplicationCriteria == null)
					internationalApplicationCriteria = schoolCriteria.createCriteria("internationalStudentApplication",
							JoinType.LEFT_OUTER_JOIN);
				internationalApplicationCriteria.add(Restrictions.eq(key, value).ignoreCase());
				break;
			case "internationalStudentApplication.conditionalAdmissionOffered":
				key = "conditionalAdmissionOffered";
				if (internationalApplicationCriteria == null)
					internationalApplicationCriteria = schoolCriteria.createCriteria("internationalStudentApplication",
							JoinType.LEFT_OUTER_JOIN);
				internationalApplicationCriteria.add(Restrictions.eq(key, value).ignoreCase());
				break;
			case "size":
				List<SearchInterval> searchIntervalSizeList = new ArrayList<>();
				for (String s : values) {
					searchIntervalSizeList.add(new SearchInterval(s));
				}
				Disjunction orSize = Restrictions.disjunction();
				for (SearchInterval si : searchIntervalSizeList) {
					orSize.add(Restrictions.and(Restrictions.ge(key, si.getIntLowerLimit()),
							Restrictions.le(key, si.getIntUpperLimit())));
				}
				schoolCriteria.add(orSize);
				break;

			case "acceptRate":
				List<SearchInterval> searchIntervalList = new ArrayList<>();
				for (String s : values) {
					searchIntervalList.add(new SearchInterval(s));
				}
				Disjunction orAcceptRate = Restrictions.disjunction();
				for (SearchInterval si : searchIntervalList) {
					orAcceptRate.add(Restrictions.and(Restrictions.ge(key, si.getLowerLimit()),
							Restrictions.le(key, si.getUpperLimit())));
				}
				schoolCriteria.add(orAcceptRate);
				break;

			case "Category":
				schoolCriteria.add(Restrictions.in(key, values));
				break;
			case "type":
				schoolCriteria.add(Restrictions.in(key, values));
				break;
			case "setting":
				schoolCriteria.add(Restrictions.in(key, values));
				break;
			}
		}
		try {
			// this.getHibernateTemplate().findByCriteria(detachedCriteria);
			Criteria criteria = schoolCriteria.getExecutableCriteria(getSession());
			schoolList = (List<School>) criteria.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
//		List<SchoolDto> outputList=convertSchoolDtoList(schoolList);
		return schoolList;
	}
//	static List<SchoolDto> convertSchoolDtoList(List<School> list){
//		List<SchoolDto> resultList=new ArrayList<>();
//		for(School item : list) {
//			resultList.add(new SchoolDto(item));
//		}
//		return resultList;
//	}
}
