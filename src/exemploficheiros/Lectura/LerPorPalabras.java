
package exemploficheiros.Lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LerPorPalabras {
     Scanner sc;
     
public void lerPalabras(String nomeFich){
  try{
    sc=new Scanner (new File(nomeFich));
    while(sc.hasNext())
          System.out.println(sc.next());
 }catch(FileNotFoundException ex){
      System.out.println("erro 2: " + ex.getMessage());
 }finally{
      sc.close();
  }
}
     
     
}
