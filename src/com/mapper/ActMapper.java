package com.mapper;

import java.util.List;

import com.po.Activity;

public interface ActMapper {
	Activity selectActById(String id);
	List<Activity> selectActByName(String name);
	List<Activity> selectActs();
	void insertAct(Activity act);
	void updateAct(Activity act);
	void deleteActById(String id);
}
