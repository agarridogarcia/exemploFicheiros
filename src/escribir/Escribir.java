
package escribir;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Escribir {
    File fich;
    PrintWriter f= null;
    
    public void escribirTexto(String nomeFich){
        try{
            fich=new File(nomeFich);
            f=new PrintWriter(fich);
            f.println("Probando a escribir nun ficheiro");
            f.println("con varias liñas");
            f.println("de texto");
            
        }catch(FileNotFoundException ex){
            System.out.println("erro 4: " + ex.getMessage());
        }finally{
            f.close();
        }
        
    }
    
    
}
