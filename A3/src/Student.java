
public class Student {
	public static void main(String[] args) {
		//实例化 new
		Student s=new Student();
		
		s.setName("ROSE");
		
		System.out.println(s.getName());
		
		Student s1=s;
		
		s1.setName("JACK");
		System.out.println(s.getName());
		
		
		
		
	}
	Student(){//默认构造器 default constructor
		
		
	}
	Student(int old){
		
	}
	Student(String name1){//non default constructor
		name=name1;
		
	}
	
	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	
	int old;
	String name;//json murphy
	String no;//int no
	char sex;
	//edit/update
	void setName(String name1){
		name=name1;
	}
	String getName(){
		
		return name;
	}
	

}
