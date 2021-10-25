package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.services;

import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.Playlist;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.repositories.PlaylistRepository;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService extends BaseService<Playlist, Long, PlaylistRepository> {
    public PlaylistService(PlaylistRepository repo) {
        super(repo);
    }
}
