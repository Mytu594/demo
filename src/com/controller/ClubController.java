package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.po.Club;
import com.service.ClubService;

@Controller
public class ClubController {
	@Autowired
	private ClubService clubService;
	//协会查询
	@RequestMapping("/clubquery")
	public String clubquery(String id,Model model) {
		Club club= clubService.findClubById(id);
		model.addAttribute("club", club);
		return "club/clublist";
	}
	
	//以下为管理员身份登录
	@RequestMapping("/clublist")
	public String clubList(Model model) {
		List<Club> list = clubService.findAllClub();
		model.addAttribute("clubList", list);
		return "club/clublist";
	}
	
	//添加
	@RequestMapping(value="/clubpreinsert",method=RequestMethod.GET)
	public String clubPreinsert() {
		return "club/clubadd";
	}
	@RequestMapping(value="/clubinsert", method=RequestMethod.POST)
	public String clubInsert(Club club){
		clubService.addClub(club);
		return "redirect:clublist";
	}
	
	//删除
	@RequestMapping(value="/clubdelete", method=RequestMethod.POST)
	public String clubDelete(String[] idArray) {
		clubService.deleteClubs(idArray);
		return "redirect:clublist";
	}
	
	//更新
	@RequestMapping(value="/clubpreupdate", method=RequestMethod.GET)
	public String clubPreupdate(Club club, Model model) {
		model.addAttribute("club", club);
		return "club/clubupdate";
	}
	@RequestMapping(value="/clubupdate", method=RequestMethod.POST)
	public String clubUpdate(Club club) {
		clubService.updateClub(club);
		return "redirect:clublist";
	}
}
