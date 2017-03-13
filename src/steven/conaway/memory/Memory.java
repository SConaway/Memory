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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
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
	private static final int GRIDSIZE = 4;
	private static final Random rand = new Random();
	private final ClassLoader cl = this.getClass().getClassLoader();
	private static final String[] imagelist = {"images/image01.jpg", "images/image02.jpg","images/image03.jpg","images/image04.jpg"};
	private ArrayList<String> images = new ArrayList<String>();
	private ArrayList<String> key = new ArrayList<String>();
	private ArrayList btnsPressed = new ArrayList(); //change to in arraylist
	private String icon0, icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9, icon10, icon11, icon12, icon13, icon14, icon15;
	private static final String icon = "";
	private int a, i, btnPressed = 0;
	
	private JButton btn0 = new JButton();
	private JButton btn1 = new JButton();
	private JButton btn2 = new JButton();
	private JButton btn3 = new JButton();
	private JButton btn4 = new JButton();
	private JButton btn5 = new JButton();
	private JButton btn6 = new JButton();
	private JButton btn7 = new JButton();
	private JButton btn8 = new JButton();
	private JButton btn9 = new JButton();
	private JButton btn10 = new JButton();
	private JButton btn11 = new JButton();
	private JButton btn12 = new JButton();
	private JButton btn13 = new JButton();
	private JButton btn14 = new JButton();
	private JButton btn15 = new JButton();

	private static final Dimension size = new Dimension(100,100);

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
		
		
		
		
		Timer checkTimer= new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGame();
			}

		});
		checkTimer.setRepeats(true);
		checkTimer.start();
		
		
		
		
		
		assignimages();
		TitleLabel Title = new TitleLabel("Memory");
		add(Title, BorderLayout.PAGE_START);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(GRIDSIZE, GRIDSIZE));
		add(centerPanel, BorderLayout.CENTER);
		
		icon0 = images.get(0);
		btn0.setPreferredSize(size);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 0);
				setIcon((JButton) e.getSource(), icon0);
				}
		});
		centerPanel.add(btn1);
		
		icon1 = images.get(1);
		btn1.setPreferredSize(size);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 1);
				setIcon((JButton) e.getSource(), icon1);
				}
		});
		centerPanel.add(btn2);
		
		icon2 = images.get(2);
		btn2.setPreferredSize(size);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 2);
				setIcon((JButton) e.getSource(), icon2);
				}
		});
		centerPanel.add(btn3);
		
		icon3 = images.get(3);
		btn3.setPreferredSize(size);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 3);
				setIcon((JButton) e.getSource(), icon3);
				}
		});
		centerPanel.add(btn4);
		
		icon4 = images.get(4);
		btn4.setPreferredSize(size);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 4);
				setIcon((JButton) e.getSource(), icon4);
				}
		});
		centerPanel.add(btn5);
		
		icon5 = images.get(5);
		btn5.setPreferredSize(size);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;
				btnsPressed.add("btn" + 5);
				setIcon((JButton) e.getSource(), icon5);
				}
		});
		centerPanel.add(btn6);
		
		icon6 = images.get(6);
		btn6.setPreferredSize(size);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 6);
				setIcon((JButton) e.getSource(), icon6);
				}
		});
		centerPanel.add(btn7);
		
		icon7 = images.get(7);
		btn7.setPreferredSize(size);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 7);
				setIcon((JButton) e.getSource(), icon7);
				}
		});
		centerPanel.add(btn8);
		
		icon8 = images.get(8);
		btn8.setPreferredSize(size);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 8);
				setIcon((JButton) e.getSource(), icon8);
				}
		});
		centerPanel.add(btn9);
		
		icon9 = images.get(9);
		btn9.setPreferredSize(size);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 9);
				setIcon((JButton) e.getSource(), icon9);
				}
		});
		centerPanel.add(btn10);
		
		icon10 = images.get(10);
		btn10.setPreferredSize(size);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 10);
				setIcon((JButton) e.getSource(), icon10);
				}
		});
		centerPanel.add(btn11);
		
		icon11 = images.get(11);
		btn11.setPreferredSize(size);
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;
				btnsPressed.add("btn" + 11);
				setIcon((JButton) e.getSource(), icon11);
				}
		});
		centerPanel.add(btn12);
		
		icon12 = images.get(12);
		btn12.setPreferredSize(size);
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 12);
				setIcon((JButton) e.getSource(), icon12);
				}
		});
		centerPanel.add(btn13);
		
		icon13 = images.get(13);
		btn13.setPreferredSize(size);
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 13);
				setIcon((JButton) e.getSource(), icon13);
				}
		});
		centerPanel.add(btn13);
		
		icon14 = images.get(14);
		btn14.setPreferredSize(size);
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				btnsPressed.add("btn" + 14);
				setIcon((JButton) e.getSource(), icon14);
				}
		});
		centerPanel.add(btn14);
		
		icon15 = images.get(15);
		btn15.setPreferredSize(size);
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;
				btnsPressed.add("btn" + 15);
				setIcon((JButton) e.getSource(), icon15);
				}
		});
		centerPanel.add(btn15);
		/**/
		
	}
	private void assignimages() {
		while(images.size() != 16) {
		    a = generateRandom(a);
		    System.out.println(a);
		    if(images.lastIndexOf(a) != 1) {
		    	images.add(imagelist[a]);
		    	System.out.println(i + ": ");
				if(images.lastIndexOf(a) != 1) {
					key.add("r");
				}
		    }
		   
		}
		
	/*	for(i=0; i<key.size(); i++) {
		    System.out.println(i + ": ");
		    if(images.lastIndexOf(a) != 1) {
		    	key.add(r);
		    }
		}
	*/	
///*
		for (int x=0;x<images.size();x++) {
			System.out.println(images.get(x));
		}
//*/
	}
	private void checkGame() {
		System.out.println("hi");
		
		if (btnPressed==2) {
			
			for (int i=0;i<2;i++)
			{
				if (btnsPressed.get(i) == "btn0") {
					setIcon(btn0, icon);
				}
				else if (btnsPressed.get(i) == "btn1") {
					setIcon(btn1, icon);
				}
				else if (btnsPressed.get(i) == "btn2") {
					setIcon(btn2, icon);
				}
				else if (btnsPressed.get(i) == "btn2") {
					setIcon(btn3, icon);
				}
				else if (btnsPressed.get(i) == "btn3") {
					setIcon(btn4, icon);
				}
				else if (btnsPressed.get(i) == "btn4") {
					setIcon(btn5, icon);
				}
				else if (btnsPressed.get(i) == "btn5") {
					setIcon(btn6, icon);
				}
				else if (btnsPressed.get(i) == "btn6") {
					setIcon(btn6, icon);
				}
				else if (btnsPressed.get(i) == "btn7") {
					setIcon(btn7, icon);
				}
				else if (btnsPressed.get(i) == "btn8") {
					setIcon(btn8, icon);
				}
				else if (btnsPressed.get(i) == "btn9") {
					setIcon(btn9, icon);
				}
				else if (btnsPressed.get(i) == "btn10") {
					setIcon(btn10, icon);
				}
				else if (btnsPressed.get(i) == "btn11") {
					setIcon(btn11, icon);
				}
				else if (btnsPressed.get(i) == "btn12") {
					setIcon(btn12, icon);
				}
				else if (btnsPressed.get(i) == "btn13") {
					setIcon(btn13, icon);
				}
				else if (btnsPressed.get(i) == "btn14") {
					setIcon(btn14, icon);
				}
				else if (btnsPressed.get(i) == "btn15") {
					setIcon(btn15, icon);
				}
			}

		}
	}
	private int generateRandom(int lastRandomNumber) {
	    int rotate = 1 + rand.nextInt(imagelist.length - 1);
	    return (lastRandomNumber + rotate) % imagelist.length;

	}
	
	private void setIcon(JButton btn, String x) {
		btn.setIcon(new ImageIcon(cl.getResource(x)));
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
