package org.sympanux.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sympanux.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

}
