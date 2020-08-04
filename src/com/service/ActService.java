package com.service;
import java.util.List;
import com.po.Activity;
public interface ActService {
	Activity findActById(String id);
	List<Activity> findAllAct();
	void addAct(Activity act);
	void deleteActs(String[] idArray);
	void updateAct(Activity act);
}
