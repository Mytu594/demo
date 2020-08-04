package com.po;

public class Club {
	//协会编号 登录号
    private String id;
    //协会名
    private String name;
    //协会负责人
    private String man;
    //负责人电话
    private String tel;
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
	public String getMan() {
		return man;
	}
	public void setMan(String man) {
		this.man = man;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Club [id=" + id + ", name=" + name + ", man=" + man + ", tel=" + tel + "]";
	}

	

}
