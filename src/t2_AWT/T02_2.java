package t2_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T02_2 extends Frame implements WindowListener, ActionListener {

	public T02_2() {	// 클래스 생성자에서 구현했음.
		setTitle("AWT 프레임");
		// 윈도우는 좌측 상단이 (0,0) 기준이다.
		// 창의 크기와 위치를 한번에 설정해주자.
		setBounds(700,300,400,350);	//(x,y,폭,높이)
		
		Label lblTitle = new Label("레이블 테스트");
		add(lblTitle);
		
		Button btnExit = new Button("종료버튼");
//		btnAction.setLabel("Action");
		add(btnExit);
		
		addWindowListener(this);	
		btnExit.addActionListener(this);
		
		setVisible(true);
		
// ------------------- 위쪽은 UI 구현(디자인), 아래쪽은 method 처리(코드) ----------------		
	}

	public static void main(String[] args) {
		new T02_2();

	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼에 종료하는 기능을 넣음.
		System.exit(0);
	}
}
