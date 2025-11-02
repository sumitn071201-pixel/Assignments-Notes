public class TestBook {

	public static void main(String[] args) {
		Book b1=new Book();
	    Book.Lesson l1=b1.new Lesson();
//		System.out.println(b1);
		l1.m1();
		Book b2=new Book(34,"testing",l1);
		b2.getL1().m1();
	}
}