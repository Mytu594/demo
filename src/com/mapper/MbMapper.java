package com.mapper;

import java.util.List;

import com.po.Mb;

public interface MbMapper {
	Mb selectMbById(String id);
	List<Mb> selectMbByName(String name);
	List<Mb> selectMbs();
	void insertMb(Mb mb);
	void updateMb(Mb mb);
	void deleteMbById(String id);
}
