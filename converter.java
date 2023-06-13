


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GFG {
	public static void converter()
	{

		JFrame f = new JFrame("rahul");
		JLabel l1 = new JLabel("Rupees:");
		l1.setBounds(20, 40, 60, 30);
		JLabel l2 = new JLabel("Dollars:");
		l2.setBounds(170, 40, 60, 30);

		
		JTextField t1 = new JTextField("0");
		t1.setBounds(80, 40, 50, 30);
		JTextField t2 = new JTextField("0");
		t2.setBounds(240, 40, 50, 30);

		
		JButton b1 = new JButton("INR");
		b1.setBounds(50, 80, 60, 15);
		JButton b2 = new JButton("Dollar");
		b2.setBounds(190, 80, 60, 15);
		JButton b3 = new JButton("close");
		b3.setBounds(150, 150, 60, 30);
		Color red = new Color(150,120, 0);
        JButton b4 = new JButton("resize");
		b4.setBounds(200,150,120,30);
		b3.setBackground(red);
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				double d = Double.parseDouble(t1.getText());

				
			     double d1 = (d / 65.25);

				
				String str1 = String.valueOf(d1);

				t2.setText(str1);
			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				double d2 = Double.parseDouble(t2.getText());

				double d3 = (d2 * 65.25);

				
				String str2 = String.valueOf(d3);

				t1.setText(str2);
			}
		});

		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				f.dispose();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				f.setSize(1000,1000);
			}
		});

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		f.setLayout(null);
		f.setSize(1920, 1080);
		f.setVisible(true);
	}


	public static void main(String args[])
	{
		converter();
	}
}
