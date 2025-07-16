package t2_AWT;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T02_1 extends Frame implements WindowListener {

	public T02_1() {
		setTitle("AWT 프레임");
		// 윈도우는 좌측 상단이 (0,0) 기준이다.
		// 창의 크기와 위치를 한번에 설정해주자.
		setBounds(300,200,400,350);	//(x,y,폭,높이)
		
		setVisible(true);
		
		addWindowListener(this);
	}

	public static void main(String[] args) {
		new T02_1();

	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}
}
