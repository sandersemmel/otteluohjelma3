package com.company;


import java.util.ArrayList;

public interface Repository<T extends GenericInterface> {
    void add(T entity);

    void remove(T entity);

    void update(T entity);

    void create(T entity);

    ArrayList<?> getArrayList();

}
