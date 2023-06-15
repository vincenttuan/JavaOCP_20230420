package day14;

import javax.swing.JButton;
import javax.swing.JFrame;

// 外部類別
public class MyButton extends JFrame {
	
	private JButton button;
	
	public MyButton() {
		button = new JButton("Click Me");
		
		// 配置 button 元件到 JFrame 中
		super.getContentPane().add(button);
		super.pack();
		super.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MyButton();
	}

}
