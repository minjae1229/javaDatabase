package t2_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T10_Adapter extends Frame {

	public T10_Adapter() {
		super("어뎁터의 활용 예");
		designView();
	}

	private void designView() {
//		setTitle("어댑터의 활용 예");
		setBounds(700, 300, 400, 350);

		Button btnExit = new Button("Exit");
		add(btnExit);

		setVisible(true);

//------------------- 위쪽은 UI 구현(디자인), 아래쪽은 method 처리(코드) ----------------		

		// 종료버튼 클릭시 수행(interface 대신 익명 이너 클래스로 선언했음)
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// 윈도우 종료버튼(x) 클릭해서 작업종료
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// 윈도우 리스너에 경우 추상메소드들이 많아서 이중 사용하고 싶은 메소드만 사용하기 위해
		// 익명 이너 클래스(어댑터)로 구현함.

	}// designView() end

	public static void main(String[] args) {
		new T10_Adapter();
	}
}
