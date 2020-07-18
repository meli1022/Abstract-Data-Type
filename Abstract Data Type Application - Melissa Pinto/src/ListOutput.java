import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ListOutput extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private String choose;

	public ListOutput() {
		
		// change the "value" array to an arraylist
		ArrayList<String> elements  = new ArrayList<String>(Arrays.asList(UserInputs.value));
		
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

		// Remove button setup
		JButton btnRemove = new JButton("Remove");
		btnRemove.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnRemove.setBounds(303, 179, 201, 100);
		btnRemove.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				choose = JOptionPane.showInputDialog("Which element would you like to remove?");// option pane for users input
				elements.remove(choose); // removes an element
				lblNewLabel.setText(elements.toString()); // outputs the new elements


			}

		}
				);

		panel.add(btnRemove);

		//Insert button setup
		JButton btnInsert = new JButton("Insert");
		btnInsert.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		btnInsert.setBounds(651, 179, 189, 100);
		btnInsert.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				choose = JOptionPane.showInputDialog("What element would you like to insert?");// option pane for users input
				elements.add(choose); // inserts an element
				lblNewLabel.setText(elements.toString()); // outputs the new elements

			}

		});

		panel.add(btnInsert);


		setVisible(true); //makes frame visible

	}
}



