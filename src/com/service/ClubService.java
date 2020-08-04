package com.service;
import java.util.List;
import com.po.Club;
public interface ClubService {
	Club findClubById(String id);
	List<Club> findAllClub();
	void addClub(Club club);
	void deleteClubs(String[] idArray);
	void updateClub(Club club);
}
