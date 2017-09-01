package com.sopra.resa.dao;

import java.util.List;

import com.sopra.resa.model.Vol;

/*
 * DaoVols = Data Access Object
 *         alias "Data Service" alias "repository spring"
 *   avec methodes CRUD
 *   et throws RuntimeException implicites
 */
public interface DaoVols extends DaoGeneric<Vol,Long>{
    
    public List<Vol> findVolsByDeparture(String town);
	
}    
