package array;
import java.util.Scanner;
public class Array {
	    public static void main(String[] args) {
	        
	    	//Declare Input Variables.
	        String userInputString;
	        int userInputInt = 0;
	        
	        //Get how many secrets they have. Includes a try and catch for invalid values.
	        System.out.println("Tell me all your little secrets.\nHow many secrets do you have?");
	        Scanner scanInput = new Scanner(System.in);
	        userInputString= scanInput.nextLine(); 
	        
	         try{
	        	 	userInputInt= Integer.parseInt(userInputString);
	        	 		if (userInputInt<=0){
	        	 			//Might be some unnecessary code in here, clearing values.
	        	 			userInputInt=0;
	        	 			userInputString="";
	        	 			System.out.println("Please enter a value greater than zero.\n");
	        	 			main(args);
	        	 			System.exit(1); //Very Important!!!
	        	 		}
	         	}
	        	catch(NumberFormatException e)	//Any formatting issues are handled here:
	        { 
	        		//Again, possibly don't need to clear these.
	        		userInputInt=0;
	        		userInputString="";
	        		System.out.println("Please enter an integer number instead:\n");
	        		main(args);
	        		System.exit(1);	//Very Important!!!
	        }
	         
	         // I declare the array here because I want to make sure the variables used
	         //are valid before assigning them to the array.
	        String[] anArray;
	        anArray = new String[userInputInt];
	        
	        //Getting the number of inputs from the user.
	        for(int i=0; i<userInputInt; i++){
	              System.out.println("Secret Number: " + (i+1));
	              anArray[i]= scanInput.nextLine();
	         }
	        
	        //Printing back out the inputs.
	        for(int z=0; z<userInputInt;z++){
	        System.out.println("Secret Number "+(z+1)+": " + anArray[z]);
	        }
	        
	        //Finishing up.
	        scanInput.close();
	        
	        System.out.println("\nThank you for telling me your secrets."
	        		+ " These personal secrets are now being uploaded "
	        		+ "to the NSA for further review.");
	    }
}
