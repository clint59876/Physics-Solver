package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.common.base.Preconditions;
import javax.swing.JCheckBox;

public class MainWindow {

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 541);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		textAccX = new JTextField();
		frame.getContentPane().add(textAccX, "2, 4, fill, default");
		textAccX.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acceleration X");
		frame.getContentPane().add(chckbxNewCheckBox, "4, 4");
		
		textAccY = new JTextField();
		textAccY.setText("9.8");
		textAccY.setColumns(10);
		frame.getContentPane().add(textAccY, "2, 6, fill, default");
		
		JCheckBox chckbxAccelerationY = new JCheckBox("Acceleration Y");
		frame.getContentPane().add(chckbxAccelerationY, "4, 6");
		
		textTime = new JTextField();
		textTime.setColumns(10);
		frame.getContentPane().add(textTime, "2, 8, fill, default");
		
		JCheckBox chckbxTime = new JCheckBox("Time");
		frame.getContentPane().add(chckbxTime, "4, 8");
		
		textAOL = new JTextField();
		textAOL.setColumns(10);
		frame.getContentPane().add(textAOL, "2, 10, fill, default");
		
		JCheckBox chckbxAngOfLaunch = new JCheckBox("Angle of launch");
		frame.getContentPane().add(chckbxAngOfLaunch, "4, 10");
		
		textLaunchVel = new JTextField();
		textLaunchVel.setColumns(10);
		frame.getContentPane().add(textLaunchVel, "2, 12, fill, default");
		
		JCheckBox chckbxLaunchVel = new JCheckBox("Launch Velocity");
		frame.getContentPane().add(chckbxLaunchVel, "4, 12");
		
		textVelX = new JTextField();
		textVelX.setColumns(10);
		frame.getContentPane().add(textVelX, "2, 14, fill, default");
		
		JCheckBox chckbxVelocityX = new JCheckBox("Velocity X");
		frame.getContentPane().add(chckbxVelocityX, "4, 14");
		
		textVelY = new JTextField();
		textVelY.setColumns(10);
		frame.getContentPane().add(textVelY, "2, 16, fill, default");
		
		JCheckBox chckbxVelocityY = new JCheckBox("Velocity Y");
		frame.getContentPane().add(chckbxVelocityY, "4, 16");
		
		textInitX = new JTextField();
		textInitX.setColumns(10);
		frame.getContentPane().add(textInitX, "2, 18, fill, default");
		
		JCheckBox chckbxInitX = new JCheckBox("Initial X");
		frame.getContentPane().add(chckbxInitX, "4, 18");
		
		textInitY = new JTextField();
		textInitY.setColumns(10);
		frame.getContentPane().add(textInitY, "2, 20, fill, default");
		
		JCheckBox chckbxInitY = new JCheckBox("Initial Y");
		frame.getContentPane().add(chckbxInitY, "4, 20");
		
		textEndX = new JTextField();
		textEndX.setColumns(10);
		frame.getContentPane().add(textEndX, "2, 22, fill, default");
		
		JCheckBox chckbxEndX = new JCheckBox("Ending X");
		frame.getContentPane().add(chckbxEndX, "4, 22");
		
		textEndY = new JTextField();
		textEndY.setColumns(10);
		frame.getContentPane().add(textEndY, "2, 24, fill, default");
		
		JCheckBox chckbxEndY = new JCheckBox("Ending Y");
		frame.getContentPane().add(chckbxEndY, "4, 24");
	}

}
