package com.poly.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.poly.main.Entity.UserRole;
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

}
