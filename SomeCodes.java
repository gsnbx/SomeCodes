import java.util.*;

class SomeCodes {
	public static void main(String args[]) {
		print(reversedofNumber(2366));
		print(ArmstrongNumber(153));
		print(ArmstrongBetween(0, 999));
	}
	//Print
	public static void print(Object o) {
		System.out.println(o);
	}

	//-----------------reverse of N numbers-------------------------------------

	public static int reversedofNumber(int num) {
		int rev = 0, rem = 0;

		while(num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num /=  10;
		}
		return rev;
	}
	//-----------------Armstrong Numbers----------------------------------------

	public static boolean ArmstrongNumber(int num) {
		int TotalDigit = 0, result = 0, rem = 0;
		int temp = num;

		//to find TotalDigit
		while(temp != 0) {
			temp = temp / 10;
			TotalDigit++;
		}
		temp = num;

		while(temp !=0) {
			rem = temp % 10;
			result = result + (int)Math.pow(rem, TotalDigit);
			temp /= 10;
		}
		return (result==num)?true:false;
	}

	//-----------Armstrong numbers between 100-10000-----------------------------
	
	public static List<Integer> ArmstrongBetween(int start, int end) {

		List<Integer> list = new ArrayList<Integer>();

		for(int i=start; i<=end; i++) {

			int temp, TotalDigit = 0, result = 0;
			temp = i;

			//to find total digits
			if(temp == 0)
				TotalDigit = 1;
			else
				while(temp != 0) {
					temp /= 10;
					TotalDigit++;
				}

			temp = i;

			while(temp != 0) {
				int rem = temp % 10;
				result = result + (int)Math.pow(rem, TotalDigit);
				temp /= 10;
			}
			if(result == i) {
				list.add(i);
			}
		}
		return list;
	}

}