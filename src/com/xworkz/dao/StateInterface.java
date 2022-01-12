package com.xworkz.dao;

import com.xworkz.entity.StateEntity;

public interface StateInterface {
public void save(StateEntity entity);
public StateEntity getById(int Id);
public void updateCapitalCity(String newCity,int id);
public void delete(int Id);
}
