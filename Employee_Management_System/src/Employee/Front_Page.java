package Employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Front_Page implements ActionListener {
	JFrame f;
	JLabel id, l1;
	JButton b;

	Front_Page() {

		f = new JFrame("Employee Management System");
		f.setBackground(Color.red);
		f.getContentPane().setLayout(null);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("front.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);

		l1.setBounds(23, 144, 1360, 530);
		f.getContentPane().add(l1);

		b = new JButton("CLICK HERE TO CONTINUE");
		b.setBounds(500, 600, 350, 70);
		b.setFont(new Font("comic", Font.PLAIN, 20));
		b.addActionListener(this);
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);

		id = new JLabel();
		id.setBounds(0, 0, 1360, 750);
		id.setLayout(null);

		JLabel lid = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		lid.setBounds(80, 30, 1500, 100);
		lid.setFont(new Font("serif", Font.PLAIN, 70));
		lid.setForeground(Color.BLUE);
		id.add(lid);

		f.add(b);
		f.getContentPane().add(id);

		f.getContentPane().setBackground(Color.WHITE);


		f.setVisible(true);
		f.setSize(1360, 750);
		f.setLocation(200, 100);
// TO CREATE A BLINKING EFFECT ...
		// while (true) {
		// lid.setVisible(false); // lid = j label
		// try {
		// Thread.sleep(500); // 1000 = 1 second
		// } catch (Exception e) {
		// }
		// lid.setVisible(true);
		// try {
		// Thread.sleep(500);
		// } catch (Exception e) {
		// }
		// }

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == b) {
			f.setVisible(false);// front page ka frame remove now go to class login ...
			new Login();
		}
	}

	public static void main(String[] arg) {
		Front_Page f = new Front_Page();
	}
}