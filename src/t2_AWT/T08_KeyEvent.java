package t2_AWT;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 그리드 레이아웃 : (2차원 배열의 형태?)

@SuppressWarnings("serial")
public class T08_KeyEvent extends Frame implements WindowListener, ActionListener, KeyListener {

	public T08_KeyEvent() {
		designView();
	}

	private void designView() {
		// layout
		setTitle("키 이벤트 연습");
		setLayout(null); // set layout을 null
		setBounds(700, 300, 400, 350);

		addWindowListener(this);
		addKeyListener(this);

		setVisible(true);
	}
// ------------------- 위쪽은 UI 구현(디자인), 아래쪽은 method 처리(코드) ----------------		

	// 버튼
	@Override
	public void actionPerformed(ActionEvent e) {
//		Button btnText = (Button) e.getSource();
		System.exit(0);
	}

	// 윈도우
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

	// 키보드
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("키보드 입력중...");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키보드 누르고 있는 중.");
		char keyCode = e.getKeyChar();
		System.out.println("입력된 키는? " + keyCode);
		
		if(keyCode == 'E') System.exit(0);	// shift + e 인 경우 종료됨
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("키보드 놓았을 때.");
	}

	// main()
	public static void main(String[] args) {
		new T08_KeyEvent();
	}
}
