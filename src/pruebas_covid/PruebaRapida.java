package pruebas_covid;
import paciente.Paciente;

/**
 *
 * @author Néstor David Leiva Mora
 * Examen 1 - I ciclo 2022.
 */


public final class PruebaRapida implements PruebaCovid19 {

    public Paciente paciente;

    public PruebaRapida(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public boolean isPositive() {
        return (this.paciente.getTemperatura() >= 37 && this.paciente.getEdad() >= 60);
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
