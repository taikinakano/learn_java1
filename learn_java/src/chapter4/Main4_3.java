package chapter4;

public class Main4_3 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("一桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == input) {
				System.out.println("あたり");
				return;
			}
		}
		System.out.println("処理を終わります");
		return;
	}
}
