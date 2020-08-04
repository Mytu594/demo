package com.mapper;

import java.util.List;

import com.po.Admin;

public interface AdminMapper {
	List<Admin> selectAdmins();
	void insertAdmin(Admin admin);
	String selectPasswordById(String id);
}
