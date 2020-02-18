/**
 * @name        Java Applikation für diverse Bitoperationen
 * @package     none
 * @file        UI.java
 * @author      Frickler-Fritz
 * @email       -
 * @link        https://github.com/Frickler-Fritz/jBitpopler
 * @copyright   Copyright Frickler-Fritz, All Rights Reserved.
 * @license     GNU General Public License v3.0
 * @create      2020-02-18
 *
 * @modifiedby  -
 * @modweb      -
 * @modemail    -
 */

package jbitpopler;

import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class UI {

	
	private final JFrame frame;
	private final JPanel panel;
		/* testwise */
		private final JPanel panelSub1;
	    private final JPanel panelSub2;
	    private final JPanel panelSub3;
	    private final JPanel panelSub4;
	
	
	public UI() throws IOException {
		frame = new JFrame("jBitpopler");	
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

			/* testwise */
	      	panelSub1 = new JPanel(new FlowLayout());
	      	panelSub2 = new JPanel(new FlowLayout());
	      	panelSub3 = new JPanel(new FlowLayout());
	      	panelSub4 = new JPanel(new FlowLayout());
	      
	}

	public void init() {
	      frame.setSize(450, 450);
	      frame.setVisible(true);
	      frame.setLocationRelativeTo(null); 
	      frame.setResizable(false);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    
	      /* testwise */
	      panel.add(panelSub1);
	      panel.add(panelSub2);
	      panel.add(panelSub3);
	      panel.add(panelSub4);
	      frame.add(panel);
	      	
	}
	
	/**
	 * Initialize the contents of the frame.
	 */


}
