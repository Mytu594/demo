package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.po.Admin;
import com.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	 //index页面注册
	@RequestMapping(value="/adminpreinsert",method=RequestMethod.GET)
	public String adminPreinsert() {
		return "login/register";
	}
	//index页面注册
	@RequestMapping(value="/admininsert",method=RequestMethod.POST)
	public String adminInsert(Admin admin) {
		adminService.addAdmin(admin);//注册即向sign表添加信息
		System.out.println("注册成功");
		return "login/mblogin";//跳到登录页面
	}
	
	//index页面登录
	@RequestMapping(value="/adminprelogin",method=RequestMethod.GET)
	public String adminPrelogin() {
		return "login/mblogin";
	}
	//登录验证
	@RequestMapping(value="/adminlogin",method=RequestMethod.POST)
	public String adminLogin(Admin admin) {
		System.out.println("1");
		String num=admin.getId();
		String ps=admin.getPwd();
		System.out.println(num);
		System.out.println(ps);
		String newps;
		if(num.equals("admin") && ps.equals("123456")){
			return "admin/adminlist";//跳到管理员页面
		}
		else if(num!="") {
			newps=adminService.checkPassword(num);
			System.out.println(newps);
			if(newps.equals(ps))
			{
				System.out.println("登录成功");
				return "per/per";//登录成功跳到用户查询页面
			}
			System.out.println("xx");
		}
		else
			System.out.println("账号为空");
		return "login/mblogin";//登录失败重新跳到登录页面
	}
	@RequestMapping("/404")
    public String pageNotFount(){
        return "404";
    }
}

