package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		Mobile details = new Mobile();
		details.makeCall();
		details.sendMsg();
		System.out.println("This is my mobile");
	}

	public void makeCall() {
		String mobileModel = "Samsung" ;
		float mobileWeight = 11.66f;
		System.out.println("mobileModel: " +mobileModel);
		System.out.println("mobileWeight: " +mobileWeight);
		
	}
	public void sendMsg() {
		boolean FullCharge = true;
		int mobileCost = 23000;
		System.out.println("FullCharge: " +FullCharge);
		System.out.println("mobileCost: " +mobileCost);
		
	}
}
