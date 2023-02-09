package com.poly.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poly.main.Entity.Size;

@Repository
public interface SizeRepository extends JpaRepository<Size, Long> {

}
