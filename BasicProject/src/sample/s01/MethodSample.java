package sample.s01;

public class MethodSample {

	public static void main(String[] args) {

		printTest();
		printTest();


	}


	private static void printTest() {
		String str1, str2;
		str1 = "Hello ";
		str2 = "world!!";

		System.out.println(str1 + str2);
	}
}

//リファクタリング 名前の変更 移動//
