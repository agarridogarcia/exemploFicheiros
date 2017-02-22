
package exemploficheiros.Lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LerLiña {
    File fich;
    Scanner sc;
    
    public void ler(String nomeFich){
        fich = new File(nomeFich);
        try {
            sc = new Scanner(fich);
            while(sc.hasNextLine())
                System.out.println(sc.nextLine());
            
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
        finally{
            //if(sc!=null)
               sc.close();
        }
    }
    
}
