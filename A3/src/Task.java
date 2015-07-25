public class Task {
	private int old;
	private String name;
	private char sex;
	private String sch;
	private String grade;

	public void setOld(int old1){
		old1=18;
		old=old1;
	}
	int getOld(){
		return old;
	}
	public void setName(String name1){
		name=name1;
	}
	String getName(){
		return name;
	}
	public void setSex(char Female){
		sex=Female;
	}
	char getSex(){
		return sex;
	}
	public void setSch(String sch1){
		sch1="哈理工";
		sch=sch1;

	}
	String getSch(){
		return sch;
	}
	public void setGrade(String grade1){
		grade1="二年级";
		grade=grade1;

	}
	String getGrade(){
		return grade;

	}	

}
