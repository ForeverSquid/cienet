public class M extends M1{	//451263
	static int  age=200;
	static{
		
		System.out.println("7");		
	}
	{		System.out.println("1");
		age=555;
	}	
	M(){System.out.println("2");
	}	
	public void ok(){
		System.out.println("6");
	}
	public static void main(String[] args) {
		M m=new M();
		m.ok();
		System.out.println(3);
	}
}
class M1 extends Object {
	static{	System.out.println("8");		
	}
	{	System.out.println("4");
	}
	M1(){
		System.out.println(5);
	}
}
