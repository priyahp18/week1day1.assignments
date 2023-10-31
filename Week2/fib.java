package week2.day1;

public class fib {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0,y=1,z,count=10;
		System.out.print(x+" "+y);
		 
		
		for(int i=0;i<count;i++)
		{
			z = i+1;
			z=x+y;
			System.out.print("  "+z);
		    x=y;
			y=z;
			}
			
			
	}

}
