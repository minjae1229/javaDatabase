package t2_AWT;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 그리드 레이아웃 : (2차원 배열의 형태?)

@SuppressWarnings("serial")
public class T07_MouseEvent extends Frame implements WindowListener, ActionListener, MouseListener {

	public T07_MouseEvent() {
		designView();
	}

	private void designView() {
		// layout
		setTitle("마우스 이벤트 연습");
		setLayout(null); // set layout을 null
		setBounds(700, 300, 400, 350);

		// y값만 40 픽셀씩 추가

		addWindowListener(this);
		addMouseListener(this);

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

	// 마우스
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭시~~~~");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스 클릭하는 순간~~~~");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 놓는 순간~~~~");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스가 특정 객체안으로 들어가는 순간~~~~");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스가 특정 객체 밖으로 나오는 순간~~~~");
	}

	// main()
	public static void main(String[] args) {
		new T07_MouseEvent();
	}

}
