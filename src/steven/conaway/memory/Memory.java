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
import javax.swing.JOptionPane;
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
	private int a;
	private int i;
	private int pressed;
	private int pressed0;
	private int pressed1;
	private int tries;
	private int cardsFlipped;
	private int btnPressed = 0;
	private static final int GRIDSIZE = 4;
	private static final String[] imagelist = {"images/image01.jpg", "images/image02.jpg","images/image03.jpg","images/image04.jpg"};
	private ArrayList<String> images = new ArrayList<>();
	private ArrayList<String> key = new ArrayList<>();
	private ArrayList<String> btnsPressed = new ArrayList<>();
	private String icon0; 
	private String icon1; 
	private String icon2; 
	private String icon3; 
	private String icon4; 
	private String icon5; 
	private String icon6; 
	private String icon7; 
	private String icon8; 
	private String icon9; 
	private String icon10; 
	private String icon11; 
	private String icon12; 
	private String icon13; 
	private String icon14; 
	private String icon15;
	private static final String icon = "";
	private String message = "";

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
	private static final Random rand = new Random();
	private final ClassLoader cl = this.getClass().getClassLoader();

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

		Timer checkTimer= new Timer(500, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGame();
			}
		});
		checkTimer.setRepeats(true);
		
		assignImages();
		add(new TitleLabel("Memory"), BorderLayout.PAGE_START);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(GRIDSIZE, GRIDSIZE));
		add(centerPanel, BorderLayout.CENTER);
		
		icon0 = images.get(0);
		btn0.setPreferredSize(size);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;
				tries++;
				btnsPressed.add("btn0");
				setIcon((JButton) e.getSource(), icon0);
				}
		});
		centerPanel.add(btn0);
		
		icon1 = images.get(1);
		btn1.setPreferredSize(size);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;
				tries++;	
				btnsPressed.add("btn1");
				setIcon((JButton) e.getSource(), icon1);
				}
		});
		centerPanel.add(btn1);
		
		icon2 = images.get(2);
		btn2.setPreferredSize(size);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				tries++;
				btnsPressed.add("btn2");
				setIcon((JButton) e.getSource(), icon2);
				}
		});
		centerPanel.add(btn2);
		
		icon3 = images.get(3);
		btn3.setPreferredSize(size);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				tries++;
				btnsPressed.add("btn3");
				setIcon((JButton) e.getSource(), icon3);
				}
		});
		centerPanel.add(btn3);
		
		icon4 = images.get(4);
		btn4.setPreferredSize(size);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;
				tries++;	
				btnsPressed.add("btn4");
				setIcon((JButton) e.getSource(), icon4);
				}
		});
		centerPanel.add(btn4);
		
		icon5 = images.get(5);
		btn5.setPreferredSize(size);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;
				tries++;
				btnsPressed.add("btn5");
				setIcon((JButton) e.getSource(), icon5);
				}
		});
		centerPanel.add(btn5);
		
		icon6 = images.get(6);
		btn6.setPreferredSize(size);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				tries++;
				btnsPressed.add("btn6");
				setIcon((JButton) e.getSource(), icon6);
				}
		});
		centerPanel.add(btn6);
		
		icon7 = images.get(7);
		btn7.setPreferredSize(size);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				tries++;
				btnsPressed.add("btn7");
				setIcon((JButton) e.getSource(), icon7);
				}
		});
		centerPanel.add(btn7);
		
		icon8 = images.get(8);
		btn8.setPreferredSize(size);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				tries++;
				btnsPressed.add("btn8");
				setIcon((JButton) e.getSource(), icon8);
				}
		});
		centerPanel.add(btn8);
		
		icon9 = images.get(9);
		btn9.setPreferredSize(size);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				tries++;
				btnsPressed.add("btn9");
				setIcon((JButton) e.getSource(), icon9);
				}
		});
		centerPanel.add(btn9);
		
		icon10 = images.get(10);
		btn10.setPreferredSize(size);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				tries++;
				btnsPressed.add("btn10");
				setIcon((JButton) e.getSource(), icon10);
				}
		});
		centerPanel.add(btn10);
		
		icon11 = images.get(11);
		btn11.setPreferredSize(size);
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;
				tries++;
				btnsPressed.add("btn11");
				setIcon((JButton) e.getSource(), icon11);
				}
		});
		centerPanel.add(btn11);
		
		icon12 = images.get(12);
		btn12.setPreferredSize(size);
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				tries++;
				btnsPressed.add("btn12");
				setIcon((JButton) e.getSource(), icon12);
				}
		});
		centerPanel.add(btn12);
		
		icon13 = images.get(13);
		btn13.setPreferredSize(size);
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				tries++;
				btnsPressed.add("btn13");
				setIcon((JButton) e.getSource(), icon13);
				}
		});
		centerPanel.add(btn13);
		
		icon14 = images.get(14);
		btn14.setPreferredSize(size);
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;	
				tries++;
				btnsPressed.add("btn14");
				setIcon((JButton) e.getSource(), icon14);
				}
		});
		centerPanel.add(btn14);
		
		icon15 = images.get(15);
		btn15.setPreferredSize(size);
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;
				tries++;
				btnsPressed.add("btn15");
				setIcon((JButton) e.getSource(), icon15);
				}
		});
		centerPanel.add(btn15);
		
		checkTimer.start();
		
	}
		
	private void assignImages() {
		while(images.size() != 16) {
		    a = generateRandom(a);
		    System.out.println(a);
		    if(images.lastIndexOf(a) != 1) {
		    	images.add(imagelist[a]);
		    	System.out.println(i + ": ");
				if(a == 0) {
					key.add("r");
				}
				else if(a == 1) {
					key.add("b");
				}
				else if(a == 2) {
					key.add("g");
				}
				else if(a == 3) {
					key.add("y");
				}
		    }
		   
		}
		
		for (int x=0;x<images.size();x++) {
			System.out.println(images.get(x));
		}
//*/
	}
	
	private void checkGame() {
		
		if (btnPressed==2) {
			
			for (int x=0;x<2;x++) {	
				System.out.println(btnsPressed.get(x));
				if (btnsPressed.get(x) == "btn0") {
					pressed = 0;
				}
				else if (btnsPressed.get(x) == "btn1") {
					pressed = 1;
				}
				else if (btnsPressed.get(x) == "btn2") {
					pressed = 2;
				}
				else if (btnsPressed.get(x) == "btn3") {
					pressed = 3;
				}
				else if (btnsPressed.get(x) == "btn4") {
					pressed = 4;
				}
				else if (btnsPressed.get(x) == "btn5") {
					pressed = 5;
				}
				else if (btnsPressed.get(x) == "btn6") {
					pressed = 6;
				}
				else if (btnsPressed.get(x) == "btn7") {
					pressed = 7;
				}
				else if (btnsPressed.get(x) == "btn8") {
					pressed = 8;
				}
				else if (btnsPressed.get(x) == "btn9") {
					pressed = 9;
				}
				else if (btnsPressed.get(x) == "btn10") {
					pressed = 10;
				}
				else if (btnsPressed.get(x) == "btn11") {
					pressed = 11;
				}
				else if (btnsPressed.get(x) == "btn12") {
					pressed = 12;
				}
				else if (btnsPressed.get(x) == "btn13") {
					pressed = 13;
				}
				else if (btnsPressed.get(x) == "btn14") {
					pressed = 14;
				}
				else if (btnsPressed.get(x) == "btn15") {
					pressed = 15;
				}				
				
				if (x == 0) {
					pressed0 = pressed;
				}
				else if (x == 1) {
					pressed1 = pressed;
				}
			} // end detection for-loop
			System.out.println("detected");

			
			if (key.get(pressed0) == key.get(pressed1))  {
				cardsFlipped++;
				btnsPressed.clear();
				btnPressed = 0;
			}
			
			else {	
				for (int i=0;i<2;i++) {
					if (btnsPressed.get(i) == "btn0") {
						setIcon(btn0, icon);
					}
					else if (btnsPressed.get(i) == "btn1") {
						setIcon(btn1, icon);
					}
					else if (btnsPressed.get(i) == "btn2") {
						setIcon(btn2, icon);
					}
					else if (btnsPressed.get(i) == "btn3") {
						setIcon(btn3, icon);
					}
					else if (btnsPressed.get(i) == "btn4") {
						setIcon(btn4, icon);
					}
					else if (btnsPressed.get(i) == "btn5") {
						setIcon(btn5, icon);
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
					} //end if/else if/else if/...
					
				} //end for
				btnsPressed.clear();
				btnPressed = 0;
			}//end if/else
		} //end if 2 are pressed
		
		if (cardsFlipped == 8) {
			
			displayMessage();
			assignImages();
			btnsPressed.clear();
			tries = 0;
			btnPressed = 0;
			cardsFlipped =0;
		}
		
	} // end gameCheck method
	
	private int generateRandom(int lastRandomNumber) {
	    int rotate = 1 + rand.nextInt(imagelist.length - 1);
	    return (lastRandomNumber + rotate) % imagelist.length;

	}
	
	private void displayMessage() {
		message = "Congratulations! You solved the puzzle in " + tries + " tries!";
		JOptionPane.showMessageDialog(this, message);
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