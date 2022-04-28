package pruebas_covid;
import paciente.Paciente;

/**
 *
 * @author Néstor David Leiva Mora
 * Examen 1 - I ciclo 2022.
 */

public interface PruebaCovid19 { // Calse de tipo interfaz

    public abstract boolean isPositive();

    public abstract String getNombrePaciente();
    
    public abstract Paciente getPaciente();
}
