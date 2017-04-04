package CS151.HW1;


public class V2 {
    // TODO add other methods here
		private double a;
		private double b;
	
	public V2 (double a, double b){
		this.a = a;
		this.b = b;
		}
	public String toString(double a,double b ){
		String v1 = Double.toString(a);
		String v2 = Double.toString(b);
		String add = "(" + v1 + "," + v2 + ")";
		return add;
	}
	public double getA(){
		return a;
		}
	public double getB(){
		return b;
	}
	public String add(V2 other) {
		double a = this.a + other.a;
		double b = this.b + other.b;
		String sum = toString(a,b);
		return sum;
	}
	
		public String multiply(double scalar) {
			double a = this.a * scalar;
			double b = this.b * scalar;
			String multi = toString(a, b);
			return multi;
		}
		public double getMagnitude() {
			double mag = Math.sqrt((a * a) + ( b* b));
			return mag;
		}

		/**
		 * compare the magnitude between two V2
		 * 
		 * @param other
		 *            is the second V2
		 * @return true or false if the magnitude between the V2 is the same or
		 *         difference
		 */
		public boolean equals(V2 second) {
			// TODO add code to actually compare the magnitudes here.
			if (this.getMagnitude() == second.getMagnitude()) {
				return true;
			}
			return false;
		}

		public static void main(String[] args) {
			V2 test = new V2(1.1, 1.2);
			V2 test2 = new V2(2.0, 1.0);
			V2 test3 = new V2(1.1, 1.2);
			
			System.out.println("x: " + test.getA());
			System.out.println("y: " +  test.getB());
			System.out.println("sum: " + test.add(test2));
			System.out.println("multiply: " + test.multiply(2));
			System.out.println("magnitude: " + test.getMagnitude());
			System.out.println("equal: " + test.equals(test3));
		}
	}
    
