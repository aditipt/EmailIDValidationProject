package pack1;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
	System.out.println("Program Started");
	System.out.println("-------Email Id Validation-------");
	Scanner sc1 = new Scanner(System.in);
	String[] arr1 = {"aditi@gmail.com","ayush98@gmail.com","arrya@gmail.com","aditi98@gmail.com"
			          ,"akanksha@gmal.com" , "nikita@gmail.com" , "pinku@gmail.com", 
			          "priya@gail.com" , "piyu@gmail.com"};
	
	System.out.println("Enter the email : ");
	String email = sc1.next();
	boolean val = false;
    for(int i = 0;i<=arr1.length-1;i++) {
    	
    	if(email.equals(arr1[i])) {
    		
    		System.out.println("Email id is Verified " + email);
    		val = true;
    		break;
    	}
    	
    }
    
    if(val==false) {
    	
    	System.err.println("Please Enter correct Email Id !!!!!");
    }
    
	sc1.close();
	System.out.println("Program Ended");

	}

}
