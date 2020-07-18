import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Welcome extends JFrame implements ActionListener {

	private JPanel contentPane; // panel
	JButton btnStart = new JButton("Start"); // start button

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 900);

		//panel setup
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Title label setup
		JLabel lblAbstractDataType = new JLabel("Abstract Data Type Application");
		lblAbstractDataType.setBounds(273, 29, 853, 50);
		contentPane.add(lblAbstractDataType);
		lblAbstractDataType.setFont(new Font("Myanmar MN", Font.PLAIN, 51));

		// description setup
		JTextArea text = new JTextArea();
		text.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		text.setBackground(new Color(175, 238, 238));
		text.setBorder(new LineBorder(new Color(224, 255, 255), 3));
		text.setText("The Abstract data type application is a tool that helps arrange \r\n" + "data a user enters using three different abstract \r\n" + "data types (List, Stack, Queue). The user must input the number of \r\n" + "elements they want to enter, then input those elements \r\n" + "Then the user can choose which data type \r\n" + "they want to use and which arrangement \r\n" + "they want to use. Finally the the application \r\n" + "will outputs the new arrangement of your elements.\r\n");
		text.setBounds(302, 144, 670, 219);
		contentPane.add(text);
		btnStart.setFont(new Font("Lucida Grande", Font.PLAIN, 22));

		// start button setup
		btnStart.setBounds(491, 437, 289, 127);
		btnStart.addActionListener(this);
		contentPane.add(btnStart);

	}

	// When the start button is clicked 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnStart) {
			this.dispose();//close this frame
			new UserOptions();//open QueueOutput frame


		}
	}
}
