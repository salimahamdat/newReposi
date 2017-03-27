package org.sympanux.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.sympanux.entities.Agence;

public interface AgenceRepository  extends JpaRepository<Agence, Long>{
@Query("select a from Agence a where a.nomAgence like :x")
public List<Agence> AgenceByName(@Param("x")String Name);

@Query("select a from Agence a where a.ville like :y")
public List<Agence> AgenceByCity(@Param("y")String City);
	
}
