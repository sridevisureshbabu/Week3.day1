package org.student;

import org.college.College;
//import org.student.*;
import org.department.Department;

public class Student extends Department{
	public void stname()
	
	{
        String s="Raj";
		System.out.println("The student name:"+s);
				
	}
	public void stdept()
	{
		String d="B.E";
		System.out.println("The Student Dept:" +d);
	}
		

	public void stid()
	{
		int n=100;
		System.out.println("The Student id:"+n);
		
		
	}
	public static void main (String args[])
	{
		
		College c=new College();
		c.collegename();
		c.collegecode();
		c.collegerank();
		Student st=new Student();
		st.deptname("We have various Dept");
		st.stname();
		st.stdept();
		st.stid();
		
		
	}
}
	
