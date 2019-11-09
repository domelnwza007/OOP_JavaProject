package miniProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import java.awt.Scrollbar;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JCheckBox;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;

public class gui {
	
	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public static int i = 0;

	public static float n1 = 0;
	public static float s1 = 0;
	public static float total1 = 0;
	
	public static float n2 = 0;
	public static float s2 = 0;
	public static float total2 = 0;
	
	public static float n3 = 0;
	public static float s3 = 0;
	public static float total3 = 0;
	
	public static float n4 = 0;
	public static float s4 = 0;
	public static float total4 = 0;
	
	public static float n5 = 0;
	public static float s5 = 0;
	public static float total5 = 0;
	
	public static float n6 = 0;
	public static float s6 = 0;
	public static float total6 = 0;
	
	public static float n7 = 0;
	public static float s7 = 0;
	public static float total7 = 0;
	
	public static float n8 = 0;
	public static float s8 = 0;
	public static float total8 = 0;
	
	public static float n9 = 0;
	public static float s9 = 0;
	public static float total9 = 0;

	public static float n10 = 0;
	public static float s10 = 0;
	public static float total10 = 0;
	
	public static float n11 = 0;
	public static float s11 = 0;
	public static float total11 = 0;
	
	public static float n12 = 0;
	public static float s12 = 0;
	public static float total12 = 0;
	
	public static float n13 = 0;
	public static float s13 = 0;
	public static float total13 = 0;
	
	public static float n14 = 0;
	public static float s14 = 0;
	public static float total14 = 0;
	
	public static float n15 = 0;
	public static float s15 = 0;
	public static float total15 = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("gui");
		frame.setAlwaysOnTop(true);
		frame.setTitle("");
		frame.setBackground(SystemColor.activeCaption);
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 659, 682);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton new1 = new JButton("");
		new1.setForeground(Color.BLACK);
		new1.setBounds(72, 126, 135, 169);
		new1.setBackground(Color.BLACK);
		new1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				p01_jumpfore con = new p01_jumpfore();
				con.setVisible(true);
			}
		});
	
		Image img1 = new ImageIcon(this.getClass().getResource("/Newjumpfore.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/Newdirtrally2.jpg")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("/Newrainbow6.jpg")).getImage();
		
		new1.setIcon(new ImageIcon(img1));

		JButton new3 = new JButton("");
		new3.setForeground(Color.BLACK);
		new3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				p03_rainbow6 con = new p03_rainbow6();
				con.setVisible(true);
			}
		});
		new3.setBackground(Color.BLACK);
		new3.setHorizontalAlignment(SwingConstants.CENTER);
		new3.setBounds(429, 126, 135, 169);
		new3.setIcon(new ImageIcon(img3));

		JLabel label = new JLabel("NEW GAME");
		label.setForeground(SystemColor.desktop);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(237, 41, 165, 55);
		label.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 30));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(new1);

		JButton new2 = new JButton("");
		new2.setForeground(Color.BLACK);
		new2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				p02_dirtrally2 con = new p02_dirtrally2();
				con.setVisible(true);
			}
		});
		new2.setBackground(Color.BLACK);
		new2.setHorizontalAlignment(SwingConstants.CENTER);
		new2.setBounds(250, 126, 135, 169);
		new2.setIcon(new ImageIcon(img2));
		frame.getContentPane().add(new2);
		frame.getContentPane().add(new3);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("Type Game");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(31, 389, 165, 46);
		label_1.setForeground(SystemColor.desktop);
		label_1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 25));
		label_1.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(label_1);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(31, 448, 413, 156);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));

		JCheckBox box1 = new JCheckBox("RPG");
		box1.setForeground(Color.BLACK);
		buttonGroup.add(box1);
		panel.add(box1);
		box1.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box1.setBackground(SystemColor.activeCaption);

		JCheckBox box2 = new JCheckBox("FPS");
		box2.setForeground(Color.BLACK);
		buttonGroup.add(box2);
		panel.add(box2);
		box2.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box2.setBackground(SystemColor.activeCaption);

		JCheckBox box3 = new JCheckBox("Moba");
		box3.setForeground(Color.BLACK);
		buttonGroup.add(box3);
		panel.add(box3);
		box3.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box3.setBackground(SystemColor.activeCaption);

		JCheckBox box4 = new JCheckBox("Sport");
		box4.setForeground(Color.BLACK);
		buttonGroup.add(box4);
		panel.add(box4);
		box4.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box4.setBackground(SystemColor.activeCaption);

		JCheckBox box5 = new JCheckBox("Adventure");
		box5.setForeground(Color.BLACK);
		buttonGroup.add(box5);
		panel.add(box5);
		box5.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box5.setBackground(SystemColor.activeCaption);

		JCheckBox box6 = new JCheckBox("Strategy");
		box6.setForeground(Color.BLACK);
		buttonGroup.add(box6);
		panel.add(box6);
		box6.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box6.setBackground(SystemColor.activeCaption);

		JCheckBox box7 = new JCheckBox("Action");
		box7.setForeground(Color.BLACK);
		buttonGroup.add(box7);
		panel.add(box7);
		box7.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box7.setBackground(SystemColor.activeCaption);

		JCheckBox box8 = new JCheckBox("Racing");
		box8.setForeground(Color.BLACK);
		buttonGroup.add(box8);
		panel.add(box8);
		box8.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
		box8.setBackground(SystemColor.activeCaption);

		JButton btnNext = new JButton("NEXT");
		btnNext.setBounds(512, 581, 99, 23);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (box1.isSelected()) {
					frame.dispose();
					list_RPG con = new list_RPG();
					con.setVisible(true);
					i=1;
				} else if (box2.isSelected()) {
					frame.dispose();
					list_FPS con = new list_FPS();
					con.setVisible(true);
					i=2;
				} else if (box3.isSelected()) {
					frame.dispose();
					list_Moba con = new list_Moba();
					con.setVisible(true);
					i=3;
				} else if (box4.isSelected()) {
					frame.dispose();
					list_Sport con = new list_Sport();
					con.setVisible(true);
					i=4;
				} else if (box5.isSelected()) {
					frame.dispose();
					list_Adventure con = new list_Adventure();
					con.setVisible(true);
					i=5;
				} else if (box6.isSelected()) {
					frame.dispose();
					list_Strategy con = new list_Strategy();
					con.setVisible(true);
					i=6;
				} else if (box7.isSelected()) {
					frame.dispose();
					list_Action con = new list_Action();
					con.setVisible(true);
					i=7;
				} else if (box8.isSelected()) {
					frame.dispose();
					list_Racing con = new list_Racing();
					con.setVisible(true);
					i=8;
				} else {
					frame.dispose();
					allgame con = new allgame();
					con.setVisible(true);
					i=9;
				}
			}
		});
		btnNext.setForeground(SystemColor.desktop);
		btnNext.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		btnNext.setBackground(SystemColor.menu);
		frame.getContentPane().add(btnNext);
	}
}
