/**
 * @name        Java Applikation f�r diverse Bitoperationen
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
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class UI {

	
	private final JFrame frame;
	private final JPanel panel;

	/** MAIN sub-panels */
    private final JPanel panelAkku;
    private final JPanel panelRota;
    private final JPanel panelResu;
    
    
	/** AKKU-1 Panel and its elements */
	private JPanel 			panel_A1, panel_R1;
	private JButton			btn_a1_clr, btn_a1_inv;

	
	/** AKKU 2 Panel and its elements */
	private JPanel 			panel_A2, panel_R2;
	private JButton			btn_a2_clr, btn_a2_inv;


	/** RESULT Panel and its elements (used AKKU panel) */
	private JPanel 			panel_A3;
	

	/** used for creating a pseudo-Akku widget */
	final int  AKKU_LABELS = 10;
	final int  AKKU_PANELS = 5;
	final int  AKKU_BUTTONS = 3;
	
	private Akkudata akku1, akku2, akku3;
	private JLabel[]  akku1label  = new JLabel[AKKU_LABELS];	
	private JPanel[]  akku1panel  = new JPanel[AKKU_PANELS];
	private JButton[] akku1button = new JButton[AKKU_BUTTONS];
	private JLabel[] akku2label = new JLabel[AKKU_LABELS];
	private JPanel[] akku2panel = new JPanel[AKKU_PANELS];
	private JButton[] akku2button = new JButton[AKKU_BUTTONS];
	private JLabel[] akku3label = new JLabel[AKKU_LABELS];
	private JPanel[] akku3panel = new JPanel[AKKU_PANELS];
	private JButton[] akku3button = new JButton[AKKU_BUTTONS];
	
	
	public UI() throws IOException {
		/** MAIN window size, layout, orientation definition */
		frame = new JFrame("jBitpopler");	
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		/** MAIN sub-panels */
      	panelAkku = new JPanel(new FlowLayout());
      	panelRota = new JPanel(new FlowLayout());
      	panelResu = new JPanel(new FlowLayout());

      	/** initialisation of AKKU-1 */
      		panel_R1 = new JPanel(new FlowLayout());
	      	btn_a1_clr = new JButton();
	      	btn_a1_inv = new JButton();

      /** initialisation of AKKU-2 */
	      	panel_R2 = new JPanel(new FlowLayout());
	      	btn_a2_clr = new JButton();
	      	btn_a2_inv = new JButton();

	      	
	/** COMMON initialisation of AKKU 1-3 */      	
	      	for (int i=0; i<AKKU_LABELS; i++) {
	      		akku1label[i] = new JLabel();
	      		akku2label[i] = new JLabel();
	      		akku3label[i] = new JLabel();
	      	}
	      	
	      	for (int i=0; i<AKKU_PANELS; i++) {
	      		akku1panel[i] = new JPanel(new FlowLayout());
	      		akku2panel[i] = new JPanel(new FlowLayout());
	      		akku3panel[i] = new JPanel(new FlowLayout());
	      	}
	      	
	      	for (int i=0; i<AKKU_BUTTONS; i++) {
	      		akku1button[i] = new JButton();
	      		akku2button[i] = new JButton();
	      		akku3button[i] = new JButton();	      		
	      	}

	      	
	}

	
	public JPanel widgetAkku(JLabel[] akkuLabels, JPanel[] akkuPanels,  JButton[] akkuButtons, Akkudata akku) {

		/**
		 *  Expected order of list "JLabels":
		 *  =================================
		 *  Jlabel[] = lbl_hex, lbl_dez, lbl_okt, lbl_bin, lbl_db3, lbl_db2, lbl_db1, lbl_db0, lbl_dw1, lbl_dw0 ;
		 *  
		 *  Expected order of list "JPanels":
		 *  =================================      	
		 *  Jpanel[] = panel_oben, panel_mitte, panel_unten, panel_unten_byte, panel_unten_word ;
		 *  
		 *  Expected order of list "JButtons":
		 *  =================================
		 *  Jbutton[] = clear, invert, revert ;
		 *  
		 */
		
		/* Default decoration for type JPanel */
		JPanel tmpPanel = new JPanel();
		tmpPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		/* Default decoration for type JPanel */
		JLabel tmpLabel = new JLabel();
		tmpLabel.setBorder(BorderFactory.createLineBorder(Color.lightGray));
		
		
	  JPanel myPanel1 = new JPanel(new BorderLayout());
	  myPanel1.setBorder(tmpPanel.getBorder());
      
	  for (int i=0; i<akkuLabels.length;i++) {
		  akkuLabels[i].setText(String.valueOf(akku.getAkkudata()[i]));
		  akkuLabels[i].setBorder(tmpLabel.getBorder());
	  }

	  
      // panel_oben
	  akkuPanels[0].setBorder(tmpLabel.getBorder());
	  akkuPanels[0].add(akkuLabels[0]);
	  akkuPanels[0].add(akkuLabels[1]);
	  akkuPanels[0].add(akkuLabels[2]);
      myPanel1.add(akkuPanels[0], BorderLayout.NORTH);
      
      // panel_mitte	      
      akkuPanels[1].add(akkuLabels[3]);
      myPanel1.add(akkuPanels[1],BorderLayout.CENTER);
      
      // panel links      
      JPanel BtnPanel = new JPanel();
      BtnPanel.setLayout(new BoxLayout(BtnPanel, BoxLayout.Y_AXIS));
      
      int wid=45;
      int hei=25;
      for (int i=0; i<akkuButtons.length;i++) {
    	  akkuButtons[i].setPreferredSize(new Dimension(wid, hei));  
    	  akkuButtons[i].setFont(new Font("Courier", Font.PLAIN, 10));
    	
      }
      
      akkuButtons[0].setText("c");
      akkuButtons[0].setToolTipText("clear value");
      akkuButtons[1].setText("i");
      akkuButtons[1].setToolTipText("invert bits");
      akkuButtons[2].setText("r");
      akkuButtons[2].setToolTipText("revert bits");
      
      BtnPanel.add(akkuButtons[0]);     
      BtnPanel.add(akkuButtons[1]);      
      BtnPanel.add(akkuButtons[2]);      
      myPanel1.add(BtnPanel,BorderLayout.WEST);
      
      // panel_unten_byte
      akkuPanels[3].add(akkuLabels[4]);
      akkuPanels[3].add(akkuLabels[5]);	
      akkuPanels[3].add(akkuLabels[6]);
      akkuPanels[3].add(akkuLabels[7]);
      

      // panel_unten_word
      akkuPanels[4].add(akkuLabels[8]);
      akkuPanels[4].add(akkuLabels[9]);
      

      // panel_unten
      akkuPanels[2].setBorder(tmpLabel.getBorder());
      akkuPanels[2].add(akkuPanels[3]);
      akkuPanels[2].add(akkuPanels[4]);
      myPanel1.add(akkuPanels[2], BorderLayout.SOUTH);

      return myPanel1;
}
	
	public void init() {
	      frame.setSize(500, 400);
	      frame.setVisible(true);
	      frame.setLocationRelativeTo(null); 
	      frame.setResizable(false);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    
	      /** MAIN sub-panels */
	      panelAkku.setBorder(BorderFactory.createLineBorder(Color.blue));
	      panelRota.setBorder(BorderFactory.createLineBorder(Color.green));
	      panelResu.setBorder(BorderFactory.createLineBorder(Color.red));
	      
	      
	      /** AKKU-1 Panel + Elements */
	      akku1= Akkudata.createData();
	      akku1.setAkkudata(101,AKKU_LABELS);	      
	      panel_A1=widgetAkku(akku1label, akku1panel, akku1button, akku1);
	      panelAkku.add(panel_A1);

	      
	      /** AKKU-2 Panel + Elements */
	      akku2 = Akkudata.createData();
	      akku2.setAkkudata(121,AKKU_LABELS);
	      panel_A2=widgetAkku(akku2label, akku2panel, akku2button, akku2);
	      panelAkku.add(panel_A2);
	      	      

	      /** ROTA 1 + 2 Panel */
	      panel_R1.setBorder(BorderFactory.createLineBorder(Color.gray));
	      panelRota.add(panel_R1);	  
	      panel_R2.setBorder(BorderFactory.createLineBorder(Color.gray));
	      panelRota.add(panel_R2);

	      
	      /** RESU Panel */
	      akku3 = Akkudata.createData();
	      akku3.setAkkudata(131,AKKU_LABELS);
	      panel_A3=widgetAkku(akku3label, akku3panel, akku3button,  akku3);
	      panelResu.add(panel_A3);

	      /** Arrange MAIN sub panels */	      
	      panel.add(panelAkku);
	      panel.add(panelRota);
	      panel.add(panelResu);
	      frame.add(panel);
	      	
	}
	
	/**
	 * Initialize the contents of the frame.
	 */


}

