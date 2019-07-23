import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HigginsHW1 extends JFrame {

	private JPanel contentPane;
	private final JLabel lblHello = new JLabel("Hello!");
	private final JButton btnChange = new JButton("Change");
	private final JLabel lblGoodbye = new JLabel("Goodbye!");
	private final JLabel lblHowdy = new JLabel("Howdy!");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HigginsHW1 frame = new HigginsHW1();
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
	public HigginsHW1() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Higgins, Jonathan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblHello.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 24));
		lblHello.setForeground(Color.MAGENTA);
		lblHello.setBounds(10, 69, 178, 77);
		
		contentPane.add(lblHello);
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnChange_actionPerformed(arg0);
			}
		});
		btnChange.setBounds(143, 156, 89, 23);
		
		contentPane.add(btnChange);
		lblGoodbye.setForeground(Color.GREEN);
		lblGoodbye.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		lblGoodbye.setBounds(268, 77, 156, 60);
		
		contentPane.add(lblGoodbye);
		lblHowdy.setForeground(Color.CYAN);
		lblHowdy.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 24));
		lblHowdy.setBounds(142, 28, 112, 60);
		
		contentPane.add(lblHowdy);
	}
	protected void do_btnChange_actionPerformed(ActionEvent arg0) {
		//lblHello.setText("Goodbye!");
		lblHello.setForeground(Color.GREEN);
		lblHello.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		//lblHowdy.setText("howdy!");
		lblHowdy.setForeground(Color.MAGENTA);
		lblHowdy.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		//lblGoodbye.setText("Hello!");
		lblGoodbye.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 24));
		lblGoodbye.setForeground(Color.CYAN);

		
	}
	protected void do_btnChange_actionPerformed(ActionEvent arg1) {
		String temp = lblHello.getText();
		lblHello.setText(lblGoodbye.getText());
		lblGoodbye.setText(temp);
		
	}
}