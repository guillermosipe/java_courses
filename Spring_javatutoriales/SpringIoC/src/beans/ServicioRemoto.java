/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

// nombre distinto: (value="")
// tambien se puede usar  (value="") para hacer anotación sin necesidad de un archivo XML de configuración
@Service(value="servicioRemoto")
public class ServicioRemoto {
       
    private Proceso proceso;
    
    // DI basado 
    @Value(value="5")
    private Integer repeticiones;

    public void setRepeticiones(Integer repeticiones)
    {
     this.repeticiones = repeticiones;
    }
    
    public ServicioRemoto()
    {
        
    }
    
    @Autowired    
    public ServicioRemoto(@Qualifier("ordenamiento")Proceso proceso)
    {
        this.proceso = proceso;
    }
    
    public Object consultarDato()
    {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < repeticiones; i++)
        {
            stringBuilder.append(i + 1).append(" ").append(proceso.ejecuta()).append("\n");
        }

        return stringBuilder.toString();
    }
    
}
