package miniProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class list_Adventure extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list_Adventure frame = new list_Adventure();
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
	public list_Adventure() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane txtpnadventure = new JTextPane();
		txtpnadventure.setText("[Adventure]");
		txtpnadventure.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		txtpnadventure.setEditable(false);
		txtpnadventure.setBackground(SystemColor.activeCaption);
		txtpnadventure.setBounds(10, 11, 144, 39);
		contentPane.add(txtpnadventure);

		JLabel n1 = new JLabel("ARK: Survival Evolved");
		n1.setBackground(SystemColor.activeCaption);
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setBounds(72, 269, 144, 23);
		contentPane.add(n1);

		JLabel n2 = new JLabel("MONSTER HUNTER: WORLD");
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setBackground(new Color(153, 180, 209));
		n2.setBounds(250, 269, 144, 23);
		contentPane.add(n2);

		JLabel n3 = new JLabel("Star wars fallen order");
		n3.setHorizontalAlignment(SwingConstants.CENTER);
		n3.setBackground(SystemColor.activeCaption);
		n3.setBounds(433, 269, 139, 23);
		contentPane.add(n3);

		JLabel n4 = new JLabel("Hearthstone");
		n4.setBackground(SystemColor.activeCaption);
		n4.setHorizontalAlignment(SwingConstants.CENTER);
		n4.setBounds(72, 531, 144, 23);
		contentPane.add(n4);

		JLabel n5 = new JLabel("Trove");
		n5.setBackground(SystemColor.activeCaption);
		n5.setHorizontalAlignment(SwingConstants.CENTER);
		n5.setBounds(250, 531, 144, 23);
		contentPane.add(n5);

		JButton back = new JButton("BACK");
		back.setBackground(SystemColor.menu);
		back.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		back.setBounds(22, 595, 99, 23);
		contentPane.add(back);

		JButton k1 = new JButton("");
		k1.setBackground(SystemColor.desktop);
		Image img001 = new ImageIcon(this.getClass().getResource("/ark survival.png")).getImage();
		k1.setIcon(new ImageIcon(img001));
		k1.setBounds(72, 61, 144, 197);
		contentPane.add(k1);

		JButton k2 = new JButton("");
		k2.setBackground(SystemColor.desktop);
		Image img002 = new ImageIcon(this.getClass().getResource("/monster hunter world.jpg")).getImage();
		k2.setIcon(new ImageIcon(img002));
		k2.setBounds(250, 61, 144, 197);
		contentPane.add(k2);

		JButton k3 = new JButton("");
		k3.setBackground(SystemColor.desktop);
		Image img003 = new ImageIcon(this.getClass().getResource("/star wars jedi fallen order.jpg")).getImage();
		k3.setIcon(new ImageIcon(img003));
		k3.setBounds(428, 61, 144, 197);
		contentPane.add(k3);

		JButton k4 = new JButton("");
		k4.setBackground(SystemColor.desktop);
		Image img004 = new ImageIcon(this.getClass().getResource("/Hearthstone.png")).getImage();
		k4.setIcon(new ImageIcon(img004));
		k4.setBounds(72, 323, 144, 197);
		contentPane.add(k4);

		JButton k5 = new JButton("");
		k5.setBackground(SystemColor.desktop);
		Image img005 = new ImageIcon(this.getClass().getResource("/trove.png")).getImage();
		k5.setIcon(new ImageIcon(img005));
		k5.setBounds(250, 323, 145, 197);
		contentPane.add(k5);
		
		k1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p04_ark_survival con = new p04_ark_survival();
				con.setVisible(true);
			}
		});
		
		k2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p06_monster_hunter_world con = new p06_monster_hunter_world();
				con.setVisible(true);
			}
		});
		
		k3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p08_starwars_jedi_fallen_order con = new p08_starwars_jedi_fallen_order();
				con.setVisible(true);
			}
		});
		
		k4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p10_heartstone con = new p10_heartstone();
				con.setVisible(true);
			}
		});
		
		k5.addActionListener(new ActionListener() {
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
