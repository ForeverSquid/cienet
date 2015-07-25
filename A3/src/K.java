
public class K extends K1 {
	public static void main(String[] args) {
		 new K().ok();
		
	}
	public void ok(){
	
		super.plan();
	}
	
	
	public K1 plan1(){
		
		System.out.println("s-plan");
		return new K1();
	}
}
class K1 extends K0{
	public void plan(){
		super.plan();
		System.out.println("f-plan");
	}
	
	
}
class K0{
	public void plan(){
		System.out.println("g-plan");
	}
	
}
