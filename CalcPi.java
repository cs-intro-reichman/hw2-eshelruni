// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		Integer repeat_times = Integer.parseInt(args[0]);
		Double pi_approx = 0.0;
		for (int i = 0; i < repeat_times; i++) {
			if (i % 2 == 0) {
				pi_approx +=  1.0 / (2 * i + 1);
			} else {
				pi_approx -= 1.0 / (2 * i + 1);
			}
		}
		pi_approx *= 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pi_approx);
	}
}
