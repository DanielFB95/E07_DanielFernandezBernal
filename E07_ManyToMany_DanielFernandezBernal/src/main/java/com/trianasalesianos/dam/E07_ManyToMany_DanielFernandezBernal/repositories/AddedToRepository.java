package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.repositories;

import com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.model.AddedTo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo,Long> {
}
