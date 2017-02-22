
package exemploficheiros;

import exemploficheiros.Lectura.LerLiña;
import exemploficheiros.Lectura.LerPorPalabras;
import exemploficheiros.Lectura.Numeros;

public class ExemploFicheiros {

    
    public static void main(String[] args) {
        LerLiña obxFich= new LerLiña();
        //obxFich.ler("exemFichero.txt");
        obxFich.ler("/home/local/DANIELCASTELAO/agarridogarcia/Escritorio/exemFichero.txt");
        
        LerPorPalabras obx2= new LerPorPalabras();
        //obx2.lerPalabras("hola.txt");
        obx2.lerPalabras("/home/local/DANIELCASTELAO/agarridogarcia/Escritorio/hola.txt");
     
        
        Numeros num=new Numeros();
        //num.lerNumeros("numeros.txt");
        num.lerNumeros("/home/local/DANIELCASTELAO/agarridogarcia/Escritorio/numeros.txt");
   
    
    }
    
}
