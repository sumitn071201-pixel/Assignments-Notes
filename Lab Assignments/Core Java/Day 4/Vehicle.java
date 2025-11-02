import java.util.Date;

public class Vehicle {
	
	private int vid;
	private String oname;
	private String vtype;
	private Date dpurchase;
	
	public Vehicle() {
		vid=0;
		oname=null;
		vtype=null;
		dpurchase=null;
	}

	public Vehicle(int id, String nm, String type, Date dt) {
		vid = id;
		oname = nm;
		vtype = type;
		dpurchase = dt;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int id) {
	   vid = id;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String nm) {
		oname = nm;
	}

	public String getVtype() {
		return vtype;
	}

	public void setVtype(String type) {
		vtype = type;
	}

	public Date getDpurchase() {
		return dpurchase;
	}

	public void setDpurchase(Date dt) {
		dpurchase = dt;
	}

	public String toString() {
		return "id=" + vid + ", name=" + oname + ", type=" + vtype + ", date=" + dpurchase ;
	}
	
	
	
	
	

}
