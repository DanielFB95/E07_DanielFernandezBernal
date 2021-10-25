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
public class Playlist implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "playlist", fetch = FetchType.EAGER)
    private List<AddedTo> addedTo = new ArrayList<>();

    public Playlist(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
