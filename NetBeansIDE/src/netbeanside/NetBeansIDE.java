
package netbeanside;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author siddu
 */
public class NetBeansIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("NetBeans IDE");
        
        //FileOutputStream = to write the data
        //FileInputStream = to read the data
        
        try{
        FileOutputStream fos = new FileOutputStream("C:/MyJava/text.txt");
        String str = "Java programming";
        fos.write(str.getBytes());
        
        fos.close();
        
        }catch(FileNotFoundException fe){
            System.out.print(fe);
        }
        catch(IOException ioe){
            
        }
    }
    
}
