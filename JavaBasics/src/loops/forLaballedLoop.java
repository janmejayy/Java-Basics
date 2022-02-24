package loops;

public class forLaballedLoop {
	public static void main(String[] args) {  
	    //Using Label for outer and for loop  
	    outerloop:  
	        for(int i=1;i<=3;i++){  
	            innerloop:  
	                for(int j=1;j<=3;j++){  
	                    if(i==2&&j==2){  
	                        break innerloop; 
	                        
	                    }  
	                    System.out.println(i+" "+j);  
	                } 
	        }  
	}  

}
