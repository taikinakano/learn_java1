package exercise3_3;

public class Main3_7 {
	public static void main(String[] args) {
		System.out.print("[メニュー]1:検索　2:登録　3:削除　4:変更 >");
		for (int i = 0; i < 5; i++) {
			int selected = new java.util.Scanner(System.in).nextInt();
		switch(selected) {
		case 1:
			System.out.println("検索します");
			return;
		case 2:
			System.out.println("登録します");
			return;
		case 3:
			System.out.println("削除します");
			return;
		case 4:
			System.out.println("変更します");
			return;
		default:
			System.out.println("最初からやり直してください");
		}
		}
	}
}
