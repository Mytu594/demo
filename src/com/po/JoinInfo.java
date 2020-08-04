package com.po;

public class JoinInfo {
	//选课信息编号
    private String join_id;
    //会员id
    private String mb_id;
    //会员姓名
    private String mb_name;
    //会员专业
    private String mb_major;
    //活动编号
    private String act_id;
    //活动名
    private String act_name;
    //活动所属协会
    private String act_belong;
    //活动时长
    private Integer act_credit;
    //活动时间
    private String act_time;
    
	public String getJoin_id() {
		return join_id;
	}
	public void setJoin_id(String join_id) {
		this.join_id = join_id;
	}
	public String getMb_id() {
		return mb_id;
	}
	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}
	public String getMb_name() {
		return mb_name;
	}
	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}
	public String getMb_major() {
		return mb_major;
	}
	public void setMb_major(String mb_major) {
		this.mb_major = mb_major;
	}
	public String getAct_id() {
		return act_id;
	}
	public void setAct_id(String act_id) {
		this.act_id = act_id;
	}
	public String getAct_name() {
		return act_name;
	}
	public void setAct_name(String act_name) {
		this.act_name = act_name;
	}
	public String getAct_belong() {
		return act_belong;
	}
	public void setAct_belong(String act_belong) {
		this.act_belong = act_belong;
	}
	public Integer getAct_credit() {
		return act_credit;
	}
	public void setAct_credit(Integer act_credit) {
		this.act_credit = act_credit;
	}
	public String getAct_time() {
		return act_time;
	}
	public void setAct_time(String act_time) {
		this.act_time = act_time;
	}
	@Override
	public String toString() {
		return "JoinInfo [join_id=" + join_id + ", mb_id=" + mb_id + ", mb_name=" + mb_name + ", mb_major=" + mb_major
				+ ", act_id=" + act_id + ", act_name=" + act_name + ", act_belong=" + act_belong + ", act_credit="
				+ act_credit + ", act_time=" + act_time + "]";
	}
	
}
