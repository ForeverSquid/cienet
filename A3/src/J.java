
public class J {
	J(){
		System.out.println(300);
	}
	J(int old){
		this();
		System.out.println(200);
		
		
	}
	public static void main(String[] args) {
		J j=new J(100);
		
	}
	private String name;
	public void setName(String name){
		
		this.name=name;
	}
	public static void ok(){
		
	}
	public String getName(){
		
		return this.name;
	}
	
}
