package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.services;

import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.Song;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.repositories.SongRepository;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song,Long, SongRepository> {

    public SongService(SongRepository repo) {
        super(repo);
    }
}
