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
@Getter @EqualsAndHashCode
@Builder
public class Artist implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "artist", fetch = FetchType.EAGER)
    private List<Song> songs = new ArrayList<>();

    public Artist(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }
}
