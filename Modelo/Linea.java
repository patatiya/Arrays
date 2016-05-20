package Modelo;

import java.util.ArrayList;

/**
 * Created by Lorena on 17/05/2016.
 */
public class Linea{
  //Atributos
  private int numLinea;
  private ArrayList<Parada> paradas;

  //Constructor
  public void Linea(int numLinea){
    this.numLinea = numLinea;
    paradas = new ArrayList<>();
  }
}
