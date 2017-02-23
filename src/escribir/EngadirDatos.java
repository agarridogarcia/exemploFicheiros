
package escribir;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class EngadirDatos {
    PrintWriter engado;
    FileWriter fich;
    
    public void engadir(String nomeFich, String dato){
        try{
            engado=new PrintWriter(new FileWriter (nomeFich,true));
            engado.println(dato);
        }catch(IOException ex){
            ex.getMessage();
        }finally{
            engado.close();
        }
        
    }
    
}
