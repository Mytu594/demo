package com.po;

public class Mb {
	//会员编号
    private String id;
    //会员姓名
    private String name;
    //会员性别
    private char sex;
    //会员籍贯
    private String mbnative;
    //会员专业
    private String major;
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
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getMbnative() {
		return mbnative;
	}
	public void setMbnative(String mbnative) {
		this.mbnative = mbnative;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Mb [id=" + id + ", name=" + name + ", sex=" + sex + ", mbnative=" + mbnative + ", major=" + major + "]";
	}

}
