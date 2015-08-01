package com.mindhackers.shotmap.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.glassfish.grizzly.http.server.Response;

import com.mindhackers.dao.DummyShutDao;
import com.mindhackers.shotmap.model.ShotItem;


@Path("shots")
public class ShotsResource  {

	public void add(ShotItem cutie) {
		// TODO Auto-generated method stub

	}


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ShotItem> getAllShots() {
		DummyShutDao dao = new DummyShutDao();
		return dao.getAllShots();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postForm(JSONObject bookmark) throws JSONException {
		return null;	

	}

	@Path("{id}/")
	public ShotResource getShot(@PathParam("id") String id){
		
		
		return new ShotResource(id);
		
	}


}
