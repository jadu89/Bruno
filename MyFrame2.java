import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyFrame2 extends JFrame implements ActionListener{
		
		JTextField field1;
		JButton button1 = new JButton("콤보피자");
		JButton button2 = new JButton("포테이토피자");
		JButton button3 = new JButton("불고기피자");
		
		public void actionPerformed(ActionEvent actionEvent) 
		{
			String item_name="", result;
			int cnt=0, service=0;
			if (actionEvent.getSource() == button1) {
				item_name = "콤보피자";
			}
			
			else if (actionEvent.getSource() == button2) {
				item_name = "포테이토피자";
			}
			
			else if (actionEvent.getSource() == button3) {
				item_name = "불고기피자";
			}
			
			try {
			cnt = Integer.valueOf(field1.getText());
			service = cnt/3;
			result = "주문 내역 : "+item_name+" 갯수 : "+(cnt+service);
			}
			catch(Exception e) {
				result = "수량이 없습니다.";
			}
	
			
			JOptionPane.showMessageDialog(null, result);
			}
	
		public MyFrame2() {
			setSize (600,150);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("MyFrame2");
			
			JPanel panel = new JPanel();
			JPanel panelA = new JPanel();
			JPanel panelB = new JPanel();
			JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
			
			
			panelB.add(button1);
			panelB.add(button2);
			panelB.add(button3);
			button1.addActionListener(this);
			button2.addActionListener(this);
			button3.addActionListener(this);
			
			JLabel label2 = new JLabel("개수");
			field1= new JTextField(10);
			panelB.add(label2);
			panelB.add(field1);
			
			panel.add(panelA);
			panel.add(panelB);
			add(panel);
			setVisible(true);
			panel.setBackground(Color.BLUE);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			
						
		}

	
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
}
