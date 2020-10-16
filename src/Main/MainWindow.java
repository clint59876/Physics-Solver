package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToggleButton;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JCheckBox;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class MainWindow implements ActionListener {

	private JFrame frame;
	private JTextField textAccX;
	private JTextField textTime;
	private JTextField textVelX;
	private JTextField textVelY;
	private JTextField textInitX;
	private JTextField textInitY;
	private JTextField textEndX;
	private JTextField textEndY;
	private JTextField textAOL;
	private JTextField textLaunchVel;
	private JTextField textAccY;
	public JTextPane Solutions;
	JTextField[] textArr;
	StyledDocument Sol;
	float[] input = new float[] {0,0,0,0,0,0,0,0,0,0,0};

	static boolean[] selected = new boolean[] { false, false, false, false, false, false, false, false, false, false,
			false };
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		textArr = initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @param textArr
	 */
	private JTextField[] initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 666, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(
				new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"), },
				new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, }));

		JButton btnStartSolving = new JButton("Solve");
		frame.getContentPane().add(btnStartSolving, "2, 2, left, default");

		textAccX = new JTextField();
		textAccX.setText("o");
		textAccX.setEditable(false);
		frame.getContentPane().add(textAccX, "2, 4, fill, default");
		textAccX.setColumns(10);

		JCheckBox chckbxAccelerationX = new JCheckBox("Acceleration X");
		frame.getContentPane().add(chckbxAccelerationX, "4, 4");

		textAccY = new JTextField();
		textAccY.setEditable(false);
		textAccY.setText("o");
		textAccY.setColumns(10);
		frame.getContentPane().add(textAccY, "2, 6, fill, default");

		JCheckBox chckbxAccelerationY = new JCheckBox("Acceleration Y");
		frame.getContentPane().add(chckbxAccelerationY, "4, 6");

		textTime = new JTextField();
		textTime.setText("o");
		textTime.setEditable(false);
		textTime.setColumns(10);
		frame.getContentPane().add(textTime, "2, 8, fill, default");

		JCheckBox chckbxTime = new JCheckBox("Time");
		frame.getContentPane().add(chckbxTime, "4, 8");

		textAOL = new JTextField();
		textAOL.setText("o");
		textAOL.setEditable(false);
		textAOL.setColumns(10);
		frame.getContentPane().add(textAOL, "2, 10, fill, default");

		JCheckBox chckbxAngOfLaunch = new JCheckBox("Angle of launch");
		frame.getContentPane().add(chckbxAngOfLaunch, "4, 10");

		textLaunchVel = new JTextField();
		textLaunchVel.setText("o");
		textLaunchVel.setEditable(false);
		textLaunchVel.setColumns(10);
		frame.getContentPane().add(textLaunchVel, "2, 12, fill, default");

		JCheckBox chckbxLaunchVel = new JCheckBox("Launch Velocity");
		frame.getContentPane().add(chckbxLaunchVel, "4, 12");

		textVelX = new JTextField();
		textVelX.setText("o");
		textVelX.setEditable(false);
		textVelX.setColumns(10);
		frame.getContentPane().add(textVelX, "2, 14, fill, default");

		JCheckBox chckbxVelocityX = new JCheckBox("Velocity X");
		frame.getContentPane().add(chckbxVelocityX, "4, 14");

		textVelY = new JTextField();
		textVelY.setText("o");
		textVelY.setEditable(false);
		textVelY.setColumns(10);
		frame.getContentPane().add(textVelY, "2, 16, fill, default");

		JCheckBox chckbxVelocityY = new JCheckBox("Velocity Y");
		frame.getContentPane().add(chckbxVelocityY, "4, 16");

		textInitX = new JTextField();
		textInitX.setText("o");
		textInitX.setEditable(false);
		textInitX.setColumns(10);
		frame.getContentPane().add(textInitX, "2, 18, fill, default");

		JCheckBox chckbxInitX = new JCheckBox("Initial X");
		frame.getContentPane().add(chckbxInitX, "4, 18");

		textInitY = new JTextField();
		textInitY.setText("o");
		textInitY.setEditable(false);
		textInitY.setColumns(10);
		frame.getContentPane().add(textInitY, "2, 20, fill, default");

		JCheckBox chckbxInitY = new JCheckBox("Initial Y");
		frame.getContentPane().add(chckbxInitY, "4, 20");

		textEndX = new JTextField();
		textEndX.setText("o");
		textEndX.setEditable(false);
		textEndX.setColumns(10);
		frame.getContentPane().add(textEndX, "2, 22, fill, default");

		JCheckBox chckbxEndX = new JCheckBox("Ending X");
		frame.getContentPane().add(chckbxEndX, "4, 22");

		textEndY = new JTextField();
		textEndY.setText("o");
		textEndY.setEditable(false);
		textEndY.setColumns(10);
		frame.getContentPane().add(textEndY, "2, 24, fill, default");

		JCheckBox chckbxEndY = new JCheckBox("Ending Y");
		frame.getContentPane().add(chckbxEndY, "4, 24");

		scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "2, 26, 3, 3, fill, fill");

		Solutions = new JTextPane();
		scrollPane.setViewportView(Solutions);
		Solutions.setEditable(false);
		Solutions.setText("Solutions Here");
		Sol = Solutions.getStyledDocument();

		chckbxEndY.addActionListener(this);
		chckbxEndX.addActionListener(this);
		chckbxInitY.addActionListener(this);
		chckbxInitX.addActionListener(this);
		chckbxVelocityY.addActionListener(this);
		chckbxVelocityX.addActionListener(this);
		chckbxLaunchVel.addActionListener(this);
		chckbxAngOfLaunch.addActionListener(this);
		chckbxTime.addActionListener(this);
		chckbxAccelerationY.addActionListener(this);
		chckbxAccelerationX.addActionListener(this);
		btnStartSolving.addActionListener(this);

		return new JTextField[] { textAccX, textAccY, textTime, textAOL, textLaunchVel, textVelX, textVelY, textInitX,
				textInitY, textEndX, textEndY };

	}

	@Override
	public void actionPerformed(ActionEvent eve) {
		AbstractButton cb = (AbstractButton) eve.getSource();
		switch (cb.getText()) {
		case "Acceleration X":
			selected[0] = !selected[0];
			break;
		case "Acceleration Y":
			selected[1] = !selected[1];
			break;
		case "Time":
			selected[2] = !selected[2];
			break;
		case "Angle of launch":
			selected[3] = !selected[3];
			break;
		case "Launch Velocity":
			selected[4] = !selected[4];
			break;
		case "Velocity X":
			selected[5] = !selected[5];
			break;
		case "Velocity Y":
			selected[6] = !selected[6];
			break;
		case "Initial X":
			selected[7] = !selected[7];
			break;
		case "Initial Y":
			selected[8] = !selected[8];
			break;
		case "Ending X":
			selected[9] = !selected[9];
			break;
		case "Ending Y":
			selected[10] = !selected[10];
			break;
		case "Solve":
			startSolve();
			break;
		}

		updateAcces();
	}

	private void startSolve() {
		for (int i = 0; i <= selected.length - 1; i++) {
			if ((selected[i] == true) && (!textArr[i].getText().isEmpty())) {
				String temp = textArr[i].getText();
				try {
					input[i] = Float.valueOf(temp);
				} catch (NumberFormatException nfe) {
					textArr[i].setText("Not a number");
					break;
				}
			}else {
				input[i] = 0;
			}

		}
		Calculations calculate = new Calculations(input, selected);
		try {
			Solutions.setText("");
			Sol.insertString(0, calculate.calculate(), null);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

	private void updateAcces() {
		for (int i = 0; i <= selected.length - 1; i++) {
			if (selected[i] == false) {
				textArr[i].setEditable(false);
			} else {
				textArr[i].setEditable(true);
			}
		}
	}

}
