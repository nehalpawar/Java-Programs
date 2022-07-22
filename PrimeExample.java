// Java Program to check whether the given number is prime or not:-

public class PrimeExample {
    
    public static void main(String[] args) {
    	int i, m=0, flag=0;
    	
    	int n = 3;
    	
    	if(n==0|n==1){
    		System.out.println("The Entered Number is not a Prime Numeber", n+);
    	}
    	else {
    		for(i=2;i<=m;i++){
    			if(n%i==0){
    				System.out.Println("The Entered Number is not Prime Number", n+);
    				flag = 1;
    				break;
    			}
    		}
    		if(flag==0){
    			System.out.prinln("The Entered Number is Prime Number");
    		}
    	}
    	
       
    }
}
