package week2.day1;

public class IsPrime {
// A class name with IsPrime created
	
	public static void main(String[] args) {
		int number= 14,count=0;
		for(int i=1;i<=number;i++){
			if(number%i==0) {
				count++;
			}
		}
		if(count==2)
			{
				System.out.println("It is a prime Number");
			}
			else {
				System.out.println("It is a not prime Number");
			}

	}

}