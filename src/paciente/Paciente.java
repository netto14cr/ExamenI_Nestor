package paciente;
import hospital.Hospital;

/**
 *
 * @author Néstor David Leiva Mora
 * Examen 1 - I ciclo 2022.
 */


public final class Paciente { // Clase inmutable

    //public abstract void imprimirCategoria();
    private final String nombre;
    private final int edad;
    private final int temperatura;
    private final boolean vomito;

    private final Hospital hospital;

    // Constructor de pacientes
    public Paciente(String nombre, int edad, int temperatura, boolean vomito, Hospital hospital) {
        this.nombre = nombre;
        this.edad = edad;
        this.temperatura = temperatura;
        this.vomito = vomito;
        this.hospital = hospital;
    }

    // Getters
    public Hospital getHospital() {
        return hospital;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean isVomito() {
        return vomito;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", edad=" + edad + ", temperatura=" + temperatura + ", vomito=" + vomito + '}';
    }

}
