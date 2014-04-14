package be.nuytsm.LdapQuerierGradle.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import net.miginfocom.layout.AC;
import net.miginfocom.layout.CC;
import net.miginfocom.layout.LC;
import net.miginfocom.swing.MigLayout;

public class GuiStarter {
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				ViewFactory vf = new ViewFactory();
				vf.createView();
			}

		});		

	}
	
	

}
