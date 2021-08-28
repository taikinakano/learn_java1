package chapter4;

public class exercise4_1 {
	public static void main(String[] args) {
		int[] point = new int[4];
		for(int i = 0; i < point.length; i++) {
			point[i] = new java.util.Random().nextInt(4);
			System.out.println(point[i]);
		}
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];
	}
}
