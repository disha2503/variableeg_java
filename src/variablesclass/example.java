package variablesclass;
import java.util.*;
public class example {



	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		int operator = sc.nextInt();
		/**
		* 1 -> +
		* 2 -> -
		* 3 -> *
		* 4 -> /
		* 5 -> %
		*/
		switch(operator) {
		case 1 : System.out.println("Jan");
		break;
		case 2 : 
			 System.out.println("Feb");
		break;
		case 3 : System.out.println("March");
		break;
		case 4 : 
		System.out.println("apr");
		
		break;
		case 5 : 
		System.out.println("may");
	    break;
		case 6 : 
			System.out.println("jun");
			break;
		default : System.out.println("Invalid Operator");
		}
		}


}
