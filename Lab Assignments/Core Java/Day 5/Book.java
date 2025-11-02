
public class Book {
	private int bid;
	private String bname;
	 Lesson l1;
	public class Lesson{
		private int lid;
		private String lname;
		public Lesson() {
		}
		public Lesson(int lid, String lname) {
			this.lid = lid;
			this.lname = lname;
		}
		
		public void m1() {
			   System.out.println("in m1 method of lesson");
			   
		   }
		
	}
	public Book() {
	}
	public Book(int bid, String bname, Lesson l1) {
		this.bid = bid;
		this.bname = bname;
		this.l1 = l1;
	}
	public Lesson getL1() {
		return l1;
	}
	
	public String toString() {
		   return bid+","+bname;
	   }
	
	
	

}
