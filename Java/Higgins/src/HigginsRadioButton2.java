import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;


public class higginsFrame extends JFrame {

	private JPanel contentPane;
	private final JRadioButton rdbtnFirst = new JRadioButton("First");
	private final JRadioButton rdbtnSecond = new JRadioButton("Second");
	private final JRadioButton rdbtnThrid = new JRadioButton("Third");
	private final JLabel lblRadio = new JLabel("Radio");
	private final JSlider slider = new JSlider();
	private final JLabel label = new JLabel("????");
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					higginsFrame frame = new higginsFrame();
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
	public higginsFrame() {
		jbInit();
	}
	private void jbInit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		buttonGroup.add(rdbtnFirst);
		rdbtnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtnFirst_actionPerformed(e);
			}
		});
		rdbtnFirst.setBounds(56, 45, 56, 23);
		
		contentPane.add(rdbtnFirst);
		buttonGroup.add(rdbtnSecond);
		rdbtnSecond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtnSecond_actionPerformed(e);
			}
		});
		rdbtnSecond.setBounds(56, 71, 68, 23);
		
		contentPane.add(rdbtnSecond);
		buttonGroup.add(rdbtnThrid);
		rdbtnThrid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_rdbtnThrid_actionPerformed(e);
			}
		});
		rdbtnThrid.setBounds(56, 97, 56, 23);
		
		contentPane.add(rdbtnThrid);
		lblRadio.setBounds(143, 60, 149, 45);
		
		contentPane.add(lblRadio);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBounds(56, 163, 218, 45);
		
		contentPane.add(slider);
		label.setBounds(311, 174, 46, 14);
		
		contentPane.add(label);
	}
	protected void do_rdbtnSecond_actionPerformed(ActionEvent e) {
	}
	protected void do_rdbtnThrid_actionPerformed(ActionEvent e) {
	}
	protected void do_rdbtnFirst_actionPerformed(ActionEvent e) {
	}
}
