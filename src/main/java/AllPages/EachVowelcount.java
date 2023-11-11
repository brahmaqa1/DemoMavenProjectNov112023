package AllPages;

public class EachVowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Education a";
		 // E   a =  
	        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

	        // Convert the string to lowercase to make it case-insensitive
	        str = str.toLowerCase();
	        
	        String consStr = "";

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            
	            
	            if (c == 'a') {
	                countA =  countA +1;
	            } else if (c == 'e') {
	                countE =  countE + 1;
	            } else if (c == 'i') {
	                countI++;
	            } else if (c == 'o') {
	                countO++;
	            } else if (c == 'u') {
	                countU++;
	            }
	            else
	            {
//	            	consStr = consStr+  eachchar; 
	            	//        "d"  + c
	            	//          "dc"
	            	//
	            	System.out.print(c);
	            }
	        }

	        System.out.println("A: " + countA);
	        System.out.println("E: " + countE);
	        System.out.println("I: " + countI);
	        System.out.println("O: " + countO);
	        System.out.println("U: " + countU);


	}

}
