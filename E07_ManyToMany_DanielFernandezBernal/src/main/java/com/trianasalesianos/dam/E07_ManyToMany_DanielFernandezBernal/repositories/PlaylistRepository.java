package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.repositories;

import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist,Long> {
}
