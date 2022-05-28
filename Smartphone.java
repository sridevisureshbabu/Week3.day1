package Week3.Day1;

 class Smartphone extends Androidphone{
	
	 public void connwhtsapp()
	 {
		 System.out.println("connectwhatsapp");
	 }

	 public static void main(String args[])
	 {
		 Smartphone s= new Smartphone();
		 s.makeCall();
		 s.sendmsg();
		 s.savecontact();
		 s.takevideo();
		 s.connwhtsapp();
		 
	 }
}
