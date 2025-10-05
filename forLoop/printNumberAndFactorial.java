
public class printNumberAndFactorial {
	public static void main(String[] args) {
		System.out.println("---------------------");
		System.out.println(" NUMBER     FACTORIAL");
		System.out.println("---------------------");

		int num = 1, sum = 0;

		do {
			int f = factor(num);
			System.out.println("   " + num + "            " + f);
			num++;
			sum += f;
		} while (num <= 5);

		System.out.println("---------------------");
		System.out.println("       SUM: " + sum);
		System.out.println("---------------------");
	}

	static int factor(int num) {
		int i = num - 1;
		while (i != 0) {
			num = num * i;
			i--;
		}
		return num;
	}

}
