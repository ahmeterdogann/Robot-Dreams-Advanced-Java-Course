package com.ahmeterdogan.data.repository;

import java.util.List;

public interface ICrudRepository<T> {
    void save(T t);
    List<T> findAll();
    T findById(Long id);
    void delete(T t);
    void delete(Long id);
    void update(T t);
}
