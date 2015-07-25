
public class E {
	private Hand h;//private int old;
	private Computer c;
	E(){
		h=new Hand();//Composite
	}
	
	public void saveComputer(){
		
		c=new Computer();//Aggregation
	}
	public static void main(String[] args) {
		E e=new E();
		e.h.setColor("¹ÅÍ­É«");
		System.out.println(e.h.getColor());
		
		
		E e1=new E();
		
		e1.saveComputer();
		e1.c.setBrand("Dell");
		System.out.println(e1.c.getBrand());
		
	}

}

class Hand{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
class Computer{
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}