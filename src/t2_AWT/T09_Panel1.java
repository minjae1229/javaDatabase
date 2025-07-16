package t2_AWT;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 패널은 판이다.

@SuppressWarnings("serial")
public class T09_Panel1 extends Frame implements WindowListener, ActionListener {

	public T09_Panel1() {
		designView();
	}

	private void designView() {
		setTitle("AWT 프레임(BorderLayout / Panel)");
		setLayout(new GridLayout(3,1));	// 3행 1열
		setBounds(700, 300, 400, 350);
		
		// 프레임에 패널을 올리고 패널에 레이블을 올린다.
		
		Panel pn1 = new Panel();
		Panel pn2 = new Panel();
		Panel pn3 = new Panel();
		
		Label lbl1 = new Label();
		Label lbl2 = new Label();
		Label lbl3 = new Label("세번째 패널입니다.");
		
		lbl1.setText("첫번째 패널입니다.");
		lbl2.setText("첫번째 패널입니다.");
		
		// 패널에 레이블을 올린다.
		pn1.add(lbl1);
		pn2.add(lbl2);
		pn3.add(lbl3);
		
		// 패널을 프레임에 올린다.
		add(pn1);
		add(pn2);
		add(pn3);
		
		addWindowListener(this);

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
		new T09_Panel1();
	}

}
