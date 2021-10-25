package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal;

import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.AddedTo;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.Artist;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.Playlist;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.Song;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.repositories.AddedToRepository;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.repositories.ArtistRepository;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.repositories.PlaylistRepository;
import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.repositories.SongRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class InitData {

    private final AddedToRepository addedToRepository;
    private final ArtistRepository artistRepository;
    private final SongRepository songRepository;
    private final PlaylistRepository playlistRepository;

    @PostConstruct
    public void init(){

        Artist a = Artist.builder().name(" ").build();
        artistRepository.save(a);
        Song s = Song.builder().title("canción").album("álbum").year(1995).build();
        songRepository.save(s);
        Playlist p = Playlist.builder().description("descripción").name("playlist").build();
        playlistRepository.save(p);
        AddedTo addedTo = AddedTo.builder().order(1).addTime(LocalDateTime.of(1995,11,22,17,12)).build();

    }
}
