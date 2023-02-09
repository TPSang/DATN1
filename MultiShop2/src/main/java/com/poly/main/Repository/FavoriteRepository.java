package com.poly.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poly.main.Entity.Favorite;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

}