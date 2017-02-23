
package exemploficheiros;

import escribir.EngadirDatos;
import escribir.Escribir;
import exemploficheiros.Lectura.LerLiña;
import exemploficheiros.Lectura.LerObxectos;
import exemploficheiros.Lectura.LerPorPalabras;
import exemploficheiros.Lectura.Numeros;

public class ExemploFicheiros {

    
    public static void main(String[] args) {
        LerLiña obxFich= new LerLiña();
        //obxFich.ler("exemFichero.txt"); //Asi se pon si o ficheiro está gardado na carpeta do proxecto se non hai que poñer a ruta completa
        obxFich.ler("/home/local/DANIELCASTELAO/agarridogarcia/Escritorio/exemFichero.txt");
        
        LerPorPalabras obx2= new LerPorPalabras();
        //obx2.lerPalabras("hola.txt");
        obx2.lerPalabras("/home/local/DANIELCASTELAO/agarridogarcia/Escritorio/hola.txt");
     
        
        Numeros num=new Numeros();
        //num.lerNumeros("numeros.txt");
        num.lerNumeros("/home/local/DANIELCASTELAO/agarridogarcia/Escritorio/numeros.txt");
        num.lerNumerosComa("/home/local/DANIELCASTELAO/agarridogarcia/Escritorio/numeros.txt");
    
        
        LerObxectos obx=new LerObxectos();
        obx.lerObxectos("/home/local/DANIELCASTELAO/agarridogarcia/Escritorio/dorsal.txt");
        obx.amosar();
        
        Escribir esc=new Escribir();
        esc.escribirTexto("/home/local/DANIELCASTELAO/agarridogarcia/Escritorio/escribir.txt");
        
        EngadirDatos engad= new EngadirDatos();
        engad.engadir("/home/local/DANIELCASTELAO/agarridogarcia/Escritorio/escribir.txt", "Engadir nova liña");
        
        
        
        
    }
    
}
