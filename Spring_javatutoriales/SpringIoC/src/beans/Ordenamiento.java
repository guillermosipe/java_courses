/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author guillermosipe
 */
@Service
public class Ordenamiento implements Proceso{

    @Override
    public Object ejecuta() {
        List <Integer> listaEnteros = new ArrayList<Integer>();
        listaEnteros.add(9);
        listaEnteros.add(3);
        listaEnteros.add(1);
        listaEnteros.add(6);
        listaEnteros.add(5);
        listaEnteros.add(10);
        
        Collections.sort(listaEnteros);
        
        return listaEnteros;
    }
    
}
