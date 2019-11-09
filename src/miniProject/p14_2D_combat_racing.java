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

public class p14_2D_combat_racing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p14_2D_combat_racing frame = new p14_2D_combat_racing();
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
	public p14_2D_combat_racing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rude Racers: 2D Combat Racing");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel.setBounds(334, 45, 262, 45);
		contentPane.add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.activeCaption);
		textPane.setEditable(false);
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane.setText("\u0E04\u0E27\u0E32\u0E21\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E23\u0E30\u0E1A\u0E1A\r\n\u0E02\u0E31\u0E49\u0E19\u0E15\u0E48\u0E33:\r\n\u0E23\u0E30\u0E1A\u0E1A\u0E1B\u0E0F\u0E34\u0E1A\u0E31\u0E15\u0E34\u0E01\u0E32\u0E23: Windows 7 and above\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1B\u0E23\u0E30\u0E21\u0E27\u0E25\u0E1C\u0E25: Intel i3\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E04\u0E27\u0E32\u0E21\u0E08\u0E33: \u0E41\u0E23\u0E21 4 GB\r\n\u0E01\u0E23\u0E32\u0E1F\u0E34\u0E01\u0E2A\u0E4C: Intel HD 400 (OpenGL 2.1 compatible)\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1A\u0E31\u0E19\u0E17\u0E36\u0E01\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25: \u0E1E\u0E37\u0E49\u0E19\u0E17\u0E35\u0E48\u0E27\u0E48\u0E32\u0E07\u0E17\u0E35\u0E48\u0E1E\u0E23\u0E49\u0E2D\u0E21\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19 100 MB\r\n\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E2B\u0E15\u0E38\u0E40\u0E1E\u0E34\u0E48\u0E21\u0E40\u0E15\u0E34\u0E21: Recommended Aspect Ratio 16:9\r\n");
		textPane.setBounds(42, 343, 488, 249);
		contentPane.add(textPane);
		
		JLabel combat_racing = new JLabel("");
		Image img014 = new ImageIcon(this.getClass().getResource("/B2D Combat Racing.png")).getImage();
		combat_racing.setIcon(new ImageIcon(img014));
		combat_racing.setHorizontalAlignment(SwingConstants.CENTER);
		combat_racing.setBounds(42, 43, 230, 272);
		contentPane.add(combat_racing);
		
		JLabel textField = new JLabel();
		DecimalFormat value = new DecimalFormat("#.##");
		textField.setText("\u0E04\u0E30\u0E41\u0E19\u0E19   "+value.format(gui.total14));
		textField.setBackground(SystemColor.activeCaption);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(321, 218, 195, 37);
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
							gui.s14 = gui.s14+1;
							gui.n14 ++;
							v = false;			
						}
						else if (radio2.isSelected()) {
							gui.s14 = gui.s14+2;
							gui.n14 ++;
							v = false;
						}
						else if (radio3.isSelected()) {
							gui.s14 = gui.s14+3;
							gui.n14 ++;
							v = false;
						}
						else if (radio4.isSelected()) {
							gui.s14 = gui.s14+4;
							gui.n14 ++;
							v = false;
						}
						else if (radio5.isSelected()) {
							gui.s14 = gui.s14+5;
							gui.n14 ++;
							v = false;
						}
						gui.total14 = gui.s14/gui.n14;
						textField.setText("§–·ππ   "+value.format(gui.total14));
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
				if(gui.i==72) {
					dispose();
					list_Action2 con = new list_Action2();
					con.setVisible(true);
				}
				else if(gui.i==8) {
					dispose();
					list_Racing con = new list_Racing();
					con.setVisible(true);
				}
				else if(gui.i==93) {
					dispose();
					allgame_3 con = new allgame_3();
					con.setVisible(true);
				}
			}
		});
		back.setFont(new Font("Tahoma", Font.PLAIN, 15));
		back.setBackground(Color.WHITE);
		back.setBounds(24, 603, 97, 29);
		contentPane.add(back);
		
		JTextPane txtpnSteam = new JTextPane();
		txtpnSteam.setEditable(false);
		txtpnSteam.setText("\u0E1F\u0E23\u0E35\r\n\r\n\u0E42\u0E2B\u0E25\u0E14\u0E43\u0E19 Steam . Google play , app store\r\n\r\n\u0E41\u0E19\u0E27 \u0E01\u0E25\u0E22\u0E38\u0E17\u0E18\u0E4C , RPG");
		txtpnSteam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnSteam.setBackground(SystemColor.activeCaption);
		txtpnSteam.setBounds(321, 101, 222, 118);
		contentPane.add(txtpnSteam);
	}

}
