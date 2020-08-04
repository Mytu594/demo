package com.mapper;

import java.util.List;

import com.po.Club;

public interface ClubMapper {
	Club selectClubById(String id);
	List<Club> selectClubByName(String name);
	List<Club> selectClubs();
	void insertClub(Club club);
	void updateClub(Club club);
	void deleteClubById(String id);
}
