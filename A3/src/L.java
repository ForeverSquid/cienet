
public class L extends L1{
	L(){
		super(100);
	}
	public static void main(String[] args) {
		new L();
	}
}
class L1{
	L1(){
		System.out.println("ok");
	}
	L1(int old){
		System.out.println(100);
	}
}
