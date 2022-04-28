package oms;
import paciente.Paciente;
import java.util.ArrayList;
import pruebas_covid.PruebaCovid19;
import pruebas_covid.PruebaPCR;
import pruebas_covid.PruebaRapida;

/**
 *
 * @author Néstor David Leiva Mora
 * Examen 1 - I ciclo 2022.
 */

public abstract class Oms { // clase abstracta 

    public ArrayList<PruebaCovid19> resultadoList;
    
    public ArrayList<Paciente> listaPaciente;
    
    public Oms(ArrayList<Paciente> listaPaciente){
        this.listaPaciente=listaPaciente;
        resultadoList= new ArrayList<>();
    }

    public abstract boolean isGamHospital();

    public abstract String getNombreHospital();
    
    public void diagnosticar(){        
        for (Paciente paciente : listaPaciente) {
            if(paciente.getHospital().getTipo().equalsIgnoreCase("GAM")){
                this.resultadoList.add(new PruebaPCR(paciente)); // polimorfismo
            }else{
                this.resultadoList.add(new PruebaRapida(paciente)); // polimorfismo
            }
        }        
    }
    
    public final String imprimirReporte(){
        this.diagnosticar();
        String reporte="";
        reporte += "\n--------------------  R E P O R T E --------------------\n"; 
        for (PruebaCovid19 pruebaCovid19 : resultadoList) {
            reporte += " Nombre del paciente : "+ pruebaCovid19.getNombrePaciente() +" \n";
            reporte += " Hospital            : "+ pruebaCovid19.getPaciente().getHospital() +"\n";
            reporte += " Estado              : "+ (pruebaCovid19.isPositive() ? "POSITIVO" : "NEGATIVO") +" \n";
            reporte += "--------------------------------------------------\n";
        }
        return reporte;
    }
    
}
