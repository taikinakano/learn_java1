package Main5_2;

public class exercise5_1 {
	public static void main(String[] args) {
		System.out.println("変数を取り出します");
		introduceOneself();
		System.out.println("以上で自己紹介を終わります");
	}
	
	public static void introduceOneself() {
		System.out.println("What your name?");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("what your age?");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("What your height?");
		int height = new java.util.Scanner(System.in).nextInt();
		System.out.println("What your zodiac?");
		String zodiac = new java.util.Scanner(System.in).nextLine();
		System.out.println("こんにちは！！私の名前は" + name + "と申します");
		System.out.println(age + "歳で身長は" + height + "です。");
		System.out.println("私は" + zodiac + "年生まれです。同じ方がいたら嬉しいです！");
	}
}
