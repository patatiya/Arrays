package Modelo;

import java.util.ArrayList;

/**
 * Created by Lorena on 17/05/2016.
 */
public class Bus {


  //Atributos de Bus
  private String matricula;
  private int numPlazas;

  //Resultado de la normalización
  private Linea linea;
  private ArrayList<Turno> turnos;


  //Metodos
  //Constructor
  public Bus(String matricula, int numPlazas, Linea linea)throws Exception{
    if(matricula == null || linea == null || numPlazas < 0){
      throw new Exception();
    }
    this.matricula = matricula;
    this.numPlazas= numPlazas;
    this.linea = linea;

    turnos = new ArrayList<>();
  }

  public void addTurno(Turno turno)throws Exception{
    if(turno == null){
      throw new Exception();
    }
    turnos.add(turno);
  }

  @Override
  public String toString() {
    return "Bus{" +
        "matricula='" + matricula + '\'' +
        ", numPlazas=" + numPlazas +
        '}';
  }
}
