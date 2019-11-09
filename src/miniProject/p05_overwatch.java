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

public class p05_overwatch extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p05_overwatch frame = new p05_overwatch();
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
	public p05_overwatch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane txtpnFps = new JTextPane();
		txtpnFps.setEditable(false);
		txtpnFps.setBackground(SystemColor.activeCaption);
		txtpnFps.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnFps.setText(
				"\u0E04\u0E27\u0E32\u0E21\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E23\u0E30\u0E1A\u0E1A\r\n\u0E02\u0E31\u0E49\u0E19\u0E15\u0E48\u0E33:\r\n\u0E23\u0E30\u0E1A\u0E1A\u0E1B\u0E0F\u0E34\u0E1A\u0E31\u0E15\u0E34\u0E01\u0E32\u0E23: Windows 7/8.1/10 (64-bit versions)\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1B\u0E23\u0E30\u0E21\u0E27\u0E25\u0E1C\u0E25: Intel Core i5-2400/AMD FX-8320 or better\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E04\u0E27\u0E32\u0E21\u0E08\u0E33: \u0E41\u0E23\u0E21 8 GB\r\n\u0E01\u0E23\u0E32\u0E1F\u0E34\u0E01\u0E2A\u0E4C: NVIDIA GTX 670 2GB/AMD Radeon HD 7870 2GB or better\r\nDirectX: \u0E40\u0E27\u0E2D\u0E23\u0E4C\u0E0A\u0E31\u0E19 10\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1A\u0E31\u0E19\u0E17\u0E36\u0E01\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25: \u0E1E\u0E37\u0E49\u0E19\u0E17\u0E35\u0E48\u0E27\u0E48\u0E32\u0E07\u0E17\u0E35\u0E48\u0E1E\u0E23\u0E49\u0E2D\u0E21\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19 60 GB\r\n");
		txtpnFps.setBounds(42, 343, 488, 249);
		contentPane.add(txtpnFps);

		JLabel overwatch = new JLabel("");
		Image img005 = new ImageIcon(this.getClass().getResource("/Boverwatch.jpg")).getImage();
		overwatch.setIcon(new ImageIcon(img005));
		overwatch.setHorizontalAlignment(SwingConstants.CENTER);
		overwatch.setBounds(42, 43, 230, 272);
		contentPane.add(overwatch);

		JLabel textField = new JLabel();
		DecimalFormat value = new DecimalFormat("#.##");
		textField.setText("\u0E04\u0E30\u0E41\u0E19\u0E19   " + value.format(gui.total5));
		textField.setBackground(SystemColor.activeCaption);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(321, 219, 195, 37);
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
							gui.s5 = gui.s5 + 1;
							gui.n5 ++;
							v = false;
						} else if (radio2.isSelected()) {
							gui.s5 = gui.s5 + 2;
							gui.n5 ++;
							v = false;
						} else if (radio3.isSelected()) {
							gui.s5 = gui.s5 + 3;
							gui.n5 ++;
							v = false;
						} else if (radio4.isSelected()) {
							gui.s5 = gui.s5 + 4;
							gui.n5 ++;
							v = false;
						} else if (radio5.isSelected()) {
							gui.s5 = gui.s5 + 5;
							gui.n5 ++;
							v = false;
						}
						gui.total5 = gui.s5 / gui.n5;
						textField.setText("§–·ππ   " + value.format(gui.total5));
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
				if (gui.i == 2) {
					dispose();
					list_FPS con = new list_FPS();
					con.setVisible(true);
				} else if (gui.i == 3) {
					dispose();
					list_Moba con = new list_Moba();
					con.setVisible(true);
				} else if (gui.i == 7) {
					dispose();
					list_Action con = new list_Action();
					con.setVisible(true);
				} else if (gui.i == 9) {
					dispose();
					allgame con = new allgame();
					con.setVisible(true);
				}
			}
		});
		back.setFont(new Font("Tahoma", Font.PLAIN, 15));
		back.setBounds(24, 603, 97, 29);
		contentPane.add(back);

		JLabel lblOverwatch = new JLabel("Overwatch");
		lblOverwatch.setHorizontalAlignment(SwingConstants.CENTER);
		lblOverwatch.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblOverwatch.setBounds(371, 43, 138, 46);
		contentPane.add(lblOverwatch);

		JTextPane txtpnUsd = new JTextPane();
		txtpnUsd.setEditable(false);
		txtpnUsd.setText(
				"\u0E23\u0E32\u0E04\u0E32 USD39.99 \r\n\r\n\u0E42\u0E2B\u0E25\u0E14\u0E43\u0E19 Battle.net ,  Nitendo Switch , PS4 , Xbox\r\n\r\n\u0E41\u0E19\u0E27 FPS , MOBA ,\u0E41\u0E2D\u0E47\u0E04\u0E0A\u0E31\u0E48\u0E19");
		txtpnUsd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnUsd.setBackground(SystemColor.activeCaption);
		txtpnUsd.setBounds(321, 101, 209, 118);
		contentPane.add(txtpnUsd);
	}

}
