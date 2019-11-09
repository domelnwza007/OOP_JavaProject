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

public class p03_rainbow6 extends JFrame {

	private JPanel contentPane;
	private JLabel textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					p03_rainbow6 frame = new p03_rainbow6();
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
	public p03_rainbow6() {
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
				"\u0E04\u0E27\u0E32\u0E21\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23\u0E02\u0E2D\u0E07\u0E23\u0E30\u0E1A\u0E1A\r\n\u0E02\u0E31\u0E49\u0E19\u0E15\u0E48\u0E33:\r\n \u0E23\u0E30\u0E1A\u0E1A\u0E1B\u0E0F\u0E34\u0E1A\u0E31\u0E15\u0E34\u0E01\u0E32\u0E23: Windows 7, Windows 8.1, Windows 10 (64bit versions required)\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1B\u0E23\u0E30\u0E21\u0E27\u0E25\u0E1C\u0E25: Intel Core i3 560 @ 3.3 GHz or AMD Phenom II X4 945 @ 3.0 GHz\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E04\u0E27\u0E32\u0E21\u0E08\u0E33: \u0E41\u0E23\u0E21 6 GB\r\n\u0E01\u0E23\u0E32\u0E1F\u0E34\u0E01\u0E2A\u0E4C: NVIDIA GeForce GTX 460 or AMD Radeon HD 5870\r\n\u0E2B\u0E19\u0E48\u0E27\u0E22\u0E1A\u0E31\u0E19\u0E17\u0E36\u0E01\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25: \u0E1E\u0E37\u0E49\u0E19\u0E17\u0E35\u0E48\u0E27\u0E48\u0E32\u0E07\u0E17\u0E35\u0E48\u0E1E\u0E23\u0E49\u0E2D\u0E21\u0E43\u0E0A\u0E49\u0E07\u0E32\u0E19 61 GB\r\n\u0E01\u0E32\u0E23\u0E4C\u0E14\u0E40\u0E2A\u0E35\u0E22\u0E07: DirectX\u00AE 9.0c compatible sound card with latest drivers\r\n");
		txtpnFps.setBounds(42, 343, 488, 249);
		contentPane.add(txtpnFps);
		
		JLabel rainbow6003 = new JLabel("");
		Image img003 = new ImageIcon(this.getClass().getResource("/Brainbow6.jpg")).getImage();
		rainbow6003.setIcon(new ImageIcon(img003));
		rainbow6003.setHorizontalAlignment(SwingConstants.CENTER);
		rainbow6003.setBounds(42, 43, 230, 272);
		contentPane.add(rainbow6003);
		
		textField = new JLabel();
		DecimalFormat value = new DecimalFormat("#.##");
		textField.setText("\u0E04\u0E30\u0E41\u0E19\u0E19   "+value.format(gui.total3));
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
							gui.s3 = gui.s3+1;
							gui.n3 ++;
							v = false;
						}
						else if (radio2.isSelected()) {
							gui.s3 = gui.s3+2;
							gui.n3 ++;
							v = false;
						}
						else if (radio3.isSelected()) {
							gui.s3 = gui.s3+3;
							gui.n3 ++;
							v = false;
						}
						else if (radio4.isSelected()) {
							gui.s3 = gui.s3+4;
							gui.n3 ++;
							v = false;
						}
						else if (radio5.isSelected()) {
							gui.s3 = gui.s3+5;
							gui.n3 ++;
							v = false;
						}
						gui.total3 = gui.s3/gui.n3;
						textField.setText("§–·ππ   "+value.format(gui.total3));
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
		
		JLabel lblTomClancysRainbow = new JLabel("Tom Clancy's Rainbow Six Siege");
		lblTomClancysRainbow.setHorizontalAlignment(SwingConstants.CENTER);
		lblTomClancysRainbow.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		lblTomClancysRainbow.setBounds(337, 43, 262, 46);
		contentPane.add(lblTomClancysRainbow);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("\u0E23\u0E32\u0E04\u0E32 600 \u0E1A\u0E32\u0E17\r\n\r\n\u0E42\u0E2B\u0E25\u0E14\u0E43\u0E19 Steam\r\n\r\n\u0E41\u0E19\u0E27 FPS , \u0E41\u0E2D\u0E47\u0E04\u0E0A\u0E31\u0E48\u0E19\r\n\r\n\r\n\r\n");
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPane.setBackground(SystemColor.activeCaption);
		textPane.setBounds(321, 101, 161, 118);
		contentPane.add(textPane);
		
		JButton back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (gui.i==0) {
					dispose();
					main con = new main();
					con.setVisible(true);
					gui.i=0;
				}
				else if(gui.i==2) {
					dispose();
					list_FPS con = new list_FPS();
					con.setVisible(true);
				}
				else if(gui.i==7) {
					dispose();
					list_Action con = new list_Action();
					con.setVisible(true);
				}
				else if(gui.i==9) {
					dispose();
					allgame con = new allgame();
					con.setVisible(true);
				}
			}
		});
		back.setFont(new Font("Tahoma", Font.PLAIN, 15));
		back.setBounds(24, 603, 97, 29);
		contentPane.add(back);
	}
}