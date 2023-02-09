package com.poly.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poly.main.Entity.Manufacture;

@Repository
public interface ManuFactureRepository extends JpaRepository<Manufacture, Long> {
	
}
