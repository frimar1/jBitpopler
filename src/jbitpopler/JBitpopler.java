
/**
 * @name        Java Applikation für diverse Bitoperationen
 * @package     jbitpopler
 * @file        JBitpopler.java
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

public class JBitpopler {

	public static void main(String[] args) {
	      try {
	          UI uiPop = new UI();
	          uiPop.init();
	       }
	       catch (Exception e) {
	          System.out.println(e.getMessage());   
	       }

	}

}
