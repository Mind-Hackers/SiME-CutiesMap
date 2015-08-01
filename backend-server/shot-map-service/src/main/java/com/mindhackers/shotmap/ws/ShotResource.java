package com.mindhackers.shotmap.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mindhackers.dao.DummyShutDao;
import com.mindhackers.shotmap.model.ShotItem;


public class ShotResource {
	private String id;



	public ShotResource(String id) {
		this.id = id;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ShotItem getCutie() {
		DummyShutDao dao = new DummyShutDao();
		return dao.getAllShots().get(0);
		
	

		
	}

	public String toString() {
		return id;
	}

}
