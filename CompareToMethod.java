package lineComputation;

public class CompareToMethod {

	public static void main(String[] args) {
		 System.out.println("Welcome to Line Comparison Computation");
		  /*
		   * define the integer coordinate values 
		   */
		  Integer x1 = new Integer (1);
		  Integer x2 = new Integer (5);
		  Integer y1 = new Integer (1);
		  Integer y2 = new Integer (7);
		  /*
		   * Integer value is equal the other integer  (x1=y1) so, output is 0
		   */
		  System.out.println(x1.compareTo(y1));
		  /*
		   * Integer value is less than the other integer (x1<y2) so, output is −1
		   */
		  System.out.println(x2.compareTo(y2));
		  /*
		   * Integer value is less than the other integer (x2<y2) so, output is −1
		   */
		  System.out.println(y1.compareTo(y2));
		  /*
		   * Integer value is greater than the other integer (y1>y2) so, output is 1
		   */
		  System.out.println(y2.compareTo(x2));
	}

}
