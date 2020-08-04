package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.po.Mb;
import com.service.MbService;

@Controller
public class MbController {
	@Autowired
	private MbService mbService;
	
	@RequestMapping("/query")
	public String query(String id,Model model) {
		Mb mb= mbService.findMemberById(id);
		model.addAttribute("mb", mb);
		return "member/mblist";
	}
	
	//个人更新
	@RequestMapping(value="/permbupdate", method=RequestMethod.GET)
	public String perMbupdate(Mb mb, Model model) {
		model.addAttribute("mb", mb);
		return "member/mbupdate";
	}
	@RequestMapping(value="/perupdate", method=RequestMethod.POST)
	public String Update(Mb mb) {
		mbService.updateMember(mb);
		return "redirect:mblist";
	}
	
	//以下为管理员身份登录
	@RequestMapping("/mblist")
	public String mbList(Model model) {
		List<Mb> list = mbService.findAllMember();
		model.addAttribute("mbList", list);
		return "member/mblist";
	}
	
	//添加
	@RequestMapping(value="/mbpreinsert",method=RequestMethod.GET)
	public String mbPreinsert() {
		return "member/mbadd";
	}
	@RequestMapping(value="/mbinsert", method=RequestMethod.POST)
	public String mbInsert(Mb mb){
		mbService.addMember(mb);
		return "redirect:mblist";
	}
	
	//删除
	@RequestMapping(value="/mbdelete", method=RequestMethod.POST)
	public String mbDelete(String[] idArray) {
		mbService.deleteMembers(idArray);
		return "redirect:mblist";
	}
	
	//更新
	@RequestMapping(value="/mbpreupdate", method=RequestMethod.GET)
	public String mbPreupdate(Mb mb, Model model) {
		model.addAttribute("mb", mb);
		return "member/mbupdate";
	}
	@RequestMapping(value="/mbupdate", method=RequestMethod.POST)
	public String actUpdate(Mb mb) {
		mbService.updateMember(mb);
		return "redirect:mblist";
	}
}
