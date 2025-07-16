package t2_AWT;

import java.awt.Frame;

@SuppressWarnings("serial") // 순차적으로 처리하는 것에 대해 경고를 무시하겠음.
public class T01_2 extends Frame {

	public T01_2() {
		setTitle("AWT 프레임");
		setSize(300, 250); // 프레임의 크기 폭 높이 ; 픽셀단위
		setVisible(true);
	}

	public static void main(String[] args) {
		new T01_2();
	}
}
