/**
 * 
 */
package steven.conaway.memory;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * @author Steven
 *
 */
public class Memory extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int GRIDSIZE = 3;
	//private PicButton picbtn = new PicButton();
	//private PicButton[][] picbtn = new PicButton[GRIDSIZE][GRIDSIZE];
	private Random rand = new Random();
	private ClassLoader cl = this.getClass().getClassLoader();
	private String[] imagelist = {"images/image01.jpg", "images/image02.jpg","images/image03.jpg","images/image04.jpg"};
	private ArrayList<String> images = new ArrayList<String>();
	private String icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9;
	private int oldi;
	//private int[][] imageNumbers;
	private JButton btn1 = new JButton();
	private JButton btn2 = new JButton();
	private JButton btn3 = new JButton();
	private JButton btn4 = new JButton();
	private JButton btn5 = new JButton();
	private JButton btn6 = new JButton();
	private JButton btn7 = new JButton();
	private JButton btn8 = new JButton();
	private JButton btn9 = new JButton();

	public Memory() {
		initGUI();
		setTitle("Memory");
		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	
	private void initGUI() {
		assignimages();
		TitleLabel Title = new TitleLabel("Memory");
		add(Title, BorderLayout.PAGE_START);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(GRIDSIZE, GRIDSIZE));
		add(centerPanel, BorderLayout.CENTER);
		
		icon1 = images.get(0);
		Dimension size = new Dimension(150,150);
		btn1.setPreferredSize(size);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				btn1.setIcon(new ImageIcon(cl.getResource(icon1)));
				}
		});
		centerPanel.add(btn1);
		
		icon2 = images.get(1);
		btn2.setPreferredSize(size);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				btn2.setIcon(new ImageIcon(cl.getResource(icon2)));
				}
		});
		centerPanel.add(btn2);
		
		icon3 = images.get(2);
		btn3.setPreferredSize(size);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				btn3.setIcon(new ImageIcon(cl.getResource(icon3)));
				}
		});
		centerPanel.add(btn3);
		
		icon4 = images.get(3);
		btn4.setPreferredSize(size);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				btn4.setIcon(new ImageIcon(cl.getResource(icon4)));
				}
		});
		centerPanel.add(btn4);
		
		icon5 = images.get(4);
		btn5.setPreferredSize(size);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				btn5.setIcon(new ImageIcon(cl.getResource(icon5)));
				}
		});
		centerPanel.add(btn5);
		
		icon6 = images.get(5);
		btn6.setPreferredSize(size);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				btn6.setIcon(new ImageIcon(cl.getResource(icon6)));
				}
		});
		centerPanel.add(btn6);
		
		icon7 = images.get(6);
		btn7.setPreferredSize(size);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				btn7.setIcon(new ImageIcon(cl.getResource(icon7)));
				}
		});
		centerPanel.add(btn7);
		
		icon8 = images.get(7);
		btn8.setPreferredSize(size);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				btn8.setIcon(new ImageIcon(cl.getResource(icon8)));
				}
		});
		centerPanel.add(btn8);
		
		icon9 = images.get(8);
		btn9.setPreferredSize(size);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				btn9.setIcon(new ImageIcon(cl.getResource(icon9)));
				}
		});
		centerPanel.add(btn9);
		/**/
		
		
	}
	private void assignimages() {
		for (int x=0;x<GRIDSIZE*GRIDSIZE;x++) {
			int i = rand.nextInt(4);
			
			
			if (oldi == i) {
				i = rand.nextInt(GRIDSIZE);
			}
			images.add(imagelist[i]);
			oldi = i;
		}
		for (int x=0;x<images.size();x++) {
			System.out.println(images.get(x));
		}
	}
	
	public static void main(String[] args) {
	  	try {
			String className = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(className);
		}
		catch (Exception e) {}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			new Memory();
			}
		});
	}
}
