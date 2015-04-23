/**
 * 
 */
package com.weikun.IOC1;

/**
 * @author ����
 * 2008-03-28
 *
 */
public class JavaTrad  {
	private Teacher teacher;
	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(Teacher teacher) {//
		this.teacher = teacher;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void javaCourse(){
		this.teacher.teach("Spring ICO讲解");		
	}
	public JavaTrad() {
		
		
	}
	public JavaTrad(Teacher teacher) {
		super();
		this.teacher = teacher;
	}
	
	

}
