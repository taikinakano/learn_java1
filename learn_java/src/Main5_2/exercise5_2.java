package Main5_2;

public class exercise5_2 {
	public static void main(String[] args) {
		System.out.println("メールのタイトルを入力してください");
		String title = new java.util.Scanner(System.in).nextLine();
		System.out.println("メールの宛先アドレスを入力してください");
		String address = new java.util.Scanner(System.in).nextLine();
		System.out.println("メールの本文を入力してください");
		String text = new java.util.Scanner(System.in).nextLine();
		email(title, address, text);
		email(address, text);
		System.out.println("以上のようなメールが届いてましたよ");
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名 :" + title);
		System.out.println("本文：" + text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名 :" + "無題");
		System.out.println("本文：" + text);		
	}
}
