
public class Truck {
	int speed;
	public int getSpeed(){
		
		return speed;
	}
	public void setSpeed(int speed1){
		if(speed1>60){
			speed=40;
		}else{
			speed=speed1;
			
		}
		
	}
}
