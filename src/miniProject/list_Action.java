package miniProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

public class list_Action extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list_Action frame = new list_Action();
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
	public list_Action() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnaction = new JTextPane();
		txtpnaction.setText("[Action]");
		txtpnaction.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		txtpnaction.setEditable(false);
		txtpnaction.setBackground(SystemColor.activeCaption);
		txtpnaction.setBounds(10, 11, 103, 39);
		contentPane.add(txtpnaction);
		
		JButton k1 = new JButton("");
		k1.setBackground(SystemColor.desktop);
		Image img001 = new ImageIcon(this.getClass().getResource("/jumpfore.png")).getImage();
		k1.setIcon(new ImageIcon(img001));
		k1.setBounds(72, 61, 144, 197);
		contentPane.add(k1);
		
		JButton k2 = new JButton("");
		k2.setBackground(SystemColor.desktop);
		Image img002 = new ImageIcon(this.getClass().getResource("/rainbow6.jpg")).getImage();
		k2.setIcon(new ImageIcon(img002));
		k2.setBounds(250, 61, 144, 197);
		contentPane.add(k2);
		
		JButton k3 = new JButton("");
		k3.setBackground(SystemColor.desktop);
		Image img003 = new ImageIcon(this.getClass().getResource("/overwatch.jpg")).getImage();
		k3.setIcon(new ImageIcon(img003));
		k3.setBounds(428, 61, 144, 197);
		contentPane.add(k3);
		
		JButton k4 = new JButton("");
		Image img004 = new ImageIcon(this.getClass().getResource("/monster hunter world.jpg")).getImage();
		k4.setIcon(new ImageIcon(img004));
		k4.setBackground(Color.BLACK);
		k4.setBounds(72, 323, 144, 197);
		contentPane.add(k4);
		
		JButton k5 = new JButton("");
		k5.setBackground(SystemColor.desktop);
		Image img005 = new ImageIcon(this.getClass().getResource("/dota 2.jpg")).getImage();
		k5.setIcon(new ImageIcon(img005));
		k5.setBounds(250, 323, 144, 197);
		contentPane.add(k5);
		
		JButton k6 = new JButton("");
		k6.setBackground(SystemColor.desktop);
		Image img006 = new ImageIcon(this.getClass().getResource("/battlerite.png")).getImage();
		k6.setIcon(new ImageIcon(img006));
		k6.setBounds(428, 323, 144, 197);
		contentPane.add(k6);
		
		JLabel n1 = new JLabel("DOTA 2");
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setBackground(SystemColor.activeCaption);
		n1.setBounds(250, 531, 154, 23);
		contentPane.add(n1);
		
		JLabel n2 = new JLabel("Jump Force");
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setBackground(SystemColor.activeCaption);
		n2.setBounds(72, 269, 154, 23);
		contentPane.add(n2);
		
		JLabel n3 = new JLabel("Tom Clancy's Rainbow Six Siege");
		n3.setHorizontalAlignment(SwingConstants.CENTER);
		n3.setBackground(SystemColor.activeCaption);
		n3.setBounds(229, 269, 194, 23);
		contentPane.add(n3);
		
		JLabel n4 = new JLabel("Overwatch");
		n4.setHorizontalAlignment(SwingConstants.CENTER);
		n4.setBackground(SystemColor.activeCaption);
		n4.setBounds(433, 269, 138, 23);
		contentPane.add(n4);
		
		JLabel n5 = new JLabel("MONSTER HUNTER: WORLD");
		n5.setHorizontalAlignment(SwingConstants.CENTER);
		n5.setBackground(SystemColor.activeCaption);
		n5.setBounds(72, 531, 144, 23);
		contentPane.add(n5);
		
		JLabel n6 = new JLabel(" Battlerite");
		n6.setHorizontalAlignment(SwingConstants.CENTER);
		n6.setBackground(SystemColor.activeCaption);
		n6.setBounds(433, 531, 139, 23);
		contentPane.add(n6);
		
		JButton back = new JButton("BACK");
		back.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		back.setBackground(SystemColor.menu);
		back.setBounds(22, 595, 99, 23);
		contentPane.add(back);
		
		JButton p1 = new JButton("1");
		p1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		p1.setEnabled(false);
		p1.setBounds(280, 594, 39, 25);
		contentPane.add(p1);
		
		JButton p2 = new JButton("2");
		p2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		p2.setBounds(325, 594, 39, 25);
		contentPane.add(p2);
		
		p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				list_Action2 con = new list_Action2();
				con.setVisible(true);
				gui.i = 72;
			}
		});
		
		k1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p01_jumpfore con = new p01_jumpfore();
				con.setVisible(true);
			}
		});
		
		k2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p03_rainbow6 con = new p03_rainbow6();
				con.setVisible(true);
			}
		});
		
		k3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p05_overwatch con = new p05_overwatch();
				con.setVisible(true);
			}
		});
		
		k4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p06_monster_hunter_world con = new p06_monster_hunter_world();
				con.setVisible(true);
			}
		});
		
		k5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p09_dota2 con = new p09_dota2();
				con.setVisible(true);
			}
		});
		
		k6.addActionListener(new ActionListener() {
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
