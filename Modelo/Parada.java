package Modelo;

import java.util.ArrayList;

/**
 * Created by Lorena on 17/05/2016.
 */
public class Parada{
  //Atributos
  private String nom;
  private ArrayList<Linea> linias;

  //Constructor
  public void Parada(String nom){
    this.nom = nom;
    linias = new ArrayList<>();
  }
}
