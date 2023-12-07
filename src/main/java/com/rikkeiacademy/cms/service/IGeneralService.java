package com.rikkeiacademy.cms.service;

import java.util.List;
import java.util.Optional;

public interface IGeneralService <Entity>{
    Iterable<Entity> findAll();

    Optional<Entity> findById(Long id);

    void save(Entity entity);

    void remove(Long id);
}
