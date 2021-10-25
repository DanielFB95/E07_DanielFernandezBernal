package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class AddedTo {

    @Builder.Default
    @EmbeddedId
    private AddedToPK id = new AddedToPK();

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name = "song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    private LocalDateTime addTime;
    private Integer order;

    public AddedTo(Song song, Playlist playlist, LocalDateTime addTime, Integer order) {
        this.song = song;
        this.playlist = playlist;
        this.addTime = addTime;
        this.order = order;
    }

    public void addAddToToSong(Song s){
        song = s;
        s.getAddedTo().add(this);
    }

    public void removeAddToFromSong(Song s){
        s.getAddedTo().remove(this);
        song = null;
    }

    public void addAddToToPlaylist(Playlist p){
        playlist = p;
        p.getAddedTo().add(this);
    }

    public void removeAddToFromPlaylist(Playlist p){
        p.getAddedTo().remove(this);
        playlist = null;
    }

    public void addSongPlaylist(Song s,Playlist p){
        addAddToToSong(s);
        addAddToToPlaylist(p);
    }

    public void removeSongPlaylist(Song s,Playlist p){
        removeAddToFromSong(s);
        removeAddToFromPlaylist(p);
    }
}
