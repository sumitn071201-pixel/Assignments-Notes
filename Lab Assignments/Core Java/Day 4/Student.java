import java.util.Date;

public class Student {
	
	private int id;
	private String name;
	private float m1;
	private float m2;
	private Date bdate;
	
	public Student() {
		id=0;
		name=null;
		m1=0.0f;
		m2=0.0f;
		bdate=null;
	}

	public Student(int id, String name, float m1, float m2, Date bdate) {
	
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.bdate = bdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getM1() {
		return m1;
	}

	public void setM1(float m1) {
		this.m1 = m1;
	}

	public float getM2() {
		return m2;
	}

	public void setM2(float m2) {
		this.m2 = m2;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String toString() {
		return "id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", bdate=" + bdate ;
	}
	
	
	
	
	
	

}
