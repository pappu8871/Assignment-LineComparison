package lineComparison;

import java.util.Scanner;

public class LineCompareUC1 {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.println(" Enter the value for first Line X1, X2, Y1, Y2 " );
		int x1 = scn.nextInt();
		int x2 = scn.nextInt();
		int y1 = scn.nextInt();
		int y2 = scn.nextInt();
	     
	    double line1 = Math.sqrt((x2 - x1) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ) );	 	    
       System.out.println(" Line1: " +line1);
}
}
