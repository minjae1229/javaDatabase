package t2_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 그리드 레이아웃 : (2차원 배열의 형태?)

@SuppressWarnings("serial")
public class T06_AbsouluteLayout2 extends Frame implements WindowListener, ActionListener {

	public T06_AbsouluteLayout2() {
		designView();
	}

	private void designView() {
		// layout
		setTitle("AWT 프레임(BorderLayout)");
		setLayout(null);	// set layout을 null
		setBounds(700, 300, 400, 350);
		
		int x =100, y=100, w=150, h=30;

		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btnExit = new Button("Exit");
		                  
		btn1.setBounds(x, y, w, h); // 앞의 2개는 현재 레이아웃 기준 좌표(x,y), 넓이 , 높이
		btn2.setBounds(x, y+40, w, h);
		btn3.setBounds(x, y+80, w, h);
		btn4.setBounds(x, y+120, w, h);
		btnExit.setBounds(x, y+160, w, h);
		// y값만 40 픽셀씩 추가
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btnExit);
		
		addWindowListener(this);
		btnExit.addActionListener(this);

		setVisible(true);
	}
// ------------------- 위쪽은 UI 구현(디자인), 아래쪽은 method 처리(코드) ----------------		


	@Override
	public void actionPerformed(ActionEvent e) {
//		Button btnText = (Button) e.getSource();
		System.exit(0);
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
	public static void main(String[] args) {
		new T06_AbsouluteLayout2();
	}

}
