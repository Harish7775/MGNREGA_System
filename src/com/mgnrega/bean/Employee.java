package com.mgnrega.bean;

public class Employee {

	private int eid;

	private String ename;

	private String emobile;

	private String eaddress;

	private int etotaldaywork;

	private String ewages;

	public Employee() {
		// super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String emobile, String eaddress, int etotaldaywork, String ewages) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.emobile = emobile;
		this.eaddress = eaddress;
		this.etotaldaywork = etotaldaywork;
		this.ewages = ewages;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmobile() {
		return emobile;
	}

	public void setEmobile(String emobile) {
		this.emobile = emobile;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public int getEtotaldaywork() {
		return etotaldaywork;
	}

	public void setEtotaldaywork(int etotaldaywork) {
		this.etotaldaywork = etotaldaywork;
	}

	public String getEwages() {
		return ewages;
	}

	public void setEwages(String ewages) {
		this.ewages = ewages;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", emobile=" + emobile + ", eaddress=" + eaddress
				+ ", etotaldaywork=" + etotaldaywork + ", ewages=" + ewages + "]";
	}

}
