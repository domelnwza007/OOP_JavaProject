package miniProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class list_RPG extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list_RPG frame = new list_RPG();
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
	public list_RPG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnRpg = new JTextPane();
		txtpnRpg.setEditable(false);
		txtpnRpg.setBackground(SystemColor.activeCaption);
		txtpnRpg.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		txtpnRpg.setText("[RPG]");
		txtpnRpg.setBounds(10, 11, 119, 39);
		contentPane.add(txtpnRpg);
		
		
		
		JLabel n1 = new JLabel("MONSTER HUNTER: WORLD");
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setBackground(SystemColor.activeCaption);
		n1.setBounds(72, 269, 144, 23);
		contentPane.add(n1);
		
		JLabel n2 = new JLabel("Yu-Gi-Oh! Duel Links");
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setBackground(SystemColor.activeCaption);
		n2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		n2.setBounds(250, 269, 144, 23);
		contentPane.add(n2);
		
		JLabel n3 = new JLabel("Trove");
		n3.setHorizontalAlignment(SwingConstants.CENTER);
		n3.setBackground(SystemColor.activeCaption);
		n3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		n3.setBounds(433, 269, 139, 23);
		contentPane.add(n3);
		
		JButton back = new JButton("BACK");
		back.setBackground(SystemColor.menu);
		back.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		back.setBounds(22, 595, 89, 23);
		contentPane.add(back);
		
		JButton k1 = new JButton("");
		k1.setBackground(SystemColor.windowText);
		Image img001 = new ImageIcon(this.getClass().getResource("/monster hunter world.jpg")).getImage();
		k1.setIcon(new ImageIcon(img001));
		k1.setBounds(72, 61, 144, 197);
		contentPane.add(k1);
		
		JButton k2 = new JButton("");
		k2.setBackground(SystemColor.desktop);
		Image img002 = new ImageIcon(this.getClass().getResource("/duel link.png")).getImage();
		k2.setIcon(new ImageIcon(img002));
		k2.setBounds(250, 61, 144, 197);
		contentPane.add(k2);
		
		JButton k3 = new JButton("");
		k3.setBackground(Color.BLACK);
		Image img003 = new ImageIcon(this.getClass().getResource("/trove.png")).getImage();
		k3.setIcon(new ImageIcon(img003));
		k3.setBounds(428, 61, 144, 197);
		contentPane.add(k3);
		
		k1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p06_monster_hunter_world con = new p06_monster_hunter_world();
				con.setVisible(true);
			}
		});
		
		k2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p13_duel_link con = new p13_duel_link();
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
