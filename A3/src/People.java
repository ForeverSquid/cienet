
public class People {
	private int old;
	public int getOld(){
		return old;
	}
	public void setOld(int old1){
		if(old1>60){
			old=18;
		}else{
			old=old1;
		}
		
	}
	
}
