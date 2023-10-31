package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		
		int number = 121, rem=0,temp,sum=0;
		temp = number;
		while(number>0)
		{
			rem=number%10;
			sum=(sum*10)+rem;
			number=number/10;
			
		}
		
		if(sum==temp) {
			System.out.println("Its a Palindrome");
		}
		else {
			System.out.println("Its not a Palindrome");
		}
	}

}
