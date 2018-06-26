import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;

public class calcGUI extends JFrame {
	
    double number;
    double answer;
    int calculation;
    
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcGUI frame = new calcGUI();
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
	public calcGUI() {
		setResizable(false);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 320, 532);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Arial", Font.PLAIN, 12));
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmExit.setFont(new Font("Arial", Font.PLAIN, 12));
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setFont(new Font("Arial", Font.PLAIN, 12));
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new aboutDialog();
			}
		});
		mntmAbout.setFont(new Font("Arial", Font.PLAIN, 12));
		mnHelp.add(mntmAbout);
		
		JLabel label = new JLabel("");
		menuBar.add(label);
		label.setBackground(new Color(255, 255, 255));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Arial", Font.PLAIN, 11));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 40));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(0, 0, 304, 151);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 151, 304, 321);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		        if (source == btnCe) {
		        	label.setText("");
					}
				}
		});
		btnCe.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		        if (source == btnC) {
		        	label.setText("");
		            textField.setText("");
					}
				}
			});
		btnC.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btnC);
		
		JButton btnDel = new JButton("DEL");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            int length = textField.getText().length();
	            int number = length - 1;
	 
	            if (length > 0) {
	                StringBuilder back = new StringBuilder(textField.getText());
	                back.deleteCharAt(number);
	                textField.setText(back.toString());
	 
	            }
	            if (textField.getText().endsWith("")) {
	                label.setText("");
	            	}
				}
		});
		btnDel.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btnDel);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            String str = textField.getText();
	            number = Double.parseDouble(textField.getText());
	            textField.setText("");
	            label.setText(str + "/");
	            calculation = 4;
			}
		});
		btnDiv.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btnDiv);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
				if (source == btn7) {
		            textField.setText(textField.getText() + "7");
					}
				}
			});
		btn7.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		        if (source == btn8) {
		            textField.setText(textField.getText() + "8");
					}
				}
			});
		btn8.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		        if (source == btn9) {
		            textField.setText(textField.getText() + "9");
					}
				}
			});
		btn9.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btn9);
		
		JButton btnMult = new JButton("x");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            String str = textField.getText();
	            number = Double.parseDouble(textField.getText());
	            textField.setText("");
	            label.setText(str + "x");
	            calculation = 3;
			}
		});
		btnMult.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btnMult);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		        if (source == btn4) {
		            textField.setText(textField.getText() + "4");
					}
				}
			});
		btn4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		        if (source == btn5) {
		            textField.setText(textField.getText() + "5");
					}
				}
			});
		btn5.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		        if (source == btn6) {
		            textField.setText(textField.getText() + "6");
					}
				}
			});
		btn6.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            String str = textField.getText();
	            number = Double.parseDouble(textField.getText());
	            textField.setText("");
	            label.setText(str + "-");
	            calculation = 2;
			}
		});
		btnMinus.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btnMinus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		        if (source == btn1) {
		            textField.setText(textField.getText() + "1");
					}
				}
			});
		btn1.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		        if (source == btn2) {
		            textField.setText(textField.getText() + "2");
					}
				}
			});
		btn2.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		        if (source == btn3) {
		            textField.setText(textField.getText() + "3");
					}
				}
			});
		btn3.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            String str = textField.getText();
	            number = Double.parseDouble(textField.getText());
	            textField.setText("");
	            label.setText(str + "+");
	            calculation = 1;
			}
		});
		btnPlus.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btnPlus);
		
		JButton btnPlusMinus = new JButton("\u00B1");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double temp;
				temp = Double.parseDouble(textField.getText());
            	if (temp < 0) {
            		textField.setText(Double.toString(-(temp)).replace(".0", ""));
            		temp = (double) 0;
            	} else if (temp > 0) {
            		textField.setText("-" + textField.getText());
            		temp = (double) 0;
            		}
				}
			});
		btnPlusMinus.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btnPlusMinus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		        if (source == btn0) {
		            if (textField.getText().equals("0")) {
		                return;
		            } else {
		                textField.setText(textField.getText() + "0");
		            	}
					}
				}
			});
		btn0.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
		        if (source == btnDot) {
		            if (textField.getText().contains(".")) {
		                return;
		            } else {
		                textField.setText(textField.getText() + ".");
		            	}
					}
				}
			});
		btnDot.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btnDot);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempString = ("");
				switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                	if (label.getText() == tempString) {
                		break;
                	} else {
                		if (Double.toString(answer).endsWith(".0")) {
                			textField.setText(Double.toString(answer).replace(".0", ""));
                		} else {
                			textField.setText(Double.toString(answer));
                    		}
                		}
                    label.setText("");
                    break;
                case 2:
                	if (label.getText() == tempString) {
                		break;
                	} else {
                    answer = number - Double.parseDouble(textField.getText());
	                    if (Double.toString(answer).endsWith(".0")) {
	                        textField.setText(Double.toString(answer).replace(".0", ""));
	                    } else {
	                        textField.setText(Double.toString(answer));
	                    	}
                		}
                    label.setText("");
                    break;
                case 3:
                	if (label.getText() == tempString) {
                		break;
                	} else {
                    answer = number * Double.parseDouble(textField.getText());
	                    if (Double.toString(answer).endsWith(".0")) {
	                        textField.setText(Double.toString(answer).replace(".0", ""));
	                    } else {
	                        textField.setText(Double.toString(answer));
	                    	}
                		}
                    label.setText("");
                    break;
                case 4:
                	if (label.getText() == tempString) {
                		break;
                	} else {
                    answer = number / Double.parseDouble(textField.getText());
	                    if (Double.toString(answer).endsWith(".0")) {
	                        textField.setText(Double.toString(answer).replace(".0", ""));
	                    } else {
	                        textField.setText(Double.toString(answer));
	                    	}
                		}
                    label.setText("");
                    break;
				}
			}
		});
		btnEquals.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(btnEquals);
	}
	public class aboutDialog extends JFrame {
		public JDialog aboutDialog = new JDialog();
		
		public aboutDialog() {
			aboutDialog.setVisible(true);
			aboutDialog.setTitle("About");
			aboutDialog.setBounds(100, 100, 300, 100);
			aboutDialog.getContentPane().setLayout(null);
			aboutDialog.setLocationRelativeTo(contentPane);
			
			JLabel lblNewLabel = new JLabel("Created by Tonis Lusmagi");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(0, 0, 284, 61);
			aboutDialog.getContentPane().add(lblNewLabel);
		}
	}
}