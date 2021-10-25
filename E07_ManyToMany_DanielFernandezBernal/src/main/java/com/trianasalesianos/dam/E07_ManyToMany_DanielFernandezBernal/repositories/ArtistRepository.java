package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.repositories;

import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist,Long> {
}
