
package exemploficheiros.Lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Numeros {
   Scanner sc; 
   File fich;
    public void lerNumeros(String nomeFich){
        try{
            sc=new Scanner(new File(nomeFich));
            while(sc.hasNextInt())
                System.out.println(sc.nextInt());
        }catch (FileNotFoundException ex){
            System.out.println("erro 3: " + ex.getMessage());
        }finally{
            sc.close(); 
        }
           
        
    }
    public void lerNumerosComa(String nomeFich){
         fich=new File (nomeFich);
        try{
            sc=new Scanner(fich).useDelimiter(",|\n");//
            while(sc.hasNextInt())
                System.out.println(sc.nextInt());
        }catch (FileNotFoundException ex){
            System.out.println("erro 3: " + ex.getMessage());
        }finally{
            sc.close(); 
        }
     
    }
    
}
