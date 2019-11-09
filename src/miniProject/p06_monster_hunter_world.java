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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class p06_monster_hunter_world extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p06_monster_hunter_world frame = new p06_monster_hunter_world();
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
	public p06_monster_hunter_world() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("MONSTER HUNTER: WORLD");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblNewLabel.setBounds(357, 44, 220, 46);
		contentPane.add(lblNewLabel);

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(SystemColor.activeCaption);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane.setText(
				"\u0E04\u0E27\u0E32\u0E21\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E23\u0E30\u0E1A\u0E1A\r\n\u0E02\u0E31\u0E49\u0E19\u0E15\u0E48\u0E33:\r\n\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1B\u0E23\u0E30\u0E21\u0E27\u0E25\u0E1C\u0E25\u0E41\u0E25\u0E30\u0E23\u0E30\u0E1A\u0E1A\u0E1B\u0E0F\u0E34\u0E1A\u0E31\u0E15\u0E34\u0E01\u0E32\u0E23\u0E41\u0E1A\u0E1A 64 \u0E1A\u0E34\u0E15\r\n\u0E23\u0E30\u0E1A\u0E1A\u0E1B\u0E0F\u0E34\u0E1A\u0E31\u0E15\u0E34\u0E01\u0E32\u0E23: WINDOWS\u00AE 7, 8, 8.1, 10 (64-bit required)\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1B\u0E23\u0E30\u0E21\u0E27\u0E25\u0E1C\u0E25: Intel\u00AE Core\u2122 i5-4460, 3.20GHz or AMD FX\u2122-6300\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E04\u0E27\u0E32\u0E21\u0E08\u0E33: \u0E41\u0E23\u0E21 8 GB\r\n\u0E01\u0E23\u0E32\u0E1F\u0E34\u0E01\u0E2A\u0E4C: NVIDIA\u00AE GeForce\u00AE GTX 760 or AMD Radeon\u2122 R7 260x (VRAM 2GB)\r\nDirectX: \u0E40\u0E27\u0E2D\u0E23\u0E4C\u0E0A\u0E31\u0E19 11\r\n\u0E40\u0E04\u0E23\u0E37\u0E2D\u0E02\u0E48\u0E32\u0E22: \u0E01\u0E32\u0E23\u0E40\u0E0A\u0E37\u0E48\u0E2D\u0E21\u0E15\u0E48\u0E2D\u0E2D\u0E34\u0E19\u0E40\u0E17\u0E2D\u0E23\u0E4C\u0E40\u0E19\u0E47\u0E15\u0E41\u0E1A\u0E1A\u0E1A\u0E23\u0E2D\u0E14\u0E41\u0E1A\u0E19\u0E14\u0E4C\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1A\u0E31\u0E19\u0E17\u0E36\u0E01\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25: \u0E1E\u0E37\u0E49\u0E19\u0E17\u0E35\u0E48\u0E27\u0E48\u0E32\u0E07\u0E17\u0E35\u0E48\u0E1E\u0E23\u0E49\u0E2D\u0E21\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19 30 GB\r\n\u0E01\u0E32\u0E23\u0E4C\u0E14\u0E40\u0E2A\u0E35\u0E22\u0E07: DirectSound (DirectX\u00AE 9.0c)\r\n\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E2B\u0E15\u0E38\u0E40\u0E1E\u0E34\u0E48\u0E21\u0E40\u0E15\u0E34\u0E21: 1080p/30fps when graphics settings are set to \"Low\"\r\n");
		textPane.setBounds(42, 343, 488, 249);
		contentPane.add(textPane);

		JLabel monster_hunter_world = new JLabel("");
		Image img006 = new ImageIcon(this.getClass().getResource("/Bmonster hunter world.jpg")).getImage();
		monster_hunter_world.setIcon(new ImageIcon(img006));
		monster_hunter_world.setHorizontalAlignment(SwingConstants.CENTER);
		monster_hunter_world.setBounds(42, 43, 230, 272);
		contentPane.add(monster_hunter_world);

		JLabel textField = new JLabel();
		DecimalFormat value = new DecimalFormat("#.##");
		textField.setText("\u0E04\u0E30\u0E41\u0E19\u0E19   " + value.format(gui.total6));
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
							gui.s6 = gui.s6 + 1;
							gui.n6 ++;
							v = false;
						} else if (radio2.isSelected()) {
							gui.s6 = gui.s6 + 2;
							gui.n6 ++;
							v = false;
						} else if (radio3.isSelected()) {
							gui.s6 = gui.s6 + 3;
							gui.n6 ++;
							v = false;
						} else if (radio4.isSelected()) {
							gui.s6 = gui.s6 + 4;
							gui.n6 ++;
							v = false;
						} else if (radio5.isSelected()) {
							gui.s6 = gui.s6 + 5;
							gui.n6 ++;
							v = false;
						}
						gui.total6 = gui.s6 / gui.n6;
						textField.setText("§–·ππ   " + value.format(gui.total6));
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
				if (gui.i == 1) {
					dispose();
					list_RPG con = new list_RPG();
					con.setVisible(true);
				} else if (gui.i == 5) {
					dispose();
					list_Adventure con = new list_Adventure();
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
		back.setBackground(Color.WHITE);
		back.setBounds(24, 603, 97, 29);
		contentPane.add(back);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setText(
				"\u0E23\u0E32\u0E04\u0E32 1,199 \u0E1A\u0E32\u0E17 \r\n\r\n\u0E42\u0E2B\u0E25\u0E14\u0E43\u0E19 Steam , PS4\r\n\r\n\u0E41\u0E19\u0E27 \u0E1C\u0E08\u0E0D\u0E20\u0E31\u0E22 , RPG , \u0E41\u0E2D\u0E47\u0E04\u0E0A\u0E31\u0E48\u0E19\r\n");
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane_1.setBackground(SystemColor.activeCaption);
		textPane_1.setBounds(321, 101, 209, 118);
		contentPane.add(textPane_1);
	}

}
