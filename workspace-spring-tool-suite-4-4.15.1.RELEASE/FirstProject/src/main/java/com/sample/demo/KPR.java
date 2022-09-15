package com.sample.demo;

import org.springframework.stereotype.Component;

@Component
public class KPR {
	private int totdept;
	private int deptid;
	private String deptname;
	public int getTotdept() {
		return totdept;
	}
	public void setTotdept(int totdept) {
		this.totdept = totdept;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		setDeptname("CSE");
		setTotdept(7);
		setDeptid(03);
		return "KPR [totdept=" + totdept + ", deptid=" + deptid + ", deptname=" + deptname + "]";
	}
	public KPR() {
		super();
		System.out.println(toString());
	}
	public void show() {
		System.out.println("I'm in KPR college...");
	}
}
