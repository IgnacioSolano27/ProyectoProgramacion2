package Entidades;
public class Paciente extends Persona{

  private int numeroCita;

  public int getNumeroCita() {return numeroCita;}
  public void setNumeroCita(int numeroCita) {this.numeroCita = numeroCita;}

  public Paciente(String nomb, String ape, int ced, int ed, String gen, int tel, String corr) {

    setNombre(nomb);
    setApellidos(ape);
    setID(ced);
    setEdad(ed);
    setGenero(gen);
    setTelefono(tel);
    setCorreo(corr);
    siguiente = this;
  }
  
  public Paciente() {

  }  
}