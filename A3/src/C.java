import java.util.Date;


public class C {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		modify(d);
		System.out.println(d);
	}

	private static void modify(Date d) {
		// TODO Auto-generated method stub
		d.setYear(113);
		
		System.out.println(d);
		
	}
	
	
}
