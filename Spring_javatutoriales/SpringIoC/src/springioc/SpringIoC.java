/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springioc;

import beans.ServicioRemoto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author guillermosipe
 */

public class SpringIoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Convencionalmente haciendo llamada a una función
        /*ServicioRemoto sr = new ServicioRemoto();
        System.out.print(sr.consultarDato()+"\n");*/
        
        // A través de un BEAN usando XML
        /*ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        //ServicioRemoto servicio= (ServicioRemoto) context.getBean("servicioRemoto");
        ServicioRemoto servicio= context.getBean("servicioRemoto",ServicioRemoto.class);
        System.out.print(servicio.consultarDato()+"\n");*/
        
        // A través de un BEAN sin usar XML y usando anotaciones
        // Haciendo referencia a una clase
        ApplicationContext context= new AnnotationConfigApplicationContext(ServicioRemoto.class);
        // Haciendo referencia a un paquete
        //ApplicationContext context= new AnnotationConfigApplicationContext("beans");
        //ServicioRemoto servicio= (ServicioRemoto) context.getBean("servicioRemoto");
        ServicioRemoto servicio= context.getBean("servicioRemoto",ServicioRemoto.class);
        System.out.print(servicio.consultarDato()+"\n");
        
    }
    
}
