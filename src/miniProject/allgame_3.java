package miniProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JToggleButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class allgame_3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					allgame_3 frame = new allgame_3();
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
	public allgame_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnallgame = new JTextPane();
		txtpnallgame.setText("[AllGame]");
		txtpnallgame.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		txtpnallgame.setEditable(false);
		txtpnallgame.setBackground(SystemColor.activeCaption);
		txtpnallgame.setBounds(10, 11, 166, 39);
		contentPane.add(txtpnallgame);
		
		Image img001 = new ImageIcon(this.getClass().getResource("/duel link.png")).getImage();
		Image img002 = new ImageIcon(this.getClass().getResource("/2D Combat Racing.png")).getImage();
		Image img003 = new ImageIcon(this.getClass().getResource("/trove.png")).getImage();
		
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
		k3.setBackground(Color.BLACK);
		k3.setBounds(428, 61, 144, 197);
		contentPane.add(k3);
		
		JLabel n1 = new JLabel("Yu-Gi-Oh! Duel Links");
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setBackground(SystemColor.activeCaption);
		n1.setBounds(72, 269, 144, 23);
		contentPane.add(n1);
		
		JLabel n2 = new JLabel("2D Combat Racing");
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setBackground(SystemColor.activeCaption);
		n2.setBounds(250, 269, 144, 23);
		contentPane.add(n2);
		
		JLabel n3 = new JLabel("Trove");
		n3.setHorizontalAlignment(SwingConstants.CENTER);
		n3.setBackground(SystemColor.activeCaption);
		n3.setBounds(420, 269, 166, 23);
		contentPane.add(n3);
		
		JButton back = new JButton("BACK");
		back.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		back.setBackground(SystemColor.menu);
		back.setBounds(22, 595, 99, 23);
		contentPane.add(back);
		
		JButton p1 = new JButton("1");
		p1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		p1.setBounds(249, 595, 39, 25);
		contentPane.add(p1);
		
		JButton p2 = new JButton("2");
		p2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		p2.setBounds(303, 595, 39, 25);
		contentPane.add(p2);
		
		JButton p3 = new JButton("3");
		p3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		p3.setEnabled(false);
		p3.setBounds(355, 595, 39, 25);
		contentPane.add(p3);
		
		p1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				allgame con = new allgame();
				con.setVisible(true);
				gui.i = 9;
			}
		});
		
		p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				allgame_2 con = new allgame_2();
				con.setVisible(true);
				gui.i = 92;
			}
		});
		
		k1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p13_duel_link con = new p13_duel_link();
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
