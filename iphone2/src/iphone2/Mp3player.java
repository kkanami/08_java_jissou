package iphone2;

public interface Mp3player {

	public abstract void play();
	public abstract void stop();
	public abstract void next();
	public abstract void buck();
	//intergaceとabstractはセットでつかう。
	//メソッド名のみで処理内容を書かないことを「抽象メソッド」という。
}
