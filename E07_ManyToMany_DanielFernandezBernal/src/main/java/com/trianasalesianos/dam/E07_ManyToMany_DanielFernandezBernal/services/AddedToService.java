package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.services;

import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.AddedTo;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.Playlist;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.Song;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.repositories.AddedToRepository;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AddedToService extends BaseService<AddedTo,Long, AddedToRepository> {

    public AddedToService(AddedToRepository repo) {
        super(repo);
    }

}
