// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
		Integer repeat_times = Integer.parseInt(args[0]);
		Integer over_half = 0;
		Integer under_and_half = 0;
		for (int i = 0; i < repeat_times; i++) {
			double random = Math.random();
			if (random > 0.5) {
				over_half++;
			} else {
				under_and_half++;
			}
		}
		double ratio = 0;
		if (over_half != 0 && under_and_half != 0) {
			if (over_half > under_and_half) {
				ratio = (double) under_and_half / (double) over_half;
			} else {
				ratio = (double) over_half / (double) under_and_half;
			}
		}
		System.out.println("> 0.5:  " + over_half + " times");
		System.out.println("<= 0.5: " + under_and_half + " times");
		if (ratio != 0) {
			System.out.println("Ratio:  " + ratio);
		}
	}
}
