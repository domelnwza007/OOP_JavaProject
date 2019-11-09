package miniProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Color;

public class p07_football_manager_2019 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p07_football_manager_2019 frame = new p07_football_manager_2019();
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
	public p07_football_manager_2019() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFootballManager = new JLabel("Football Manager 2019");
		lblFootballManager.setHorizontalAlignment(SwingConstants.CENTER);
		lblFootballManager.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblFootballManager.setBounds(371, 43, 209, 45);
		contentPane.add(lblFootballManager);

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(SystemColor.activeCaption);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane.setText(
				"\u0E04\u0E27\u0E32\u0E21\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E23\u0E30\u0E1A\u0E1A\r\n\u0E02\u0E31\u0E49\u0E19\u0E15\u0E48\u0E33: \u0E23\u0E30\u0E1A\u0E1A\u0E1B\u0E0F\u0E34\u0E1A\u0E31\u0E15\u0E34\u0E01\u0E32\u0E23: Windows 7 (SP1), 8/8.1, 10 (1803/April 2018 Update) \u2013 64-bit or 32-bit\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1B\u0E23\u0E30\u0E21\u0E27\u0E25\u0E1C\u0E25: Intel Pentium 4, Intel Core or AMD Athlon \u2013 2.2 GHz +\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E04\u0E27\u0E32\u0E21\u0E08\u0E33: \u0E41\u0E23\u0E21 2 GB\r\n\u0E01\u0E23\u0E32\u0E1F\u0E34\u0E01\u0E2A\u0E4C: Intel GMA X4500, NVIDIA GeForce 9600M GT or AMD/ATI Mobility Radeon HD 3650 \u2013 256MB VRAM\r\nDirectX: \u0E40\u0E27\u0E2D\u0E23\u0E4C\u0E0A\u0E31\u0E19 9.0c\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1A\u0E31\u0E19\u0E17\u0E36\u0E01\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25: \u0E1E\u0E37\u0E49\u0E19\u0E17\u0E35\u0E48\u0E27\u0E48\u0E32\u0E07\u0E17\u0E35\u0E48\u0E1E\u0E23\u0E49\u0E2D\u0E21\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19 7 GB\r\n");
		textPane.setBounds(42, 343, 488, 200);
		contentPane.add(textPane);

		JLabel football_manager_2019 = new JLabel("");
		Image img007 = new ImageIcon(this.getClass().getResource("/Bfootball manager 2019.png")).getImage();
		football_manager_2019.setIcon(new ImageIcon(img007));
		football_manager_2019.setHorizontalAlignment(SwingConstants.CENTER);
		football_manager_2019.setBounds(42, 43, 230, 272);
		contentPane.add(football_manager_2019);

		JLabel textField = new JLabel();
		DecimalFormat value = new DecimalFormat("#.##");
		textField.setText("\u0E04\u0E30\u0E41\u0E19\u0E19   " + value.format(gui.total7));
		textField.setBackground(SystemColor.activeCaption);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(321, 210, 195, 37);
		contentPane.add(textField);
		JButton s1 = new JButton("\u0E43\u0E2B\u0E49\u0E04\u0E30\u0E41\u0E19\u0E19");
		s1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame show = new JFrame("test");
				show.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				show.setBounds(100, 100, 343, 273);
				show.setTitle("„ÀÈ§–·ππ");
				show.getContentPane().setLayout(null);

				JRadioButton radio1 = new JRadioButton("1 point");
				radio1.setBounds(119, 32, 109, 23);
				show.getContentPane().add(radio1);

				JRadioButton radio2 = new JRadioButton("2 point");
				radio2.setBounds(119, 58, 109, 23);
				show.getContentPane().add(radio2);

				JRadioButton radio3 = new JRadioButton("3 point");
				radio3.setBounds(119, 84, 109, 23);
				show.getContentPane().add(radio3);

				JRadioButton radio4 = new JRadioButton("4 point");
				radio4.setBounds(119, 110, 109, 23);
				show.getContentPane().add(radio4);

				JRadioButton radio5 = new JRadioButton("5 point");
				radio5.setBounds(119, 136, 109, 23);
				show.getContentPane().add(radio5);

				JButton button = new JButton("ok");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						boolean v = true;
						if (radio1.isSelected()) {
							gui.s7 = gui.s7 + 1;
							gui.n7 ++;
							v = false;
						} else if (radio2.isSelected()) {
							gui.s7 = gui.s7 + 2;
							gui.n7 ++;
							v = false;
						} else if (radio3.isSelected()) {
							gui.s7 = gui.s7 + 3;
							gui.n7 ++;
							v = false;
						} else if (radio4.isSelected()) {
							gui.s7 = gui.s7 + 4;
							gui.n7 ++;
							v = false;
						} else if (radio5.isSelected()) {
							gui.s7 = gui.s7 + 5;
							gui.n7 ++;
							v = false;
						}
						gui.total7 = gui.s7 / gui.n7;
						textField.setText("§–·ππ   " + value.format(gui.total7));
						show.setVisible(v);
					}
				});
				JButton button1 = new JButton("cancel");
				button1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						show.setVisible(false);
					}
				});
				button.setBounds(5, 182, 109, 23);
				show.getContentPane().add(button);

				button1.setBounds(214, 182, 109, 23);
				show.getContentPane().add(button1);

				ButtonGroup group = new ButtonGroup();
				group.add(radio1);
				group.add(radio2);
				group.add(radio3);
				group.add(radio4);
				group.add(radio5);
				group.add(button);
				show.setVisible(true);
			}
		});
		s1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		s1.setBackground(Color.WHITE);
		s1.setBounds(321, 278, 108, 37);
		contentPane.add(s1);

		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (gui.i == 4) {
					dispose();
					list_Sport con = new list_Sport();
					con.setVisible(true);
				} else if (gui.i == 92) {
					dispose();
					allgame_2 con = new allgame_2();
					con.setVisible(true);
				}
			}
		});
		back.setFont(new Font("Tahoma", Font.PLAIN, 15));
		back.setBackground(Color.WHITE);
		back.setBounds(42, 581, 97, 29);
		contentPane.add(back);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setText(
				"\u0E23\u0E32\u0E04\u0E32 1,098  \r\n\r\n\u0E42\u0E2B\u0E25\u0E14\u0E43\u0E19 Steam\r\n\r\n\u0E41\u0E19\u0E27 \u0E01\u0E35\u0E2C\u0E32");
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane_1.setBackground(SystemColor.activeCaption);
		textPane_1.setBounds(321, 101, 161, 118);
		contentPane.add(textPane_1);
	}

}
