package com.sopra.resa.test;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sopra.resa.model.Localite;
import com.sopra.resa.model.Vol;
import com.sopra.resa.service.ServiceVols;

@RunWith(SpringJUnit4ClassRunner.class)//necessite spring-test dans pom.xml
@ContextConfiguration(locations={"/configSpring.xml"}) //charge qu'une seule fois!!!
public class VolTest {
	
	@Autowired //@Autowired est equivalent a context.getBean(ServiceClient.class);
	private  ServiceVols serviceVols; //a tester

	
	@Test
	public void testRechercherListeLocalites(){
		List<Localite> listeLoc = serviceVols.rechercherListeLocalites();
		Assert.assertTrue(listeLoc.size()>0);
	}
	
	@Test
	public void testRechercherVolsAuDepart(){
		List<Vol> listeVols = serviceVols.rechercherVolsAuDepart("Paris", new Date());
		Assert.assertTrue(listeVols.size()>0);
		for(Vol v : listeVols){
			System.out.println("\t" + v);
		}
	}
	
}
