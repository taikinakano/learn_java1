package chapter2;

public class chapter2_3 {
	public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力します。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(3) + 1;
		fortune++;
		System.out.println("占いの結果が出ました!");
		System.out.println(age + "歳の" + name + "さん、" + "あなたの運気番号は" + fortune + "です");
		if (fortune == 1) {
			System.out.println("大吉");
		}else if (fortune == 2){
			System.out.println("中吉");
		}else if (fortune == 3) {
			System.out.println("吉");
		}else if (fortune == 4) {
			System.out.println("凶");
		}
	}
}
