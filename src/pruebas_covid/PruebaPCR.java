package pruebas_covid;
import paciente.Paciente;

/**
 *
 * @author Néstor David Leiva Mora
 * Examen 1 - I ciclo 2022.
 */


public final class PruebaPCR implements PruebaCovid19 { // clase inmutable

    public Paciente paciente; // Composición

    public PruebaPCR(Paciente paciente) {
        this.paciente = paciente;
    }

    public boolean isPositive() {
        return (this.paciente.getTemperatura() >= 39 && this.paciente.isVomito());
    }

    @Override
    public String getNombrePaciente() {
        return paciente.getNombre();
    }
    
    @Override
    public Paciente getPaciente() {
        return this.paciente;
    }

}
