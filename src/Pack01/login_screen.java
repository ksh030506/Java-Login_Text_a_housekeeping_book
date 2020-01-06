package Pack01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class login_screen extends JFrame { // 로그인화면
	Image img = null;

	public login_screen() {
		JPanel p = new JPanel();
		p.setLayout(null);
		JLabel label = new JLabel(new ImageIcon("D:\\GSMJAVA\\work\\Project01_loginTXT\\aa.jpg"));
		add(label);
		Label b2 = new Label("아이디:");
		add(b2);
		Label b3 = new Label("비밀번호:");
		add(b3);
		TextField b4 = new TextField();
		add(b4);
		TextField b5 = new TextField();
		add(b5);
		b5.setEchoChar('*'); // 암호화
		JButton b6 = new JButton("로그인");
		add(b6);
		JButton b7 = new JButton("회원가입");
		add(b7);

		label.setBounds(0, 0, 1300, 505);
		b2.setBounds(280, 570, 40, 40);
		b3.setBounds(600, 570, 60, 40);
		b4.setBounds(350, 570, 200, 30);
		b4.setFont(b4.getFont().deriveFont(20f));
		b5.setBounds(700, 570, 200, 30);
		b5.setFont(b5.getFont().deriveFont(20f));
		b6.setBounds(630, 640, 90, 40);
		b7.setBounds(530, 640, 90, 40);
		add(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(login_main.SCREEN_WIDTH, login_main.SCREEN_HEIGET);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("Login Page");
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // 회원가입창으로 이동
				login_Singup f2 = new login_Singup();
			}
		});
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) { // 로그인 할때 비교하는 것
				try {
					String s;
					String[] array;
					BufferedReader bos = new BufferedReader(new FileReader("Login_history.txt"));
					while ((s = bos.readLine()) != null) {
						array = s.split("/");
						if (b4.getText().equals(array[1]) && b5.getText().equals(array[2])) {
							JOptionPane.showMessageDialog(null, "로그인이 되었습니다!!");
							login_succeed1 f3 = new login_succeed1();
						} else {
							JOptionPane.showMessageDialog(null, "로그인이 실패하였습니다.");
						}
					}
					bos.close();
					dispose();
				} catch (IOException E10) {
					E10.printStackTrace();
				}
			}
		});
	}
}
