package com.sopra.resa.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sopra.resa.model.Localite;
import com.sopra.resa.model.Vol;
//version simulée sans base (temporairement)
@Service
//@Transactional
public class ServiceVolsImpl implements ServiceVols {

	@Override
	public List<Localite> rechercherListeLocalites() {
		List<Localite> listeLoc = new ArrayList<Localite>();
		listeLoc.add(new Localite(1L,"Paris","Orly"));
		listeLoc.add(new Localite(2L,"Paris","Roissy"));
		listeLoc.add(new Localite(3L,"Toulouse","Toulouse"));
		listeLoc.add(new Localite(4L,"Nice","Nice"));
		return listeLoc;
	}

	@Override
	public List<Vol> rechercherVolsAuDepart(String ville, Date date) {
		List<Vol> listeVols = new ArrayList<Vol>();
		switch(ville){
		case "Paris":
			listeVols.add(new Vol(1L,12.5,null,null));
			listeVols.add(new Vol(2L,120.5,null,null));
			listeVols.add(new Vol(3L,1200.5,null,null));
			break;
		case "Toulouse":
			listeVols.add(new Vol(11L,20.5,null,null));
			listeVols.add(new Vol(12L,400.5,null,null));
			listeVols.add(new Vol(13L,60.5,null,null));
			break;
		case "Nice":
			listeVols.add(new Vol(21L,52.5,null,null));
			listeVols.add(new Vol(22L,490.5,null,null));
			listeVols.add(new Vol(23L,370.5,null,null));
			break;
		}
		return listeVols;
	}

}
