package com.sopra.resa.dao.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.resa.dao.DaoVols;
import com.sopra.resa.model.Vol;


//@Component
@Repository // id par defaut = Nom de la classe avec minuscule au debut
@Transactional //en version spring
public class DaoVolsHibernate extends DaoGenericImpl<Vol,Long> implements DaoVols {

	@Override
	public List<Vol> findVolsByDeparture(String town) {
		return em.createQuery("SELECT v FROM Vol v WHERE v.depart.localite.ville = :ptown",Vol.class)
                 .setParameter("ptown", town)
                 .getResultList();
	}
	
}
