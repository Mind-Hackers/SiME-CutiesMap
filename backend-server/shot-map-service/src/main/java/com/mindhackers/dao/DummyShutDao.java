package com.mindhackers.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.mindhackers.shotmap.model.GeoPoint;
import com.mindhackers.shotmap.model.ShotItem;

public class DummyShutDao implements IShotDao {
	List<ShotItem> shots = new ArrayList<ShotItem>();

	public DummyShutDao() {
		ShotItem item = new ShotItem();
		Calendar date = Calendar.getInstance();
		date.set(2015, 8, 1, 13, 59);
		item.setFindDateTime(date);
		item.setId("1");
		item.setPicUrl("http://ext.pimg.tw/jimmyya/49d4e8f97072a.jpg");
		item.setGeoPoint(25.045847, 121.507695);

		shots.add(item);

		item = new ShotItem();
		date = Calendar.getInstance();
		date.set(2015, 8, 1, 14, 01);
		item.setFindDateTime(date);
		item.setId("2");
		item.setPicUrl("http://ab.unayung.cc/uploads/photo/file/000/000/030/LN07_005.jpg");
		item.setGeoPoint(25.042299, 121.507695);

		shots.add(item);
	}

	@Override
	public ShotItem getShotById(String id) {

		return shots.get(0);
	}

	public List<ShotItem> getAllShots() {

		return shots;
	}

	@Override
	public void addShot(ShotItem shutItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delShotById(String id) {
		// TODO Auto-generated method stub

	}

}
