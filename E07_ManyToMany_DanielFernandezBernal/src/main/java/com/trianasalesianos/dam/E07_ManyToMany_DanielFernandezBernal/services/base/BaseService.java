package com.trianasalesianos.dam.E07_ManyToMany_DanielFernandezBernal.services.base;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class BaseService <T,ID,R extends JpaRepository<T,ID>>{

    protected R repository;

    public BaseService(R repo) {
        this.repository = repo;
    }

    public T save (T t){
        return repository.save(t);
    }

    public T findByID(ID id){
        return repository.findById(id).orElse(null);
    }

    public List<T> findAll(){
        return repository.findAll();
    }

    public T edit (T t){
        return repository.save(t);
    }

    public void delete(T t){
        repository.delete(t);
    }

    public void deleteById(ID id){
        repository.deleteById(id);
    }
}
