package be.nuytsm.LdapQuerierGradle.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.layout.AC;
import net.miginfocom.layout.CC;
import net.miginfocom.layout.LC;
import net.miginfocom.swing.MigLayout;

public class ViewFactory {
	
	public void createView() {
		MigLayout layout = new MigLayout(
				new LC().fillX(),
				new AC().align("right").gap("rel").grow().fill(),
				new AC().gap("10"));
		JPanel panel = new JPanel(layout);
		
		panel.add(new JLabel("Enter size:"));
		panel.add(new JTextField(""), new CC().wrap());
		panel.add(new JLabel("Enter weight:"));
		panel.add(new JTextField(""));
		System.out.println("panel created");
		
		createFrame(panel);
	}

	private void createFrame(JPanel panel) {
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setSize(800, 600);
//		        frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
