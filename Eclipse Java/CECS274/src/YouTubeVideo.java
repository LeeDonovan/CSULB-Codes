/* Donovan Lee
 * Tea Laurey
 *  CECS 274 */
import java.net.*;// * means to import everything from the .net file
/// java.net is used for applications on your PC that use Internet connection
import java.awt.Desktop;//allows a java app to launch associated apps registered on a 
						///users desktop to handle a URI or a file 


public class YouTubeVideo {
	public static void main (String args[]) throws Exception
	{
	 	URI oracle = new URI("https://www.youtube.com/watch?v=yE85edTFpHU");
	    Desktop.getDesktop().browse(oracle);//the .getDesktop() returns the instance 
	    /// from an Internet browser pulled open by .browse(), which launches a default browser
	    ////to display a URI in the code.
 	}
}
