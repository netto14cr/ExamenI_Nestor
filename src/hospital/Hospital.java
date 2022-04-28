package hospital;

/**
 *
 * @author Néstor David Leiva Mora
 * Examen 1 - I ciclo 2022.
 */

public enum Hospital {

    Nicoya("Hospital de Nicoya", "Guanacaste"),
    Mexico("Hospital de Mexico", "GAM");

    private String tipo;
    private String nombre;

    Hospital(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

}
