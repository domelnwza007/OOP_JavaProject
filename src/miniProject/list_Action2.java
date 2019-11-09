package miniProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class list_Action2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list_Action2 frame = new list_Action2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public list_Action2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img001 = new ImageIcon(this.getClass().getResource("/star wars jedi fallen order.jpg")).getImage();
		Image img002 = new ImageIcon(this.getClass().getResource("/2D Combat Racing.png")).getImage();
		Image img003 = new ImageIcon(this.getClass().getResource("/trove.png")).getImage();
		
		JTextPane textPane = new JTextPane();
		textPane.setText("[Action]");
		textPane.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		textPane.setEditable(false);
		textPane.setBackground(SystemColor.activeCaption);
		textPane.setBounds(10, 11, 103, 39);
		contentPane.add(textPane);
				
		JButton k1 = new JButton("");
		k1.setIcon(new ImageIcon(img001));
		k1.setBackground(Color.BLACK);
		k1.setBounds(72, 61, 144, 197);
		contentPane.add(k1);
		
		JButton k2 = new JButton("");
		k2.setIcon(new ImageIcon(img002));
		k2.setBackground(Color.BLACK);
		k2.setBounds(250, 61, 144, 197);
		contentPane.add(k2);
		
		JButton k3 = new JButton("");
		k3.setIcon(new ImageIcon(img003));
		k3.setBackground(SystemColor.desktop);
		k3.setBounds(428, 61, 144, 197);
		contentPane.add(k3);
		
		JLabel n1 = new JLabel("Star wars fallen order");
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setBackground(Color.BLACK);
		n1.setBounds(72, 269, 144, 23);
		contentPane.add(n1);
		
		JLabel n2 = new JLabel("2D Combat Racing");
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setBackground(SystemColor.activeCaption);
		n2.setBounds(250, 269, 144, 23);
		contentPane.add(n2);
		
		JLabel n3 = new JLabel("Trove");
		n3.setHorizontalAlignment(SwingConstants.CENTER);
		n3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		n3.setBackground(SystemColor.activeCaption);
		n3.setBounds(433, 269, 139, 23);
		contentPane.add(n3);
		
		JButton back = new JButton("BACK");
		back.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		back.setBackground(SystemColor.menu);
		back.setBounds(22, 595, 99, 23);
		contentPane.add(back);
		
		JButton p1 = new JButton("1");
		p1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		p1.setBounds(280, 594, 39, 25);
		contentPane.add(p1);
		
		JButton p2 = new JButton("2");
		p2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		p2.setEnabled(false);
		p2.setBounds(325, 594, 39, 25);
		contentPane.add(p2);
		
		p1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				list_Action con = new list_Action();
				con.setVisible(true);
				gui.i = 7;
			}
		});
		
		k1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p08_starwars_jedi_fallen_order con = new p08_starwars_jedi_fallen_order();
				con.setVisible(true);
			}
		});
		
		k2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p14_2D_combat_racing con = new p14_2D_combat_racing();
				con.setVisible(true);
			}
		});
		
		k3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p15_trove con = new p15_trove();
				con.setVisible(true);
			}
		});
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				main con = new main();
				con.setVisible(true);
				gui.i=0;
			}
		});
	}

}
