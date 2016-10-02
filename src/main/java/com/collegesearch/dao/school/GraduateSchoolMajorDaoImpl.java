package com.collegesearch.dao.school;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.criteria.CriteriaBuilder.Case;

import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.jgroups.stack.GossipData;
import org.springframework.stereotype.Repository;

import java.util.Set;

import com.collegesearch.dao.GenericDaoImpl;
import com.collegesearch.domain.school.GraduateSchoolMajor;
import com.collegesearch.domain.school.GraduateSchoolMajorId;
import com.collegesearch.domain.school.School;
import com.collegesearch.util.school.SchoolUtil;

@Repository("GraduateSchoolMajorDao")
public class GraduateSchoolMajorDaoImpl extends GenericDaoImpl<GraduateSchoolMajor, GraduateSchoolMajorId>
		implements GraduateSchoolMajorDao {

	@SuppressWarnings({ "deprecation", "null" })
	@Override
	public List<GraduateSchoolMajor> getGraduateSchoolMajors(LinkedHashMap<String, List<String>> queryParams) {
		if (queryParams == null)
			return null;
		List<GraduateSchoolMajor> graduateSchoolMajorList = null;
		Set<Map.Entry<String, List<String>>> entrySet = queryParams.entrySet();
		Iterator<Map.Entry<String, List<String>>> it = entrySet.iterator();
		String key, value = null;
		List<String> values = null;
		DetachedCriteria graduateSchoolCriteria = DetachedCriteria.forClass(GraduateSchoolMajor.class);
		while (it.hasNext()) {
			Entry<String, List<String>> entry = (Entry<String, List<String>>) it.next();
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
			case "toefl":
				graduateSchoolCriteria.add(Restrictions.le(key, Integer.parseInt(value)));
				break;

			case "ielts":
				graduateSchoolCriteria.add(Restrictions.le(key, Integer.parseInt(value)));
				break;

			case "gre":
				graduateSchoolCriteria.add(Restrictions.le(key, Integer.parseInt(value)));
				break;

			case "gmat":
				graduateSchoolCriteria.add(Restrictions.le(key, Integer.parseInt(value)));
				break;

			case "last":
				graduateSchoolCriteria.add(Restrictions.le(key, Integer.parseInt(value)));
				break;

			case "topRank":
				int topRank = Integer.parseInt(value);
				graduateSchoolCriteria.add(Restrictions.le("rank", topRank));
				break;

			case "bottomRank":
				int bottomRank = Integer.parseInt(value);
				graduateSchoolCriteria.add(Restrictions.ge("rank", bottomRank));
				break;

			case "degree":
				graduateSchoolCriteria.add(Restrictions.ilike(key, value, MatchMode.ANYWHERE));
				break;

			case "fallApplicationDeadline":
				int fallDate = Integer.parseInt(value); 					// June 1st almost is the latest deadline
				graduateSchoolCriteria.add(Restrictions.or(Restrictions.ge(key, fallDate), Restrictions.le(key, 601)));
				break;
			case "springApplicationDeadline":
				int springDate = Integer.parseInt(value);
				graduateSchoolCriteria.add(Restrictions.ge(key, springDate));

				break;

			case "state":
				graduateSchoolCriteria.createAlias("school", "s", CriteriaSpecification.INNER_JOIN);
				graduateSchoolCriteria.add(Restrictions.in("s.state", values));
				break;

			case "major":
				graduateSchoolCriteria.createAlias("graduateMajor", "g", DetachedCriteria.INNER_JOIN);
				graduateSchoolCriteria.add(Restrictions.in("g.name", values));
				break;

			}
		}
		try {
			// this.getHibernateTemplate().findByCriteria(detachedCriteria);
			Criteria criteria = graduateSchoolCriteria.getExecutableCriteria(getSession());
			graduateSchoolMajorList = (List<GraduateSchoolMajor>) criteria.list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return graduateSchoolMajorList;
	}
}
