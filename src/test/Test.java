package test;

import hospital.Hospital;
import java.util.ArrayList;
import oms.HospitalMexico;
import oms.HospitalNicoya;
import paciente.Paciente;
import pruebas_covid.PruebaCovid19;
import pruebas_covid.PruebaPCR;
import pruebas_covid.PruebaRapida;
/**
 * Nombre: Test.java
 * @author Néstor David Leiva Mora
 * Examen 1 - I ciclo 2022.
 */

public class Test {

    public static void main(String[] args) {

        //  Paso 1
        // Se crean los datos de los pacientes se instancia la clase paciente y se pasa por parametro
        // el nombre, edad, temperatura, vomito (true/false) y Hospital en que consulto
        Paciente p1 = new Paciente("Dayana" , 25, 39, true,Hospital.Mexico); //GAM
        Paciente p2 = new Paciente("Esteban" , 25, 30, true,Hospital.Nicoya); // Nicoya
        Paciente p3 = new Paciente("Maria"   , 25, 30, false,Hospital.Mexico); //GAM
        Paciente p4 = new Paciente("Pedro", 61, 37, true,Hospital.Nicoya); // // Nicoya

        System.out.println("\nPaso 1 - Datos de un pacientes:");
        System.out.println("1-"+p1.toString());
        System.out.println("2-"+p2.toString());
        System.out.println("3-"+p3.toString());
        System.out.println("4-"+p4.toString());

        // Paso 2 y 3- Prueba del Covid

        System.out.println("\nPaso 2 y 3 - Resultado prueba rapida y prueba PCR:");
        PruebaCovid19 pr1 = new PruebaPCR(p1);
        PruebaCovid19 pr2 = new PruebaRapida(p1);

        System.out.println("Paciente 1 Nombre: "+pr1.getNombrePaciente()+" - Tipo de prueba PCR: " +pr1.isPositive());
        System.out.println("Paciente 1 Nombre: "+pr1.getNombrePaciente()+" - Tipo de prueba Rapida: " + pr2.isPositive());


        // Paso 4 - Enum con metodo que retorna el nombre y tipo de hospital
        System.out.println("\nPaso 4 - Enum con nombre y tipo de hospital: ");
        Hospital hp1 = Hospital.Mexico;
        System.out.println("Hospital "+hp1.getNombre()+" es de: "+hp1.getTipo());

        Hospital hp2 = Hospital.Nicoya;
        System.out.println("Hospital "+hp2.getNombre()+" es de: "+hp2.getTipo());

        // Paso 5 - Estructura tipo template, lista de objetos pacientes, reporte de resultados de covid
        System.out.println("\nPaso 5 - Reporte con lista y reportes de pacientes, resultado covid: ");
        // Metdiante la lista de pacientes se añaden los pacientes defindos al inicio
        ArrayList<Paciente> pacientes= new ArrayList<>();
        pacientes.add(p1);
        pacientes.add(p2);
        pacientes.add(p3);
        pacientes.add(p4);

        // Se muestra el reporte de los pacientes del Hospital Mexico
        HospitalMexico hm= new HospitalMexico(pacientes);
        System.out.println("Reporte Hospital Mexico:");
        System.out.print(hm.imprimirReporte());

        // Se muestra el reporte de los pacientes del Hospital Nicoya
        HospitalNicoya hn= new HospitalNicoya(pacientes);
        System.out.println("\nReporte Hospital de Nicoya:");
        System.out.print(hn.imprimirReporte());
        
    }

}
