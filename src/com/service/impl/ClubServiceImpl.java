package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.ClubMapper;
import com.po.Club;
import com.service.ClubService;
@Service
@Transactional
public class ClubServiceImpl implements ClubService{
	@Autowired
	private ClubMapper clubMapper;
	@Override
	public Club findClubById(String id) {
		return clubMapper.selectClubById(id);
	}
	public List<Club> findAllClub(){
		return clubMapper.selectClubs();
	}
	public void addClub(Club club) {
		clubMapper.insertClub(club);
	}
	public void deleteClubs(String[] idArray) {
		for (int i = 0; i < idArray.length; i ++) {
			clubMapper.deleteClubById(idArray[i]);
		}
	}
	public void updateClub(Club club) {
		clubMapper.updateClub(club);
	}
}
