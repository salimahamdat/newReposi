package org.sympanux.dao;

import java.security.Provider.Service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long>{

}
