/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_bd_ddr_6;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import java.io.File;

/**
 *
 * @author ubuntu
 */
public class Enlazarybuscar {
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
     
    public static void Enlazarybuscar(){
        Persona p1 = new Persona("Fernando", 30, 1.73, 73);
        Persona p2 = new Persona("Pepe", 30, 1.75, 80);
        Persona p3 = new Persona("Alfredo", 20, 1.9, 90);
        Persona p4 = new Persona("Roberto", 35, 1.70, 70);
        Persona p5 = new Persona("Domingo", 30, 1.73, 80);
        
        File f = new File("personas.db4o");
       
        ObjectContainer db = Db4oEmbedded.openFile(f.getAbsolutePath());
        
        db.store(p1);
        db.store(p2);
        db.store(p3);
        db.store(p4);
        db.store(p5);
        
        db.close();
    }
    
}
    

