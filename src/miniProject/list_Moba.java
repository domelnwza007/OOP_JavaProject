package miniProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class list_Moba extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list_Moba frame = new list_Moba();
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
	public list_Moba() {
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnmoba = new JTextPane();
		txtpnmoba.setText("[MOBA]");
		txtpnmoba.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		txtpnmoba.setEditable(false);
		txtpnmoba.setBackground(SystemColor.activeCaption);
		txtpnmoba.setBounds(10, 11, 98, 39);
		contentPane.add(txtpnmoba);
		
		JLabel n1 = new JLabel("Overwatch");
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setBackground(SystemColor.activeCaption);
		n1.setBounds(72, 269, 145, 23);
		contentPane.add(n1);
		
		JLabel n2 = new JLabel("DOTA 2");
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setBackground(SystemColor.activeCaption);
		n2.setBounds(250, 269, 145, 23);
		contentPane.add(n2);
		
		JLabel n3 = new JLabel(" Battlerite");
		n3.setHorizontalAlignment(SwingConstants.CENTER);
		n3.setBackground(SystemColor.activeCaption);
		n3.setBounds(433, 269, 139, 23);
		contentPane.add(n3);
		
		JButton k1 = new JButton("");
		k1.setBackground(SystemColor.desktop);
		Image img001 = new ImageIcon(this.getClass().getResource("/overwatch.jpg")).getImage();
		
		JButton back = new JButton("BACK");
		back.setBackground(SystemColor.menu);
		back.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		back.setBounds(10, 595, 89, 23);
		contentPane.add(back);
		k1.setIcon(new ImageIcon(img001));
		k1.setBounds(72, 61, 144, 197);
		contentPane.add(k1);
		
		JButton k2 = new JButton("");
		k2.setBackground(SystemColor.desktop);
		Image img002 = new ImageIcon(this.getClass().getResource("/dota 2.jpg")).getImage();
		k2.setIcon(new ImageIcon(img002));
		k2.setBounds(250, 61, 144, 197);
		contentPane.add(k2);
		
		JButton k3 = new JButton("");
		k3.setBackground(SystemColor.desktop);
		Image img003 = new ImageIcon(this.getClass().getResource("/battlerite.png")).getImage();
		k3.setIcon(new ImageIcon(img003));
		k3.setBounds(428, 61, 144, 197);
		contentPane.add(k3);
		
		k1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p05_overwatch con = new p05_overwatch();
				con.setVisible(true);
			}
		});
		
		k2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p09_dota2 con = new p09_dota2();
				con.setVisible(true);
			}
		});
		
		k3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p11_battlerite con = new p11_battlerite();
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
