
package oms;

import java.util.ArrayList;
import paciente.Paciente;

/**
 *
 * @author Néstor David Leiva Mora
 * Examen 1 - I ciclo 2022.
 */

public class HospitalMexico extends Oms{ // Clase que implementa la herencia con los datos de la clase OMS

    public HospitalMexico(ArrayList<Paciente> listaPacientes) {
        super(listaPacientes);
    }

    @Override
    public boolean isGamHospital() {
        return false;
    }

    @Override
    public String getNombreHospital() {
        return "";
    }
    
}
