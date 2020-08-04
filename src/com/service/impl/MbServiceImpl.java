package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.MbMapper;
import com.po.Mb;
import com.service.MbService;
@Service
@Transactional
public class MbServiceImpl implements MbService{
	@Autowired
	private MbMapper mbMapper;
	@Override
	public List<Mb> findAllMember() {
		return mbMapper.selectMbs();
	}
	public Mb findMemberById(String id) {
		return mbMapper.selectMbById(id);
	}
	public void addMember(Mb mb) {
		mbMapper.insertMb(mb);
	}
	public void deleteMembers(String[] idArray) {
		for (int i = 0; i < idArray.length; i ++) {
			mbMapper.deleteMbById(idArray[i]);
		}
	}
	public void updateMember(Mb mb) {
		mbMapper.updateMb(mb);
	}
	
}
