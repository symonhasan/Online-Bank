
package AppPackage;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Symon Hasan
 */
public class SiteOpen {
    public void openWebsite(String sitelink)
    {
        try{
            Process p;
            p= Runtime.getRuntime().exec("cmd /c start "+sitelink);
        }catch(IOException Ie)
        {
            JOptionPane.showMessageDialog(null,"Error 404");
        }
    }
}
