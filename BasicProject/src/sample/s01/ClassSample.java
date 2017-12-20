package sample.s01;

public class ClassSample {

	public static void main(String[] args) {
        Counter counter1 = new Counter();//counterのインスタンスを作成//
        Counter counter2 = new Counter();

        counter1.show();
        counter1.count();
        counter1.show();

        counter2.count();
        counter2.count();
        counter2.count();
        counter2.show();

        /*メソッド→関数
          クラス→設計図*/


	}

}
