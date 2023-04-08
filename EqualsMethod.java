package lineComputation;

public class EqualsMethod {

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
		   * comparing the integer values using equals method
		   */
		System.out.println("x1==x2 : " +x1.equals(x2));
		System.out.println("x1==y1 : " +x1.equals(y1));
		System.out.println("y1==y2 : " +y1.equals(y2));
		System.out.println("y1==x2 : " +y1.equals(x2));
		 
	}

}
