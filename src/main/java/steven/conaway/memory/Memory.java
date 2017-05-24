/**
 * Copyright Steven Conaway 2017
 */
package steven.conaway.memory;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;

public class Memory extends JFrame {
	
	private Boolean good = false;
	
	private static final long serialVersionUID = 1L;
	private int a;
	private int i;
	private int x;
	private int r;
	private int g;
	private int b;
	private int y;
	private int pressed;
	private int pressed0;
	private int pressed1;
	private int tries;
	private int cardsFlipped;
	private int btnPressed = 0;
	private static final int GRIDSIZE = 4;
	private static final String[] imagelist = {"images/image01.jpg", "images/image02.jpg","images/image03.jpg","images/image04.jpg"}; // four different images
	private ArrayList<String> images = new ArrayList<>();
	private ArrayList<String> key = new ArrayList<>();
	private ArrayList<String> btnsPressed = new ArrayList<>();
	private String icon0;  // Create icon variables to correspond with button
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
	private static final String icon = "images/image.jpg"; // set blank tile image
	private String message;

	private JButton btn0 = new JButton(); //create buttons
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

	
	private Font titleFont = new Font(Font.SERIF, Font.BOLD, 32);
	private JLabel titleLabel = new JLabel();
	private static final Dimension size = new Dimension(100,100);
	private static final Random rand = new Random();
	private final ClassLoader classloader = this.getClass().getClassLoader(); // used to retrieve images

