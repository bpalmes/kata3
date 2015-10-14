/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author usuario
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Histogram<String> histograma = new Histogram<>();
        String path ="Bibliotecas\\Documentos";
        try{
        BufferedReader fileIn = new BufferedReader (new FileReader (path));
         String mail;
         while((mail = fileIn.readLine()) != null){
             if(!mail.contains("@")){
                 continue;
             }
         }
             histograma.incremento(mail.split("@")[1]);
         }catch()
    }
        
        
    }
}
