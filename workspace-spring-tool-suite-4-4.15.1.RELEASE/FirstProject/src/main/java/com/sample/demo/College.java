package com.sample.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	private String cname;
	private int totdept;
	private int deptid;
	private String deptname;
	@Autowired
	private KPR kpriet;
	
	public KPR getKpriet() {
		return kpriet;
	}
	public void setKpriet(KPR kpr) {
		this.kpriet = kpr;
	}
	
	
	public College() {
		super();
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
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
		
		return "College [cname=" + cname + ", totdept=" + totdept + ", deptid=" + deptid + ", deptname=" + deptname
				+ "]";
	}
	public void display() {
		System.out.println("College details");
		kpriet.show();
	}

	
}
