package Com.TDDHFC;

import java.util.Scanner;

public class HCF {
	 public static void main(String[] args) {
		  
		    int hcf = 1;
		    int temp;
		    Scanner scanner =new Scanner(System.in);
			System.out.println("Enter two Number  ");
			int x=scanner.nextInt();
			int y=scanner.nextInt();
		    if (x > y) {
		      temp = x;
		      x = y;
		      y = temp;
		    }

		    for(int i = 1; i < (x+1); i++) {
		      if (x%i == 0 && y%i == 0)
		        hcf = i;
		    }

		    System.out.println("HCF of "+ x +" and "+ y +" is: "+ hcf);
		  }
		}
