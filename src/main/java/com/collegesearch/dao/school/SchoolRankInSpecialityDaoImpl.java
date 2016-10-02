/**
 * 
 */
package com.collegesearch.dao.school;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.springframework.stereotype.Repository;

import com.collegesearch.dao.GenericDaoImpl;
import com.collegesearch.domain.school.SchoolRankInSpeciality;

@Repository("schoolRankInSpecialityDao")
public class SchoolRankInSpecialityDaoImpl extends GenericDaoImpl<SchoolRankInSpeciality, Integer> implements SchoolRankInSpecialityDao {

	/* (non-Javadoc)
	 * @see com.collegesearch.dao.school.SchoolRankInSpecialityDao#getSchoolRankInSpecialityDaoBySpeciality(java.lang.String)
	 */
	@Override
	public List<SchoolRankInSpeciality> getSchoolRankInSpecialityBySpeciality(String speciality) {
		SimpleExpression expr = Restrictions.eq("speciality", speciality).ignoreCase();
		//MatchMode mode = MatchMode.START;
		return findAll(expr);
	}

}
