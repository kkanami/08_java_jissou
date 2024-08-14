package iphone2;

public class Smartphone implements Mp3player{

	public void play(){
		System.out.println("再生");
	};
	public void stop(){
		System.out.println("停止");
	};
	public void next(){
		System.out.println("次へ");
	};
	public void buck(){
		System.out.println("戻る");
	};
	//必ずインターフェースに描いたメソッド（とその処理内容）を書く
}
