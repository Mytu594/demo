package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.po.Activity;
import com.service.ActService;

@Controller
public class ActController {
	@Autowired
	private ActService actService;
	//成员活动查询
	@RequestMapping("/actquery")
	public String actquery(String id,Model model) {
		Activity act= actService.findActById(id);
		model.addAttribute("act", act);
		return "per/act";
	}
	
	//以下为管理员身份登录
	@RequestMapping("/actlist")
	public String actList(Model model) {
		List<Activity> list = actService.findAllAct();
		model.addAttribute("actList", list);
		return "activity/actlist";
	}
	
	//添加
	@RequestMapping(value="/actpreinsert",method=RequestMethod.GET)
	public String actPreinsert() {
		return "activity/actadd";
	}
	@RequestMapping(value="/actinsert", method=RequestMethod.POST)
	public String actInsert(Activity act){
		actService.addAct(act);
		return "redirect:actlist";
	}
	
	//删除
	@RequestMapping(value="/actdelete", method=RequestMethod.POST)
	public String actDelete(String[] idArray) {
		actService.deleteActs(idArray);
		return "redirect:actlist";
	}
	
	//更新
	@RequestMapping(value="/actpreupdate", method=RequestMethod.GET)
	public String actPreupdate(Activity act, Model model) {
		model.addAttribute("act", act);
		return "activity/actupdate";
	}
	@RequestMapping(value="/actupdate", method=RequestMethod.POST)
	public String actUpdate(Activity act) {
		actService.updateAct(act);
		return "redirect:actlist";
	}
}
