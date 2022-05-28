package Week3.Day1;

public class Stduentsoverloading {
	
	public void getstudentinfo(int id)
	{
		int newid=id;
		
		System.out.println("the student id:"+newid);
		
	}
	
	public void getstudentinfo(String s,String e,int phno)
	{
		
		String name=s;
		String email=e;
		int ph=phno;
		
		System.out.println("the student name:"+name);
		System.out.println("the student email:"+email);
		System.out.println("the student ph:"+ph);
		
	}
	public static void main(String args[])

	{
		Stduentsoverloading s=new Stduentsoverloading();
		s.getstudentinfo(1);
		s.getstudentinfo("hari","Hari@gmail.com", 45328790);

		
		
	}
}
