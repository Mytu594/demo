package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.ActMapper;
import com.po.Activity;
import com.service.ActService;

@Service
@Transactional
public class ActServiceImpl implements ActService {
	@Autowired
	private ActMapper actMapper;
	@Override
	public Activity findActById(String id) {
		return actMapper.selectActById(id);
	}
	public List<Activity> findAllAct(){
		return actMapper.selectActs();
	}
	public void addAct(Activity act) {
		actMapper.insertAct(act);
	}
	public void deleteActs(String[] idArray) {
		for (int i = 0; i < idArray.length; i ++) {
			actMapper.deleteActById(idArray[i]);
		}
	}
	public void updateAct(Activity act) {
		actMapper.updateAct(act);
	}
}
