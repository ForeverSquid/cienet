import java.io.Serializable;


public class N extends N1{
	public static void main(String[] args) {
		N n=new N();
		
		N n1=n;
		System.out.println(n);
		System.out.println(n1);
		
	//	System.out.println(n==n1?true:false);
	}
	

	@Override
	protected void bark() {
		// TODO Auto-generated method stub
		super.bark();
	}
	
}
//private (default) protected  public  
class N1{
	void bark(){
		
	}
}
