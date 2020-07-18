import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class UserOptions extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btnList = new JButton("List"); // Option button for List
	JButton btnStack = new JButton("Stack"); // Option button for Stack
	JButton btnQueue = new JButton("Queue"); // Option button for Queue

	public UserOptions() {

		//outer panel setup
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//inner panel setup
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(23, 33, 1149, 538);
		contentPane.add(panel);
		panel.setLayout(null);

		//prompt label setup
		JLabel lblChooseAnAbstract = new JLabel("Choose an abstract data type below");
		lblChooseAnAbstract.setFont(new Font("Hobo Std", Font.PLAIN, 24));
		lblChooseAnAbstract.setBounds(346, 76, 439, 60);
		panel.add(lblChooseAnAbstract);

		// Name of type Labels
		JLabel lblListType = new JLabel("List Type");
		lblListType.setFont(new Font("Hobo Std", Font.PLAIN, 19));
		lblListType.setBounds(204, 149, 97, 38);
		panel.add(lblListType);

		JLabel lblStackType = new JLabel("Stack Type");
		lblStackType.setFont(new Font("Hobo Std", Font.PLAIN, 19));
		lblStackType.setBounds(512, 148, 97, 38);
		panel.add(lblStackType);

		JLabel lblQueueType = new JLabel("Queue Type");
		lblQueueType.setFont(new Font("Hobo Std", Font.PLAIN, 19));
		lblQueueType.setBounds(820, 149, 125, 38);
		panel.add(lblQueueType);

		//List description
		JTextArea txtrAListContains = new JTextArea();
		txtrAListContains.setBorder(new LineBorder(new Color(224, 255, 255), 3));
		txtrAListContains.setBackground(new Color(175, 238, 238));
		txtrAListContains.setText("A list contains elements of same type \r\n" + "arranged in sequential order and \r\n" + "following operations can be \r\n" + "performed on the list.\r\n");
		txtrAListContains.setBounds(113, 199, 273, 69);
		panel.add(txtrAListContains);

		//Stack description
		JTextArea txtrAStackContains = new JTextArea();
		txtrAStackContains.setBackground(new Color(175, 238, 238));
		txtrAStackContains.setBorder(new LineBorder(new Color(224, 255, 255), 3));
		txtrAStackContains.setText(" A Stack contains elements of same type \r\n" + "arranged in sequential order. \r\n" + "All operations takes place at \r\n" + "a single end that is top of the stack.\r\n");
		txtrAStackContains.setBounds(438, 199, 263, 81);
		panel.add(txtrAStackContains);

		//Queue description
		JTextArea txtrAQueueContains = new JTextArea();
		txtrAQueueContains.setBackground(new Color(175, 238, 238));
		txtrAQueueContains.setBorder(new LineBorder(new Color(224, 255, 255), 3));
		txtrAQueueContains.setText("A Queue contains elements of same type \r\n " + "arranged in sequential order. \r\n" + "Operations takes place at both\r\n" + "ends, insertion is done at end and\r\n" + "deletion is done at front. \r\n");
		txtrAQueueContains.setBounds(756, 189, 285, 91);
		panel.add(txtrAQueueContains);


// List Button setup
		btnList.setOpaque(true);
		btnList.addActionListener(this);
		btnList.setBackground(new Color(211, 211, 211));
		btnList.setBounds(128, 341, 243, 102);
		panel.add(btnList);

		// Stack Button setup
		btnStack.setOpaque(true);
		btnStack.addActionListener(this);
		btnStack.setBackground(new Color(211, 211, 211));
		btnStack.setBounds(448, 341, 243, 102);
		panel.add(btnStack);

		// Queue Button setup
		btnQueue.setOpaque(true);
		btnQueue.addActionListener(this);
		btnQueue.setBackground(new Color(211, 211, 211));
		btnQueue.setBounds(774, 341, 243, 102);
		panel.add(btnQueue);	

		setVisible(true); //makes frame visible
	}

	
	public void actionPerformed(ActionEvent event) {
		//if list button is clicked
		if (event.getSource() == btnList) {
			this.dispose(); //close this frame
			new ListOutput(); // open ListOutput frame
		}
		//if stack button is clicked
		if (event.getSource() == btnStack) {
			this.dispose();//close this frame
			new StackOutput(); //open StackOutput frame
		}
		//if queue button is clicked
		if (event.getSource() == btnQueue) {
			this.dispose();//close this frame
			new QueueOutput();//open QueueOutput frame


		}


	}


}
