package com.company;


import java.util.ArrayList;
import java.util.List;

public interface Repository<T extends GenericInterface> {
    void add(T entity);

    void remove(T entity);

    void update(T entity);

    void create(T entity);

    List<?> getArrayList();

}
