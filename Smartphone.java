package Week3.Day1;

 public class Smartphone extends Androidphone{
	
	 public void connwhtsapp()
	 {
		 System.out.println("connectwhatsapp");
	 }
	 
	 public void takevideo()
	 {
	 	System.out.println("Take video from child class");
	 }

	 public static void main(String args[])
	 {
		 Smartphone s= new Smartphone();
		 Androidphone a=new Androidphone();
		 s.makeCall();
		 s.sendmsg();
		 s.savecontact();
		 s.takevideo();
		 a.takevideo();
		 
		 s.connwhtsapp();
		 
	 }
}
