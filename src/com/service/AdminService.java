package com.service;

import java.util.List;

import com.po.Admin;

public interface AdminService {
	List<Admin> findAllAdmin();
	void addAdmin(Admin admin);
	String checkPassword(String id);
}
