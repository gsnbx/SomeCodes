class FibonacciSeries {
	public static void main(String args[]) {

		int n = 30;
		int a = -1, b=1, c = 0;
		for(int i=0; i<10; i++) {
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}