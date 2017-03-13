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
	private String icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9, icon10, icon11, icon12, icon13, icon14, icon15, icon16;
	private static final String icon = "";
	private int a;
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
	private JButton btn16 = new JButton();
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
		
		icon1 = images.get(0);
		btn1.setPreferredSize(size);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon1);
				}
		});
		centerPanel.add(btn1);
		
		icon2 = images.get(1);
		btn2.setPreferredSize(size);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon2);
				}
		});
		centerPanel.add(btn2);
		
		icon3 = images.get(2);
		btn3.setPreferredSize(size);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon3);
				}
		});
		centerPanel.add(btn3);
		
		icon4 = images.get(3);
		btn4.setPreferredSize(size);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon4);
				}
		});
		centerPanel.add(btn4);
		
		icon5 = images.get(4);
		btn5.setPreferredSize(size);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon5);
				}
		});
		centerPanel.add(btn5);
		
		icon6 = images.get(5);
		btn6.setPreferredSize(size);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon6);
				}
		});
		centerPanel.add(btn6);
		
		icon7 = images.get(6);
		btn7.setPreferredSize(size);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon7);
				}
		});
		centerPanel.add(btn7);
		
		icon8 = images.get(7);
		btn8.setPreferredSize(size);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon8);
				}
		});
		centerPanel.add(btn8);
		
		icon9 = images.get(8);
		btn9.setPreferredSize(size);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon9);
				}
		});
		centerPanel.add(btn9);
		
		icon10 = images.get(9);
		btn10.setPreferredSize(size);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon10);
				}
		});
		centerPanel.add(btn10);
		
		icon11 = images.get(10);
		btn11.setPreferredSize(size);
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon11);
				}
		});
		centerPanel.add(btn11);
		
		icon12 = images.get(11);
		btn12.setPreferredSize(size);
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon12);
				}
		});
		centerPanel.add(btn12);
		
		icon13 = images.get(12);
		btn13.setPreferredSize(size);
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon13);
				}
		});
		centerPanel.add(btn13);
		
		icon14 = images.get(13);
		btn14.setPreferredSize(size);
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon14);
				}
		});
		centerPanel.add(btn14);
		
		icon15 = images.get(14);
		btn15.setPreferredSize(size);
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				setIcon((JButton) e.getSource(), icon15);
				/*try {
				    Thread.sleep(1000);
				} catch (Exception x) {}
				setIcon((JButton) e.getSource(), icon);
				*/}
		});
		centerPanel.add(btn15);
		
		icon16 = images.get(15);
		btn16.setPreferredSize(size);
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					//setIcon(btn16, icon16);	
				setIcon((JButton) e.getSource(), icon16);
				checkTimer.start();
				}
		});
		centerPanel.add(btn16);
		/**/
		
	}
	private void assignimages() {
		while(images.size() != 16) {
		    a = generateRandom(a);
		    System.out.println(a);
		    if(images.lastIndexOf(a) != 1) {
		    	images.add(imagelist[a]);
		    }
		}

		for (int x=0;x<images.size();x++) {
			System.out.println(images.get(x));
		}
	}
	private void checkGame() {
		System.out.println("hi");
		setIcon(btn16, icon);
	}
	private int generateRandom(int lastRandomNumber) {

	    // add-and-wrap another random number to produce a guaranteed
	    // different result.
	    // note the one-less-than UPPER_BOUND input
	    int rotate = 1 + rand.nextInt(imagelist.length - 1);
	    // 'rotate' the last number
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
