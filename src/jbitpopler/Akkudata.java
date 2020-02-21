/**
 * @name        Java Applikation für diverse Bitoperationen
 * @package     jbitpopler
 * @file        Akkudata.java
 * @author      Frickler-Fritz
 * @email       -
 * @link        https://github.com/Frickler-Fritz/jBitpopler
 * @copyright   Copyright Frickler-Fritz, All Rights Reserved.
 * @license     GNU General Public License v3.0
 * @create      2020-02-21
 *
 * @modifiedby  -
 * @modweb      -
 * @modemail    -
 */

package jbitpopler;

import java.util.ArrayList;
import java.util.List;

class Akkudata {

	/**
	 *  Proposed elements of list <int> "akku":
	 *  ====================================   
	 * 	lbl_hex, lbl_dez, lbl_okt, lbl_bin, lbl_db3, lbl_db2, lbl_db1, lbl_db0, lbl_dw1, lbl_dw0;
	 */
	
	private List<Integer> akku = new ArrayList<Integer>();

	
	public static Akkudata createData()
	{
			return new Akkudata();
	}
	
	public Integer[] getAkkudata() {
		Integer[] retval = new Integer[akku.size()];
		
		for (int i=0; i<this.akku.size(); i++) {
			retval[i] = this.akku.get(i);
		}
		return retval;
		
	}
	
	/** testweise belegen */
	public void setAkkudata(int start_val, int count_val) {
		for (int i=0; i<count_val; i++) {
			this.akku.add(start_val);
			start_val++;
		}
		
		
		
	}
	public void printAll() {
		String myStr="";
		for (int i=0; i<this.akku.size(); i++) {
			myStr = myStr + "," + String.valueOf(this.akku.get(i));
		}
		System.out.println(myStr);
	}
	

	
}
