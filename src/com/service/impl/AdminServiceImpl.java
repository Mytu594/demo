package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.AdminMapper;
import com.po.Admin;
import com.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminMapper adminMapper;
	@Override
	public List<Admin> findAllAdmin(){
		return adminMapper.selectAdmins();
	}
	public void addAdmin(Admin admin) {
		adminMapper.insertAdmin(admin);
	}
	public String checkPassword(String id) {
		return adminMapper.selectPasswordById(id);
	}
}
