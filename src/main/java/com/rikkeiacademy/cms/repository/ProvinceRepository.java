package com.rikkeiacademy.cms.repository;

import com.rikkeiacademy.cms.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class ProvinceRepository implements IProvinceRepository{
    @Override
    public Iterable<Province> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Province> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Province> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Province> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Province> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Province> findAll() {
        return null;
    }

    @Override
    public Iterable<Province> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Province entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Province> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