	public Memory() {
		assignImages();
		initGUI();
		setTitle("Memory");
		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	
	private void initGUI() {

		Timer checkTimer= new Timer(500, new ActionListener() {  // create a new timer
			public void actionPerformed(ActionEvent e) {
				checkGame();									 // tell timer to run checkGame method when out of time
			}
		});
		checkTimer.setRepeats(true);							// set timer to repeat

		titleLabel.setFont(titleFont);							// Create and add a label to display title to the top of window
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setText("Memory");
		titleLabel.setBackground(Color.BLACK);
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setOpaque(true);
		
		add(titleLabel, BorderLayout.PAGE_START);
		
		JPanel centerPanel = new JPanel();					   // Create a center panel
		centerPanel.setLayout(new GridLayout(GRIDSIZE, GRIDSIZE)); // Set the center panel to be in a 4x4 layout
		add(centerPanel, BorderLayout.CENTER);				  // add centerPanel to center of window
		
		icon0 = images.get(0);								  // Set icon0 to images.get(0) (Assigned in assignImages method)
		btn0.setPreferredSize(size);						  // Set btn0 to 100x100px
		btn0.addActionListener(new ActionListener() {		  // Set btn0 to 
			public void actionPerformed(ActionEvent e) {
				btnPressed++;								  // add 1 to btnPressed
				tries++;									  // add 1 to the try counter
				btnsPressed.add("btn0");					  // add "btn0" to list of Recently-Pressed Buttons
				reveal((JButton) e.getSource(), icon0);		  // reveal the button pressed
				}
		});
		centerPanel.add(btn0);								  // add btn0 to the center panel
		
		icon1 = images.get(1);								  // same thing as above
		btn1.setPreferredSize(size);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPressed++;
				tries++;	
				btnsPressed.add("btn1");
				reveal((JButton) e.getSource(), icon1);
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
				reveal((JButton) e.getSource(), icon2);
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
				reveal((JButton) e.getSource(), icon3);
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
				reveal((JButton) e.getSource(), icon4);
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
				reveal((JButton) e.getSource(), icon5);
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
				reveal((JButton) e.getSource(), icon6);
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
				reveal((JButton) e.getSource(), icon7);
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
				reveal((JButton) e.getSource(), icon8);
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
				reveal((JButton) e.getSource(), icon9);
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
				reveal((JButton) e.getSource(), icon10);
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
				reveal((JButton) e.getSource(), icon11);
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
				reveal((JButton) e.getSource(), icon12);
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
				reveal((JButton) e.getSource(), icon13);
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
				reveal((JButton) e.getSource(), icon14);
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
				reveal((JButton) e.getSource(), icon15);
				}
		});
		centerPanel.add(btn15);
		
		clearIcon(btn0); // clear btns 0-15 (set to ?)
		clearIcon(btn1); 
		clearIcon(btn2); 
		clearIcon(btn3); 
		clearIcon(btn4); 
		clearIcon(btn5); 
		clearIcon(btn6); 
		clearIcon(btn7); 
		clearIcon(btn8);
		clearIcon(btn9); 
		clearIcon(btn10); 
		clearIcon(btn11); 
		clearIcon(btn12); 
		clearIcon(btn13); 
		clearIcon(btn14); 
		clearIcon(btn15); 
		
		
		
		checkTimer.start();
		
	}
		
	private void assignImages() {
		while (!good) {
			while(images.size() != 16) {
				a = generateRandom(a);
					images.add(imagelist[a]);
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
			
			for (x=0;x<16;x++) {
				if (key.get(x).equals("r")) {
					r++;
				}
				else if (key.get(x).equals("g")) {
					g++;
				}
				else if (key.get(x).equals("b")) {
					b++;
				}
				else if (key.get(x).equals("y")) {
					y++;
				}
			}
			
			if (r%2 == 0 && g%2 == 0 && b%2 == 0 && y%2 == 0) {
                		good = true;
           	}
            else {
       			r = 0;
       			g = 0;
                b = 0;
                y = 0;
                images.clear();
                key.clear();
            }
			
		} 
	}
	
	private void checkGame() {
		
		if (btnPressed==2) {
			
			for (int x=0;x<2;x++) {	
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

			
			if (key.get(pressed0) == key.get(pressed1))  {
				cardsFlipped++;
				btnsPressed.clear();
				btnPressed -= 2;
			}
			
			else {	
				for (i=0;i<2;i++) {
					if (btnsPressed.get(i) == "btn0") {
						clearIcon(btn0);
					}
					else if (btnsPressed.get(i) == "btn1") {
						clearIcon(btn1);
					}
					else if (btnsPressed.get(i) == "btn2") {
						clearIcon(btn2);
					}
					else if (btnsPressed.get(i) == "btn3") {
						clearIcon(btn3);
					}
					else if (btnsPressed.get(i) == "btn4") {
						clearIcon(btn4);
					}
					else if (btnsPressed.get(i) == "btn5") {
						clearIcon(btn5);
					}
					else if (btnsPressed.get(i) == "btn6") {
						clearIcon(btn6);
					}
					else if (btnsPressed.get(i) == "btn7") {
						clearIcon(btn7);
					}
					else if (btnsPressed.get(i) == "btn8") {
						clearIcon(btn8);
					}
					else if (btnsPressed.get(i) == "btn9") {
						clearIcon(btn9);
					}
					else if (btnsPressed.get(i) == "btn10") {
						clearIcon(btn10);
					}
					else if (btnsPressed.get(i) == "btn11") {
						clearIcon(btn11);
					}
					else if (btnsPressed.get(i) == "btn12") {
						clearIcon(btn12);
					}
					else if (btnsPressed.get(i) == "btn13") {
						clearIcon(btn13);
					}
					else if (btnsPressed.get(i) == "btn14") {
						clearIcon(btn14);
					}
					else if (btnsPressed.get(i) == "btn15") {
						clearIcon(btn15);
					} //end if/else if/else if...
					
				} //end for
				btnsPressed.clear();
				btnPressed = 0;
			}//end if/else
		} //end if 2 are pressed
		
		if (cardsFlipped == 8) {
			
			displayMessage();
		}
		
	} // end gameCheck method
	
	private int generateRandom(int lastRandomNumber) {
	    int rotate = 1 + rand.nextInt(imagelist.length - 1);
	    return (lastRandomNumber + rotate) % imagelist.length;

	}
	
	private void displayMessage() {
		message = "Congratulations! You solved the puzzle in " + tries + " tries!";
		JOptionPane.showMessageDialog(this, message);
		System.exit(0);
	}
	
	private void reveal(JButton btn, String x) {
		btn.setIcon(new ImageIcon(classloader.getResource(x)));
	}
	
	private void clearIcon(JButton btn) {
		btn.setIcon(new ImageIcon(classloader.getResource(icon)));
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
