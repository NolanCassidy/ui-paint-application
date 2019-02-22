import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painter {

	public static void main(String[] args) {
		JFrame application = new JFrame("Nolan's Paint Program");
		application.setLayout(new BorderLayout());
		PaintPanel paintPanel = new PaintPanel();
		JPanel btns = new JPanel();
		JPanel sizes = new JPanel();

		application.add(paintPanel, BorderLayout.CENTER);
		application.add(new JLabel("Drag mouse to draw."), BorderLayout.SOUTH);

		JButton b2 = new JButton("RED");
		JButton b1 = new JButton("BLUE");
		JButton b3 = new JButton("BLACK");
		JButton b4 = new JButton("GREEN");
		JButton s2 = new JButton("MEDIUM");
		JButton s1 = new JButton("SMALL");
		JButton s3 = new JButton("LARGE");
		JButton c = new JButton("CLEAR");

		b1.setPreferredSize(new Dimension(140, 100));
		b2.setPreferredSize(new Dimension(140, 100));
		b3.setPreferredSize(new Dimension(140, 100));
		b4.setPreferredSize(new Dimension(140, 100));
		s1.setPreferredSize(new Dimension(140, 100));
		s2.setPreferredSize(new Dimension(140, 100));
		s3.setPreferredSize(new Dimension(140, 100));
		c.setPreferredSize(new Dimension(140, 100));

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintPanel.color = Color.RED;
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintPanel.color = Color.BLACK;
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintPanel.color = Color.GREEN;
			}
		});
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintPanel.color = Color.BLUE;
			}
		});
		s2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintPanel.size = 8;
			}
		});
		s3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintPanel.size = 12;
			}
		});
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintPanel.clear();

			}
		});
		s1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				paintPanel.size = 4;
			}
		});

		btns.add(b1);
		btns.add(b2);
		btns.add(b3);
		btns.add(b4);
		sizes.add(s1);
		sizes.add(s2);
		sizes.add(s3);
		sizes.add(c);

		application.add(btns, BorderLayout.PAGE_START);
		application.add(sizes, BorderLayout.PAGE_END);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(1000, 1200);
		application.setVisible(true);
	}
}
