package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.repositories;

import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song,Long> {
}
