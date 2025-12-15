//xyz company needs a web app for employee leave management. this app is for employees to apply leave and veiw the leave history. other functionalities are out of scope.
//
//arch: MVC
//Table script:
//CREATE table leavedeteails (
//leave_id varchar(10) auto primary key ,
//leave_applied_on date,
//start_date date,
//end_date date,
//leave_type varchar(25),
//leave_reason varchar(25),
//empno int(6));
//1. develop a home page which displays the following functionalities
//2. (assume loginmodule is already developed)
//the following should be visible on the web page: 
//Home page (center align and then a line separating main page and the title)
//XYZ company leave processing application(text after the border)
//apply leave(link btn)
//view leave history(link btn)
//3. on clicking link apply leave the following should appear:
//Apply leave page(text)
//empno and input field
//start date input field wth yyyy/mm/dd format
//end date input with same format
//leave type and drop box with 2 options (1. earned leave. 2.loss of pay)
//leave reason dropbox with 4 options (1.Personal. 2.sick. 3.ritual. 4.out of station)
//apply leave button
//all fields are required and no validations for date required
//
//4. on clicking the apply button after filling all fields insert the record in leavedetails table
//a. maintain sequence for leave id(taht means make the leave id column auto incr)
//b."leave applied on " should be current date(means blur out all the dates except for the current date so user cant select any other date?)




package com.demo.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;


public class leaveApplication {
	private String leaveid;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate leaveappliedon;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate startdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate enddate;
	private String leavetype;
	private String leavereason;
	private int empno;
	
	public leaveApplication() {
		super();
	}
	//did not take the leave id coz it will be generated automatically
	public leaveApplication( LocalDate leaveappliedon, LocalDate startdate, LocalDate enddate,
			String leavetype, String leavereason, int empno) {
		super();
		
		this.leaveappliedon = leaveappliedon;
		this.startdate = startdate;
		this.enddate = enddate;
		this.leavetype = leavetype;
		this.leavereason = leavereason;
		this.empno = empno;
	}

	public String getLeaveid() {
		return leaveid;
	}

	public void setLeaveid(String leaveid) {
		this.leaveid = leaveid;
	}

	public LocalDate getLeaveappliedon() {
		return leaveappliedon;
	}

	public void setLeaveappliedon(LocalDate leaveappliedon) {
		this.leaveappliedon = leaveappliedon;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	public LocalDate getEnddate() {
		return enddate;
	}

	public void setEnddate(LocalDate enddate) {
		this.enddate = enddate;
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
		return "leaveApplication [leaveid=" + leaveid + ", leaveappliedon=" + leaveappliedon + ", startdate="
				+ startdate + ", enddate=" + enddate + ", leavetype=" + leavetype + ", leavereason=" + leavereason
				+ ", empno=" + empno + "]";
	}
	
	



}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
