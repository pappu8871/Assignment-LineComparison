package lineComparison;

import java.util.Scanner;

class LineCompareUC3 {

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
	     
	    Double line1 =  Math.sqrt((x2 - x1) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ) );	 
	     System.out.println(" Line1: " +line1);
	     
	    Double line2 =  Math.sqrt((a2 - a1) * ( a2 - a1 ) + ( b2 - b1 ) * ( b2 - b1 ) );	 
	     System.out.println(" Line2: " +line2);
	     
	     int compareValue = line1.compareTo(line2);
         if (compareValue == 0)
             System.out.println("line1 and line1 are equal");
         else if (compareValue < 0)
             System.out.println("lines1 is less than lines2");
         else
             System.out.println("lines1 is greater than lines2");
	}
	}

