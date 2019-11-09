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

public class allgame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					allgame frame = new allgame();
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
	public allgame() {
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
		
		Image img001 = new ImageIcon(this.getClass().getResource("/jumpfore.png")).getImage();
		Image img002 = new ImageIcon(this.getClass().getResource("/dirtrally.jpg")).getImage();
		Image img003 = new ImageIcon(this.getClass().getResource("/rainbow6.jpg")).getImage();
		Image img004 = new ImageIcon(this.getClass().getResource("/ark survival.png")).getImage();
		Image img005 = new ImageIcon(this.getClass().getResource("/overwatch.jpg")).getImage();
		Image img006 = new ImageIcon(this.getClass().getResource("/monster hunter world.jpg")).getImage();
		
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
		
		JButton k4 = new JButton("");
		k4.setIcon(new ImageIcon(img004));
		k4.setBackground(Color.BLACK);
		k4.setBounds(72, 323, 144, 197);
		contentPane.add(k4);
		
		JButton k5 = new JButton("");
		k5.setIcon(new ImageIcon(img005));
		k5.setBackground(Color.BLACK);
		k5.setBounds(250, 323, 144, 197);
		contentPane.add(k5);
		
		JButton k6 = new JButton("");
		k6.setIcon(new ImageIcon(img006));
		k6.setBackground(Color.BLACK);
		k6.setBounds(428, 323, 144, 197);
		contentPane.add(k6);
		
		JLabel n1 = new JLabel("Jump Force");
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setBackground(SystemColor.activeCaption);
		n1.setBounds(72, 269, 144, 23);
		contentPane.add(n1);
		
		JLabel n2 = new JLabel("DiRT Rally");
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setBackground(SystemColor.activeCaption);
		n2.setBounds(250, 269, 144, 23);
		contentPane.add(n2);
		
		JLabel n3 = new JLabel("Tom Clancy's Rainbow Six Siege");
		n3.setHorizontalAlignment(SwingConstants.CENTER);
		n3.setBackground(SystemColor.activeCaption);
		n3.setBounds(420, 269, 166, 23);
		contentPane.add(n3);
		
		JLabel n4 = new JLabel("ARK: Survival Evolved");
		n4.setHorizontalAlignment(SwingConstants.CENTER);
		n4.setBackground(SystemColor.activeCaption);
		n4.setBounds(72, 531, 144, 23);
		contentPane.add(n4);
		
		JLabel n5 = new JLabel("Overwatch");
		n5.setHorizontalAlignment(SwingConstants.CENTER);
		n5.setBackground(SystemColor.activeCaption);
		n5.setBounds(250, 531, 144, 23);
		contentPane.add(n5);
		
		JLabel n6 = new JLabel("MONSTER HUNTER: WORLD");
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
		p1.setBounds(249, 595, 39, 25);
		contentPane.add(p1);
		
		JButton p2 = new JButton("2");
		p2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		p2.setBounds(303, 595, 39, 25);
		contentPane.add(p2);
		
		JButton p3 = new JButton("3");
		p3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		p3.setBounds(355, 595, 39, 25);
		contentPane.add(p3);
		
		p2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				allgame_2 con = new allgame_2();
				con.setVisible(true);
				gui.i = 92;
			}
		});
		
		p3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				allgame_3 con = new allgame_3();
				con.setVisible(true);
				gui.i = 93;
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
				p02_dirtrally2 con = new p02_dirtrally2();
				con.setVisible(true);
			}
		});
		
		k3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p03_rainbow6 con = new p03_rainbow6();
				con.setVisible(true);
			}
		});
		
		k4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p04_ark_survival con = new p04_ark_survival();
				con.setVisible(true);
			}
		});
		
		k5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p05_overwatch con = new p05_overwatch();
				con.setVisible(true);
			}
		});
		
		k6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p06_monster_hunter_world con = new p06_monster_hunter_world();
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
