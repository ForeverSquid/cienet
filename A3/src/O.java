
public class O {
	public int ok(){
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			System.out.println("1");
		}
		return 2;
	}
	public static void main(String[] args) {
		System.out.println(new O().ok());
	}
}
