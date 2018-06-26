package com.univel.ejb;

import java.io.Serializable;

import javax.persistence.EntityManager;

import com.univel.persistence.dao.IDAO;
import com.univel.persistence.entities.Bean;

public interface RemoteBusiness<PK extends Serializable, T extends Bean<PK>> {

	public EntityManager getEntityManager();

	public IDAO<PK, T> getDAO();

}
