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

public class p09_dota2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p09_dota2 frame = new p09_dota2();
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
	public p09_dota2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Dota 2 ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(371, 43, 138, 45);
		contentPane.add(lblNewLabel);

		JTextPane txtpnMoba = new JTextPane();
		txtpnMoba.setEditable(false);
		txtpnMoba.setBackground(SystemColor.activeCaption);
		txtpnMoba.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnMoba.setText(
				"\u0E04\u0E27\u0E32\u0E21\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E23\u0E30\u0E1A\u0E1A\r\n\u0E02\u0E31\u0E49\u0E19\u0E15\u0E48\u0E33:\r\n\u0E23\u0E30\u0E1A\u0E1A\u0E1B\u0E0F\u0E34\u0E1A\u0E31\u0E15\u0E34\u0E01\u0E32\u0E23: Windows 7 or newer\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1B\u0E23\u0E30\u0E21\u0E27\u0E25\u0E1C\u0E25: Dual core from Intel or AMD at 2.8 GHz\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E04\u0E27\u0E32\u0E21\u0E08\u0E33: \u0E41\u0E23\u0E21 4 GB\r\n\u0E01\u0E23\u0E32\u0E1F\u0E34\u0E01\u0E2A\u0E4C: nVidia GeForce 8600/9600GT, ATI/AMD Radeon HD2600/3600\r\nDirectX: \u0E40\u0E27\u0E2D\u0E23\u0E4C\u0E0A\u0E31\u0E19 9.0c\r\n\u0E40\u0E04\u0E23\u0E37\u0E2D\u0E02\u0E48\u0E32\u0E22: \u0E01\u0E32\u0E23\u0E40\u0E0A\u0E37\u0E48\u0E2D\u0E21\u0E15\u0E48\u0E2D\u0E2D\u0E34\u0E19\u0E40\u0E17\u0E2D\u0E23\u0E4C\u0E40\u0E19\u0E47\u0E15\u0E41\u0E1A\u0E1A\u0E1A\u0E23\u0E2D\u0E14\u0E41\u0E1A\u0E19\u0E14\u0E4C\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1A\u0E31\u0E19\u0E17\u0E36\u0E01\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25: \u0E1E\u0E37\u0E49\u0E19\u0E17\u0E35\u0E48\u0E27\u0E48\u0E32\u0E07\u0E17\u0E35\u0E48\u0E1E\u0E23\u0E49\u0E2D\u0E21\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19 15 GB\r\n\u0E01\u0E32\u0E23\u0E4C\u0E14\u0E40\u0E2A\u0E35\u0E22\u0E07: DirectX Compatible\r\n");
		txtpnMoba.setBounds(42, 343, 488, 249);
		contentPane.add(txtpnMoba);

		JLabel dota2 = new JLabel("");
		Image img009 = new ImageIcon(this.getClass().getResource("/Bdota 2.jpg")).getImage();
		dota2.setIcon(new ImageIcon(img009));
		dota2.setHorizontalAlignment(SwingConstants.CENTER);
		dota2.setBounds(42, 43, 230, 272);
		contentPane.add(dota2);

		JTextPane txtpnSteam = new JTextPane();
		txtpnSteam.setEditable(false);
		txtpnSteam.setText(
				"\u0E1F\u0E23\u0E35\r\n\r\n\u0E42\u0E2B\u0E25\u0E14\u0E43\u0E19 Steam\r\n\r\n\u0E41\u0E19\u0E27 Moba , \u0E41\u0E2D\u0E47\u0E04\u0E0A\u0E31\u0E48\u0E19");
		txtpnSteam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnSteam.setBackground(SystemColor.activeCaption);
		txtpnSteam.setBounds(321, 101, 161, 118);
		contentPane.add(txtpnSteam);

		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (gui.i == 5) {
					dispose();
					list_Adventure con = new list_Adventure();
					con.setVisible(true);
				} else if (gui.i == 9) {
					dispose();
					allgame con = new allgame();
					con.setVisible(true);
				}
			}
		});
		back.setFont(new Font("Tahoma", Font.PLAIN, 15));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (gui.i == 3) {
					dispose();
					list_Moba con = new list_Moba();
					con.setVisible(true);
				} else if (gui.i == 6) {
					dispose();
					list_Strategy con = new list_Strategy();
					con.setVisible(true);
				} else if (gui.i == 7) {
					dispose();
					list_Action con = new list_Action();
					con.setVisible(true);
				} else if (gui.i == 92) {
					dispose();
					allgame_2 con = new allgame_2();
					con.setVisible(true);
				}
			}
		});
		back.setBackground(Color.WHITE);
		back.setBounds(24, 603, 97, 29);
		contentPane.add(back);

		JLabel textField = new JLabel();
		DecimalFormat value = new DecimalFormat("#.##");
		textField.setText("\u0E04\u0E30\u0E41\u0E19\u0E19   " + value.format(gui.total9));
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
				show.setTitle("����ṹ");
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
							gui.s9 = gui.s9 + 1;
							gui.n9++;
							v = false;
						} else if (radio2.isSelected()) {
							gui.s9 = gui.s9 + 2;
							gui.n9++;
							v = false;
						} else if (radio3.isSelected()) {
							gui.s9 = gui.s9 + 3;
							gui.n9++;
							v = false;
						} else if (radio4.isSelected()) {
							gui.s9 = gui.s9 + 4;
							gui.n9++;
							v = false;
						} else if (radio5.isSelected()) {
							gui.s9 = gui.s9 + 5;
							gui.n9++;
							v = false;
						}
						gui.total9 = gui.s9 / gui.n9;
						textField.setText("��ṹ   " + value.format(gui.total9));
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
	}

}