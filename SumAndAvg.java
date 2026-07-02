import java.util.Scanner;
class SumAndAvg {
	public static void main(String args[]) {

		System.out.println("Enter num:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum = 0;

		for(int i=0; i<=num; i++) {
			sum += i;
		}
		System.out.println("Sum = "+sum);
		System.out.println("Avg = "+(sum/num));
	}
}