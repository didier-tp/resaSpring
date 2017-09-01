package com.sopra.resa.dao.hibernate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sopra.resa.dao.DaoLocalite;
import com.sopra.resa.model.Localite;


//@Component
@Repository // id par defaut = Nom de la classe avec minuscule au debut
@Transactional //en version spring
public class DaoLocaliteHibernate extends DaoGenericImpl<Localite,Long> implements DaoLocalite {
	
}
