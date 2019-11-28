package ui;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button2 extends Frame {
	private Button b1 = new Button("Button 1"), b2 = new Button("Button 2");
	private TextField txt = new TextField(10);

	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String name = ((Button) e.getSource()).getLabel();
			txt.setText(name);
		}
	}

	private ButtonListener blint = new ButtonListener();

	public Button2() {
		b1.addActionListener(blint);
		b2.addActionListener(blint);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(txt);
	}

	public static void main(String[] args) {
		Button2 b = new Button2();
//		Dialog d = new Dialog(b, "提示信息-self", true);// 弹出的对话框
		b.setSize(300, 200);
		b.setVisible(true);
	}
} /// :~
