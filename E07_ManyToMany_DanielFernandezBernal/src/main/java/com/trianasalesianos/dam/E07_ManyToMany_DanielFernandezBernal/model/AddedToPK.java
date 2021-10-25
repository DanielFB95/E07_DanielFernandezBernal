package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Embeddable
public class AddedToPK implements Serializable {

    private Long song_id;
    private Long playlist_id;
}
