package com.service;
import java.util.List;

import com.po.Mb;
public interface MbService {
	List<Mb> findAllMember();
	Mb findMemberById(String id);
	void addMember(Mb mb);
	void deleteMembers(String[] idArray);
	void updateMember(Mb mb);
}
