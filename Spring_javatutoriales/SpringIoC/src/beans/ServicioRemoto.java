/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.springframework.stereotype.Service;

// nombre distinto: (value="")
// tambien se puede usar  (value="") para hacer anotación sin necesidad de un archivo XML de configuración
@Service(value="servicioRemoto")
public class ServicioRemoto {
       
    public int consultarDato()
    {
        return (int)(Math.random()*10.0);
    }
    
}
