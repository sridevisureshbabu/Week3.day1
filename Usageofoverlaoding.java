package Week3.Day1;

public class Usageofoverlaoding {
	
	public void add(int num1,int num2)
	
	{
	int n1=num1;
	int n2=num2;
	int res=n1+n2;
	System.out.println("After adding 2 numbers"+res);
	}
	
public void sub(int num1,int num2)
	
	{
	int n1=num1;
	int n2=num2;
	int res=n1-n2;
	System.out.println("After subtracting 2 integer numbers"+res);
	}
public void mul(int num1,int num2)

{
int n1=num1;
int n2=num2;
int res=n1*n2;
System.out.println("After Multiplication 2 integer numbers"+res);
}

public void mul(int num1,double num2)

{
int n1=num1;
double n2=num2;
double res=n1*n2;
System.out.println("After Multiplication of doubl eand integer numbers"+res);
}
public void sub(double num1,double num2)

{
double n1=num1;
double n2=num2;
double res=n1-n2;
System.out.println("After subtracting 2 integer numbers"+res);
}
	
public void add(int num1,int num2,int num3)
	
	{
	int n1=num1;
	int n2=num2;
	int n3=num3;
	int res=n1+n2+n3;
	System.out.println("After adding 3 numbers:"+res);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usageofoverlaoding l=new Usageofoverlaoding();
		l.add(2,3);
		l.add(3,5,6);
		l.sub(6, 3);
		l.sub(5.5,2.2);
		l.mul(6,6);
		l.mul(2,3.1);
		
		
			
		
		
		
	}
	}
	
		
		
