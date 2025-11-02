
public class Person {
	private int pid;
	private String pname;
	static int cnt;
	static {
		cnt=0;
	}
	private final int c;
	
	public Person(){
		cnt++;
		pid=cnt;
		c=10;
	}

	public Person( String pname) {
		cnt++;
		pid=cnt;
		c=10;
		this.pname = pname;
	
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public static int getCnt() {
		return cnt;
	}

	public int getC() {
		return c;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public static void setCnt(int cnt) {
		Person.cnt = cnt;
	}

	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", c=" + c + "]";
	}
	
	
	
	
	

}
