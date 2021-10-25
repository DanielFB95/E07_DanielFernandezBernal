package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.services;

import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.Artist;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.repositories.ArtistRepository;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends BaseService<Artist,Long, ArtistRepository> {
    public ArtistService(ArtistRepository repo) {
        super(repo);
    }
}
