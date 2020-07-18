import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Stack;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class StackOutput extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private String choose;


	ArrayList<String> elements  = new ArrayList<String>(Arrays.asList(UserInputs.value));
	Stack<String> stack = new Stack<String>(); 


	public StackOutput() {

		stack.addAll(elements); //Add all items from the element list to the stack

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
		panel.setBounds(17, 22, 1149, 538);
		contentPane.add(panel);
		panel.setLayout(null);
		setVisible(true);

		//prompt label setup
		JLabel lbl = new JLabel("Select a function");
		lbl.setFont(new Font("Myanmar MN", Font.PLAIN, 33));
		lbl.setBounds(414, 49, 289, 60);
		panel.add(lbl);

		// element output label setup
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		lblNewLabel.setBounds(35, 340, 1082, 60);
		panel.add(lblNewLabel);


		JButton btnPush = new JButton("Push");
		btnPush.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnPush.setBounds(303, 179, 201, 100);
		btnPush.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				choose = JOptionPane.showInputDialog("Which element would you like to push?"); // option pane for users input
				stack.push(choose); // pushes an element
				lblNewLabel.setText(stack.toString()); // outputs the new elements


			}

		}
				);

		panel.add(btnPush);

		JButton btnPop = new JButton("Pop");
		btnPop.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnPop.setBounds(651, 179, 189, 100);
		btnPop.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				choose = JOptionPane.showInputDialog("What element would you like to pop?"); // option pane for users input
				stack.pop(); // pops an element
				lblNewLabel.setText(stack.toString()); // outputs the new elements


			}

		});

		panel.add(btnPop);


		setVisible(true); //makes frame visible

	}
}



