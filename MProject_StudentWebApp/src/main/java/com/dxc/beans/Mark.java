package com.dxc.beans;

public class Mark {

	String examid;
	int id;
	int sub1;
	int sub2;
	int sub3;
	public Mark() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mark(String examid, int studentid, int sub1, int sub2, int sub3) {
		super();
		this.examid = examid;
		this.id = id;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public String getExamid() {
		return examid;
	}
	public void setExamid(String examid) {
		this.examid = examid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	@Override
	public String toString() {
		return "Mark [examid=" + examid + ", id=" + id + ", sub1=" + sub1 + ", sub2=" + sub2
				+ ", sub3=" + sub3 + "]";
	}
}
