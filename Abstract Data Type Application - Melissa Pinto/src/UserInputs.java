import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class UserInputs extends JFrame  {

	private JPanel contentPane;// inner panel
	private JPanel panel; // outer panel
	public int userEntry; 
	private JTextField textField; // text field where user enters text
	public static String[] value; //stores users inputed values
	private JLabel lbl; // prompts users 
	static int num; // stores how many elements the user wants to input


	public UserInputs() {

		//outer panel setup
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null); 

		//inner panel setup
		panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(23, 33, 1149, 538);
		contentPane.add(panel);
		panel.setLayout(null);
		
		objectSetup();
		numRange();
		
		setVisible(true); //makes frame visible




	}
	public void objectSetup() {


		//prompt label setup
		lbl = new JLabel("Please enter the number of elements you want to input");
		lbl.setFont(new Font("Hobo Std", Font.PLAIN, 24));
		lbl.setBounds(267, 142, 627, 68);
		panel.add(lbl);

		// text field for user's input setup
		textField = new JTextField();
		textField.setBorder(new LineBorder(Color.GRAY, 3));
		textField.setBounds(469, 236, 259, 53);
		panel.add(textField);
		textField.setColumns(10);



	}

	// gets the users inputed number of elements and elements then stores them
	public void numRange() {

		final int MIN = 2; // minimum number of elements the user can input

		// "enter" button setup
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setOpaque(true);
		btnNewButton.setBorder(new LineBorder(new Color(192, 192, 192), 3));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(511, 364, 176, 80);
		panel.add(btnNewButton);

		textField.setInputVerifier(new InputVerifier() {

			// check if user enter a integer 
			@Override
			public boolean verify(JComponent input) {
				String text = ((JTextField) input).getText();

				try {
					num = Integer.parseInt(text);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(UserInputs.this, "invalid entry");

					return false;

				}
				// check if  inputed number is greater than the minimum 
				if (num >= MIN) {


					btnNewButton.addActionListener(new ActionListener() {

						// when the "enter" button is clicked 
						public void actionPerformed(ActionEvent e) {


							textField.setVisible(false);
							lbl.setVisible(false);
							btnNewButton.setVisible(false);

							//"Next" button" setup
							JButton btnNextButton = new JButton("Next"); 
							btnNextButton.setOpaque(true);
							btnNextButton.setBorder(new LineBorder(new Color(192, 100, 192), 3));
							btnNextButton.setBackground(new Color(255, 255, 255));
							btnNextButton.setBounds(511, 364, 176, 80);
							btnNextButton.setFont(new Font("Hobo Std", Font.PLAIN, 24));
							btnNextButton.addActionListener(new ActionListener() {

								// when the next button is clicked close the List frame and open the ListOptions frame
								public void actionPerformed(ActionEvent e) {
									if (e.getSource() == btnNextButton) {
										setVisible(false);
										new UserOptions();
									}


								}

							}

									);

							// when enter button is clicked then next button is visible
							panel.add(btnNextButton);

							value = new String[num]; // stores all of the users inputed elements

							for (int i = 0; i<num; i++) { 

								//displays option pane for user to enter their elements
								value[i] = JOptionPane.showInputDialog("Element " + (i+1));



							}


						}


					}

							);
					return true;




				}
				else {

					// if nothing is entered display "invalid entry" option pane
					JOptionPane.showMessageDialog(UserInputs.this, "invalid entry");


					return false;

				}
			}


		});

	}



}

