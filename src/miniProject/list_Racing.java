package miniProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class list_Racing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list_Racing frame = new list_Racing();
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
	public list_Racing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 682);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnracing = new JTextPane();
		txtpnracing.setText("[Racing]");
		txtpnracing.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		txtpnracing.setEditable(false);
		txtpnracing.setBackground(SystemColor.activeCaption);
		txtpnracing.setBounds(10, 11, 144, 39);
		contentPane.add(txtpnracing);
		
		JLabel n1 = new JLabel("DiRT Rally");
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n1.setBackground(SystemColor.activeCaption);
		n1.setBounds(72, 269, 144, 23);
		contentPane.add(n1);
		
		JLabel n2 = new JLabel("2D Combat Racing");
		n2.setHorizontalAlignment(SwingConstants.CENTER);
		n2.setBackground(SystemColor.activeCaption);
		n2.setBounds(250, 269, 144, 23);
		contentPane.add(n2);
		
		JButton back = new JButton("BACK");
		back.setBackground(SystemColor.menu);
		back.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		back.setBounds(22, 595, 89, 23);
		contentPane.add(back);
		
		JButton k1 = new JButton("");
		k1.setBackground(SystemColor.desktop);
		Image img001 = new ImageIcon(this.getClass().getResource("/dirtrally.jpg")).getImage();
		k1.setIcon(new ImageIcon(img001));
		k1.setBounds(72, 64, 144, 197);
		contentPane.add(k1);
		
		JButton k2 = new JButton("");
		k2.setBackground(SystemColor.desktop);
		Image img002 = new ImageIcon(this.getClass().getResource("/2D Combat Racing.png")).getImage();
		k2.setIcon(new ImageIcon(img002));
		k2.setBounds(250, 61, 144, 197);
		contentPane.add(k2);
		
		k1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p02_dirtrally2 con = new p02_dirtrally2();
				con.setVisible(true);
			}
		});
		
		k2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				p14_2D_combat_racing con = new p14_2D_combat_racing();
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
