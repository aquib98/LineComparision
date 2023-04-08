package lineComputation;
import java.lang.Math.*;
public class LengthOfLine {

	public static void main(String[] args) {
		 System.out.println("Welcome to Line Comparison Computation");
		 /*
		  * Defining and assigning the values to the coordinates(x1,y1) and (x2,y2)
		  */
		int x1 ,x2 ,y1 ,y2 ;
		double dis ;
		x1=2;
		x2=20;
		y1=1;
		y2=10;
		/*
		 * calculating the distance between two coordinates using math.sqrt 
		 * 
		 */
		dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Distance between "+" ("+x1+","+y1+") ,"+" ("+x2+","+y2+") is : " +dis);
	}

}
