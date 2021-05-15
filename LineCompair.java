package lineComparison;

import java.util.Scanner;

public class LineCompareUC2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println(" Enter the value for first Line X1, X2, Y1, Y2 " );
		int x1 = scn.nextInt();
		int x2 = scn.nextInt();
		int y1 = scn.nextInt();
		int y2 = scn.nextInt();
		
		System.out.println(" Enter the value for first Line a1, a2, b1, b2 " );
		int a1 = scn.nextInt();
		int a2 = scn.nextInt();
		int b1 = scn.nextInt();
		int b2 = scn.nextInt();
	     
	     double line1 = Math.sqrt((x2 - x1) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ) );	 
	     System.out.println(" Line1: " +line1);
	     
	     double line2 = Math.sqrt((a2 - a1) * ( a2 - a1 ) + ( b2 - b1 ) * ( b2 - b1 ) );	 
	     System.out.println(" Line2: " +line2);
	     
	     if (line1 == line2) {
         	System.out.println("Both lines are equals");
         }
         else 
           System.out.println("lines are not equals");
	     
}
}
