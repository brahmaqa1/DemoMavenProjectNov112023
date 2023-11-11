package ExtentReportsBasics;

public class uncommonValinArray {

	public static void main(String[] args) {
		
		 int[] arr2 = {1, 2, 3, 1, 2, 3};
	     int[] arr1 = {1, 2, 1, 2, 3, 4, 3};
	     System.out.println("arr2 length="+ arr2.length);//7
	     boolean valfound= false;
	     int uncommonval = 0 ;
	     
	     for(int i=0;i<=arr2.length-1;i++)
	     { //        0<=7
//	    	 System.out.println("arr2 vals="+arr2[i]);
	    	for(int j=0;j<=arr1.length-1;j++)
	    	{
//	    		System.out.println("vals from arr1="+arr1[j]);
	    		if(arr1[i] == arr2[j])
	    		{
	    			System.out.println("common val="+ arr2[i]);	    			
	    			valfound= true;
	    			
	    			break;
	    		}
	    		else
	    		{
	    			
	    		}		
	    		   	
	    	}
	    	
	    	 
		     if(valfound == true )
		     {
		    	 
		     }
		     else
		     {
		    	 System.out.println("uncommon val="+uncommonval);
		     }
	    	System.out.println("***********");
	     }
	    
	        
	        
	}

}
