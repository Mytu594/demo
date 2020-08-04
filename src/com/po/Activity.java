package com.po;

public class Activity {
	//活动编号
    private String id;
    //活动名
    private String name;
    //活动时间
    private String time;
    //活动时长
    private Integer credit;
    //活动所属协会
    private String belong;
    //活动类别
    private String type;
    //活动地点
    private String place;
    //活动总招收人数
    private Integer amount;
    //活动简介
    private String detail;
    //活动已选人数
    private Integer selected;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getCredit() {
		return credit;
	}
	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	public String getBelong() {
		return belong;
	}
	public void setBelong(String belong) {
		this.belong = belong;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Integer getSelected() {
		return selected;
	}
	public void setSelected(Integer selected) {
		this.selected = selected;
	}
	@Override
	public String toString() {
		return "Activity [id=" + id + ", name=" + name + ", time=" + time + ", credit=" + credit + ", belong=" + belong
				+ ", type=" + type + ", place=" + place + ", amount=" + amount + ", detail=" + detail + ", selected="
				+ selected + "]";
	}
	
}
