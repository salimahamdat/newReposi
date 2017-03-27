package org.sympanux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.sympanux.dao.AgenceRepository;
import org.sympanux.dao.VehiculeRepository;



@SpringBootApplication
public class RentcarApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RentcarApplication.class, args);
		VehiculeRepository vehiculeRepository = ctx.getBean(VehiculeRepository.class);
		AgenceRepository agenceRepository = ctx.getBean(AgenceRepository.class);

	
	
	vehiculeRepository.findAll().forEach(result-> System.out.println("marque de voiture <"+result.getMarque()+"> Nombre de porte "+result.getNombreDePorte()+" avec la couleur  "+result.getCouleur()));
		
	}
}
