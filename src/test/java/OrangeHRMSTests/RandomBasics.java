package OrangeHRMSTests;

import java.util.Random;

public class RandomBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r =  new Random();
		
		int randomno= r.nextInt(10);
		// generate random no b/w o-9
		System.out.println("randomno="+randomno);
		

	}

}
