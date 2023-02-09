package com.poly.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poly.main.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

}
