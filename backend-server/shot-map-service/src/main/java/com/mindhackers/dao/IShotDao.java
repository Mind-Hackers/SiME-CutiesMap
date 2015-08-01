package com.mindhackers.dao;

import java.util.List;

import com.mindhackers.shotmap.model.ShotItem;

public interface IShotDao {
	ShotItem getShotById(String id);
	List<ShotItem> getAllShots();
	void addShot(ShotItem shutItem);
	void delShotById(String id);

}
