
package com.demo.dto;

public class LeaveDto {
	private String leaveid;
	
	private String leaveappliedonstr;
	private String startdatestr;
	private String enddatestr;
	private String leavetype;
	private String leavereason;
	private int empno;
	public LeaveDto(String leaveid, String leaveappliedonstr, String startdatestr, String enddatestr, String leavetype,
			String leavereason, int empno) {
		super();
		this.leaveid = leaveid;
		this.leaveappliedonstr = leaveappliedonstr;
		this.startdatestr = startdatestr;
		this.enddatestr = enddatestr;
		this.leavetype = leavetype;
		this.leavereason = leavereason;
		this.empno = empno;
	}
	public LeaveDto() {
		super();
	}
	public String getLeaveid() {
		return leaveid;
	}
	public void setLeaveid(String leaveid) {
		this.leaveid = leaveid;
	}
	public String getLeaveappliedonstr() {
		return leaveappliedonstr;
	}
	public void setLeaveappliedonstr(String leaveappliedonstr) {
		this.leaveappliedonstr = leaveappliedonstr;
	}
	public String getStartdatestr() {
		return startdatestr;
	}
	public void setStartdatestr(String startdatestr) {
		this.startdatestr = startdatestr;
	}
	public String getEnddatestr() {
		return enddatestr;
	}
	public void setEnddatestr(String enddatestr) {
		this.enddatestr = enddatestr;
	}
	public String getLeavetype() {
		return leavetype;
	}
	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}
	public String getLeavereason() {
		return leavereason;
	}
	public void setLeavereason(String leavereason) {
		this.leavereason = leavereason;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	@Override
	public String toString() {
		return "LeaveDto [leaveid=" + leaveid + ", leaveappliedonstr=" + leaveappliedonstr + ", startdatestr="
				+ startdatestr + ", enddatestr=" + enddatestr + ", leavetype=" + leavetype + ", leavereason="
				+ leavereason + ", empno=" + empno + "]";
	}

	



}
	