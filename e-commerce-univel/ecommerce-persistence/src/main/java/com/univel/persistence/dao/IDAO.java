package com.univel.persistence.dao;

import java.io.Serializable;
import java.util.List;

import com.univel.persistence.entities.Bean;

public interface IDAO<PK extends Serializable, T extends Bean<PK>> {

	
	public T save(T t);


	public List<T> findAll();

	
	public T find(PK id);


	public void remove(T t);

}
