/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.springframework.stereotype.Service;

/**
 *
 * @author guillermosipe
 */
@Service
public class Concatenacion implements Proceso {

    @Override
    public Object ejecuta() {
        return new StringBuilder().append("Hola ").append(" mundo");
    }
    
}
