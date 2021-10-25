package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Builder
public class Song implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String album;
    private Integer year;

    @ManyToOne
    private Artist artist;

    @OneToMany(mappedBy = "song", fetch = FetchType.EAGER)
    private List<AddedTo> addedTo = new ArrayList<>();

    public Song(String title, String album, Integer year, Artist artist) {
        this.title = title;
        this.album = album;
        this.year = year;
        this.artist = artist;
    }

    public void addToArtist(Artist a){
        this.artist = artist;
        a.getSongs().add(this);
    }

    public void removeFromArtist(Artist a){
        a.getSongs().remove(this);
        this.artist = null;
    }
}
