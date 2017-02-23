/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploficheiros.Lectura;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import exemploficheiros.xogadores.Xogador;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agarridogarcia
 */
public class LerObxectos {
    Scanner sc;
    ArrayList <Xogador> lista;
    
    public void lerObx(String nomeFich){
        try {
            sc= new Scanner(new File(nomeFich));
            while(sc.hasNextLine())
                System.out.println(sc.nextLine());
            
        } catch (FileNotFoundException ex) {
            System.out.println("erro apertura: " + ex.getMessage());
        }finally{
            sc.close();
        }
        
    }
    public void lerObxectos(String nomeFich){
        lista= new ArrayList<Xogador>();
        try {
           
            
            sc=new Scanner (new File(nomeFich));
            while(sc.hasNextLine()){
                String[]aux=sc.nextLine().split(",");
               Xogador o =new Xogador(aux[0], Integer.parseInt(aux[1]));
               lista.add(o);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }finally{
            sc.close();
        }
    }
    
    public void amosar(){
        for(int i=0; i<lista.size();i++)
            System.out.println(lista.get(i));
    }
}
