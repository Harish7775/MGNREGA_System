package com.mgnrega.bean;

public class EmpDTO {

	private String ename;

	private String emobile;

	private String eaddress;

	private int etotaldaywork;

	private int ewages;

	private String pname;

	public EmpDTO() {

		// TODO Auto-generated constructor stub
	}

	public EmpDTO(String ename, String emobile, String eaddress, int etotaldaywork, int ewages, String pname) {
		super();
		this.ename = ename;
		this.emobile = emobile;
		this.eaddress = eaddress;
		this.etotaldaywork = etotaldaywork;
		this.ewages = ewages;
		this.pname = pname;
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

	public int getEwages() {
		return ewages;
	}

	public void setEwages(int ewages) {
		this.ewages = ewages;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "EmpDto [ename=" + ename + ", emobile=" + emobile + ", eaddress=" + eaddress + ", etotaldaywork="
				+ etotaldaywork + ", ewages=" + ewages + ", pname=" + pname + "]";
	}

}
