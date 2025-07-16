package t2_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 보더 레이아웃은 동서남북, 센터로 배치함.

@SuppressWarnings("serial")
public class T04_BorderLayout extends Frame implements WindowListener, ActionListener {

	public T04_BorderLayout() {
		designView();
	}

	private void designView() {
		// layout
		setTitle("AWT 프레임(BorderLayout)");
		setLayout(new BorderLayout());
		setBounds(700, 300, 400, 350);

		Button btnN = new Button("북쪽");
		Button btnS = new Button("남쪽");
		Button btnW = new Button("서쪽");
		Button btnE = new Button("동쪽");
		Button btnC = new Button("중앙");
		
		add(btnN, BorderLayout.NORTH);
		add(btnS, BorderLayout.SOUTH);
		add(btnW, BorderLayout.WEST);
		add(btnE, BorderLayout.EAST);
		add(btnC, BorderLayout.CENTER);	//"Center"
		
		addWindowListener(this);
		btnC.addActionListener(this);

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
		new T04_BorderLayout();
	}

}
