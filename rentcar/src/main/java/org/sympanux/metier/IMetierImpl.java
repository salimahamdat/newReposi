package org.sympanux.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sympanux.dao.CompteAdminRepository;
import org.sympanux.entities.CompteAdmin;

@Service // demander a spring d'istancier la classe de la couche metier au
			// demarrage
@Transactional // demander a spring de gerer les transactions de lacouche metier
public class IMetierImpl implements IMetier {

	@Autowired // demaander a spring d'injecter les dependances
	private CompteAdminRepository compterepository; // pour consulter un compte
													// on 'a besoin de la couche
													// dao

	@Override
	public CompteAdmin ConsulterCompte(Long id) {
		CompteAdmin cpa = compterepository.findOne(id);
		if (cpa == null)
			throw new RuntimeException("compte intouvable !"); // un message non
																// surveiller
		return cpa;
	}

}
