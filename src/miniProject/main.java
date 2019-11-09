package miniProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;

public class main extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Image img1 = new ImageIcon(this.getClass().getResource("/Newjumpfore.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/Newdirtrally2.jpg")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("/Newrainbow6.jpg")).getImage();

		JButton new1 = new JButton("");
		new1.setForeground(Color.BLACK);
		new1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p01_jumpfore con = new p01_jumpfore();
				con.setVisible(true);
			}
		});
		new1.setBackground(Color.BLACK);
		new1.setIcon(new ImageIcon(img1));
		new1.setBounds(72, 126, 135, 169);
		contentPane.add(new1);

		JButton new2 = new JButton("");
		new2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p02_dirtrally2 con = new p02_dirtrally2();
				con.setVisible(true);
			}
		});
		new2.setBackground(Color.BLACK);
		new2.setIcon(new ImageIcon(img2));
		new2.setBounds(250, 126, 135, 169);
		contentPane.add(new2);

		JButton new3 = new JButton("");
		new3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p03_rainbow6 con = new p03_rainbow6();
				con.setVisible(true);
			}
		});
		new3.setBackground(Color.BLACK);
		new3.setIcon(new ImageIcon(img3));
		new3.setBounds(429, 126, 135, 169);
		contentPane.add(new3);

		JLabel label = new JLabel("NEW GAME");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 30));
		label.setBounds(237, 41, 165, 55);
		contentPane.add(label);

		JLabel label_1 = new JLabel("Type Game");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 25));
		label_1.setBackground(SystemColor.activeCaption);
		label_1.setBounds(31, 389, 165, 46);
		contentPane.add(label_1);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(31, 448, 413, 156);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));

		JCheckBox box1 = new JCheckBox("RPG");
		buttonGroup.add(box1);
		box1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box1.setBackground(SystemColor.activeCaption);
		panel.add(box1);

		JCheckBox box2 = new JCheckBox("FPS");
		buttonGroup.add(box2);
		box2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box2.setBackground(SystemColor.activeCaption);
		panel.add(box2);

		JCheckBox box3 = new JCheckBox("Moba");
		buttonGroup.add(box3);
		box3.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box3.setBackground(SystemColor.activeCaption);
		panel.add(box3);

		JCheckBox box4 = new JCheckBox("Sport");
		buttonGroup.add(box4);
		box4.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box4.setBackground(SystemColor.activeCaption);
		panel.add(box4);

		JCheckBox box5 = new JCheckBox("Adventure");
		buttonGroup.add(box5);
		box5.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box5.setBackground(SystemColor.activeCaption);
		panel.add(box5);

		JCheckBox box6 = new JCheckBox("Strategy");
		buttonGroup.add(box6);
		box6.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box6.setBackground(SystemColor.activeCaption);
		panel.add(box6);

		JCheckBox box7 = new JCheckBox("Action");
		buttonGroup.add(box7);
		box7.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box7.setBackground(SystemColor.activeCaption);
		panel.add(box7);

		JCheckBox box8 = new JCheckBox("Racing");
		buttonGroup.add(box8);
		box8.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box8.setBackground(SystemColor.activeCaption);
		panel.add(box8);

		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (box1.isSelected()) {
					dispose();
					list_RPG con = new list_RPG();
					con.setVisible(true);
					gui.i=1;
				} else if (box2.isSelected()) {
					dispose();
					list_FPS con = new list_FPS();
					con.setVisible(true);
					gui.i=2;
				} else if (box3.isSelected()) {
					dispose();
					list_Moba con = new list_Moba();
					con.setVisible(true);
					gui.i=3;
				} else if (box4.isSelected()) {
					dispose();
					list_Sport con = new list_Sport();
					con.setVisible(true);
					gui.i=4;
				} else if (box5.isSelected()) {
					dispose();
					list_Adventure con = new list_Adventure();
					con.setVisible(true);
					gui.i=5;
				} else if (box6.isSelected()) {
					dispose();
					list_Strategy con = new list_Strategy();
					con.setVisible(true);
					gui.i=6;
				} else if (box7.isSelected()) {
					dispose();
					list_Action con = new list_Action();
					con.setVisible(true);
					gui.i=7;
				} else if (box8.isSelected()) {
					dispose();
					list_Racing con = new list_Racing();
					con.setVisible(true);
					gui.i=8;
				} else {
					dispose();
					allgame con = new allgame();
					con.setVisible(true);
					gui.i=9;
				}
			}
		});

		btnNext.setForeground(Color.BLACK);
		btnNext.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		btnNext.setBackground(SystemColor.menu);
		btnNext.setBounds(512, 581, 99, 23);
		contentPane.add(btnNext);

	}
}
