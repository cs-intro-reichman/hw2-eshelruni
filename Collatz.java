// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		Integer number = Integer.parseInt(args[0]);
		Boolean verbose_mode = args[1].equals("v");
		for (int loop_number = 1; loop_number < number + 1; loop_number++) {
			Integer num = loop_number;
			Integer steps = 1;
			while (num != 1 || steps == 1) {
				if (verbose_mode) {
					System.out.print(num + " ");
				}
				if (num % 2 == 0) {
					num /= 2;
				} else {
					num = (num * 3) + 1;
				}
				steps += 1;
			}
			if (verbose_mode) {
				System.out.print(num + " ");
				System.out.print("(" + steps + ")");
				System.out.println();
			}
		}
		System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");
	}
}
