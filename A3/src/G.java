
public class G extends H {
	G(){
		System.out.println("G");
	}
	public static void main(String[] args) {
		new G();
	}
	
} 
class H extends I{
	H(){
		System.out.println("H");
	}
	
}
class I {
	I(){
		System.out.println("I");
	}
	
}
