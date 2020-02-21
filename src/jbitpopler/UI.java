/**
 * @name        Java Applikation für diverse Bitoperationen
 * @package     jbitpopler
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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javafx.scene.layout.Border;


public class UI {

	
	private final JFrame frame;
	private final JPanel panel;

	/** MAIN sub-panels */
    private final JPanel panelAkku;
    private final JPanel panelRota;
    private final JPanel panelResu;
    
    
	/** AKKU-1 Panel + Elements */
	private final JPanel 	panel_A1, panel_R1, panel_A1_oben, panel_A1_mitte, panel_A1_unten, 
							panel_A1_unten_word, panel_A1_unten_byte;
	
	private final JButton	btn_a1_clr, btn_a1_inv;
	private final JLabel	lbl_a1_hex, lbl_a1_dez, lbl_a1_okt, lbl_a1_bin,
							lbl_a1_db3,lbl_a1_db2,lbl_a1_db1,lbl_a1_db0,
							lbl_a1_dw1,lbl_a1_dw0;

	/** AKKU-2 Panel + Elements */

	private final JPanel	panel_A2, panel_R2;
	private final JButton	btn_a2_clr, btn_a2_inv;
	private final JLabel	lbl_a2_hex, lbl_a2_dez, lbl_a2_okt, lbl_a2_bin,
							lbl_a2_db3,lbl_a2_db2,lbl_a2_db1,lbl_a2_db0,
							lbl_a2_dw1,lbl_a2_dw0;

	
	
	public UI() throws IOException {
		/** MAIN window size, layout, orientation definition */
		frame = new JFrame("jBitpopler");	
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		/** MAIN sub-panels */
      	panelAkku = new JPanel(new FlowLayout());
      	panelRota = new JPanel(new FlowLayout());
      	panelResu = new JPanel(new FlowLayout());
	      	
	      	/** AKKU-1 Panel + Elements */
	      	panel_A1 = new JPanel(new BorderLayout());
	      	panel_R1 = new JPanel(new FlowLayout());
	      	panel_A1_oben = new JPanel(new FlowLayout());
	      	panel_A1_mitte = new JPanel(new FlowLayout());
	      	panel_A1_unten = new JPanel(new FlowLayout());	      	
	      	panel_A1_unten_byte = new JPanel(new FlowLayout());
	      	panel_A1_unten_word = new JPanel(new FlowLayout());
	      	
	      	lbl_a1_hex = new JLabel();
	      	lbl_a1_dez = new JLabel();
	      	lbl_a1_okt = new JLabel();
	      	lbl_a1_bin = new JLabel();
	      	lbl_a1_db3 = new JLabel();
	      	lbl_a1_db2 = new JLabel();
	      	lbl_a1_db1 = new JLabel();
	      	lbl_a1_db0 = new JLabel();
	      	lbl_a1_dw1 = new JLabel();
	      	lbl_a1_dw0 = new JLabel();
	      	btn_a1_clr = new JButton();
	      	btn_a1_inv = new JButton();

	      	/** AKKU-2 Panel + Elements */
	      	panel_A2 = new JPanel(new FlowLayout());
	      	panel_R2 = new JPanel(new FlowLayout());
	      	lbl_a2_hex = new JLabel();
	      	lbl_a2_dez = new JLabel();
	      	lbl_a2_okt = new JLabel();
	      	lbl_a2_bin = new JLabel();
	      	lbl_a2_db3 = new JLabel();
	      	lbl_a2_db2 = new JLabel();
	      	lbl_a2_db1 = new JLabel();
	      	lbl_a2_db0 = new JLabel();
	      	lbl_a2_dw1 = new JLabel();
	      	lbl_a2_dw0 = new JLabel();
	      	btn_a2_clr = new JButton();
	      	btn_a2_inv = new JButton();
	      
	}

	public void init() {
	      frame.setSize(400, 600);
	      frame.setVisible(true);
	      frame.setLocationRelativeTo(null); 
	      frame.setResizable(false);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    
	      /** MAIN sub-panels */
	      panelAkku.setBorder(BorderFactory.createLineBorder(Color.blue));
	      panelRota.setBorder(BorderFactory.createLineBorder(Color.green));
	      panelResu.setBorder(BorderFactory.createLineBorder(Color.red));
	      
	      
	      /** AKKU-1 Panel + Elements */
	      panel_A1.setBorder(BorderFactory.createLineBorder(Color.black));
	      panel_R1.setBorder(BorderFactory.createLineBorder(Color.gray));
	      lbl_a1_hex.setText("hex");
	      lbl_a1_dez.setText("dez");
	      lbl_a1_okt.setText("okt");
	      lbl_a1_bin.setText("bin");
	      lbl_a1_db3.setText("db3");
	      lbl_a1_db2.setText("db2");
	      lbl_a1_db1.setText("db1");
	      lbl_a1_db0.setText("db0");
	      lbl_a1_dw1.setText("dw1");
	      lbl_a1_dw0.setText("dw0");
	        
	      // oben
	      panel_A1_oben.add(lbl_a1_hex);
	      panel_A1_oben.add(lbl_a1_dez);
	      panel_A1_oben.add(lbl_a1_okt);
	      panel_A1.add(panel_A1_oben, BorderLayout.NORTH);
	      
	      //mitte	      
	      panel_A1_mitte.add(lbl_a1_bin);
	      panel_A1.add(panel_A1_mitte,BorderLayout.CENTER);
	      
	      //unten
	      panel_A1_unten_byte.add(lbl_a1_db3);
	      panel_A1_unten_byte.add(lbl_a1_db2);	
	      panel_A1_unten_byte.add(lbl_a1_db1);
	      panel_A1_unten_byte.add(lbl_a1_db0);
       
	      panel_A1_unten_word.add(lbl_a1_dw1);
	      panel_A1_unten_word.add(lbl_a1_dw0);
	      
	      panel_A1_unten.add(panel_A1_unten_byte);
	      panel_A1_unten.add(panel_A1_unten_word);
	      panel_A1.add(panel_A1_unten, BorderLayout.SOUTH);
	      
	      
	      panelAkku.add(panel_A1);
	      panelRota.add(panel_R1);
	      
	      /** AKKU-2 Panel + Elements */
	      panel_A2.setBorder(BorderFactory.createLineBorder(Color.black));
	      panel_R2.setBorder(BorderFactory.createLineBorder(Color.gray));
	      lbl_a2_hex.setText("hex");
	      lbl_a2_dez.setText("dez");
	      lbl_a2_okt.setText("okt");
	      panel_A2.add(lbl_a2_hex);
	      panel_A2.add(lbl_a2_dez);
	      panel_A2.add(lbl_a2_okt);
	      panelAkku.add(panel_A2);
	      
	      

	      /** Arrange MAIN sub panels */
	      
	      
	      
	      panelRota.add(panel_R2);
	      panel.add(panelAkku);
	      panel.add(panelRota);
	      panel.add(panelResu);
	      frame.add(panel);
	      	
	}
	
	/**
	 * Initialize the contents of the frame.
	 */


}

