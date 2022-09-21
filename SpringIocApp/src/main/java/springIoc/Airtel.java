package springIoc;

public class Airtel implements Sim
{
	public Airtel() {System.out.println("Airtel object created..");}
	
	public void calling()
	{
		System.out.println("Calling using Airtel Sim");
	}
	public void data() {
		System.out.println("Browsing using Airtel Sim");
	}
}
