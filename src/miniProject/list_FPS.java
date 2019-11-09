package miniProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class list_FPS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list_FPS frame = new list_FPS();
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
	public list_FPS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnfps = new JTextPane();
		txtpnfps.setEditable(false);
		txtpnfps.setBackground(SystemColor.activeCaption);
		txtpnfps.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		txtpnfps.setText("[FPS]");
		txtpnfps.setBounds(10, 11, 98, 34);
		contentPane.add(txtpnfps);
		
		JLabel n1 = new JLabel("Tom Clancy's Rainbow Six Siege");
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setBackground(SystemColor.activeCaption);
		n1.setBounds(38, 269, 212, 23);
		contentPane.add(n1);
		
		JLabel n2 = new JLabel("Overwatch");
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setBackground(SystemColor.activeCaption);
		n2.setBounds(250, 269, 144, 23);
		contentPane.add(n2);
		
		JButton k1 = new JButton("");
		k1.setBackground(SystemColor.desktop);
		Image img001 = new ImageIcon(this.getClass().getResource("/rainbow6.jpg")).getImage();
		k1.setIcon(new ImageIcon(img001));
		k1.setBounds(72, 61, 144, 197);
		contentPane.add(k1);
		
		JButton k2 = new JButton("");
		k2.setBackground(SystemColor.desktop);
		Image img002 = new ImageIcon(this.getClass().getResource("/overwatch.jpg")).getImage();
		k2.setIcon(new ImageIcon(img002));
		k2.setBounds(250, 61, 144, 197);
		contentPane.add(k2);
		
		JButton back = new JButton("BACK");
		back.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		back.setBackground(SystemColor.menu);
		back.setBounds(22, 595, 99, 23);
		contentPane.add(back);
		
		k1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p03_rainbow6 con = new p03_rainbow6();
				con.setVisible(true);
			}
		});
		
		k2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p05_overwatch con = new p05_overwatch();
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
