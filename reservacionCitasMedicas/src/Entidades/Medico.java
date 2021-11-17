package Entidades;
public class Medico extends Persona {

  private String Especialidad;
  private int CodigoMedico;

  //Métodos getters & setters

  public int getCodigoMedico(){return CodigoMedico;}
  public String getEspecialidad(){return Especialidad;}
  public void setEspecialidad(String especialidad){this.Especialidad = especialidad;}
  public void setCodigoMedico(int codigoMedico){this.CodigoMedico = codigoMedico;}

  //Constructor para médico, heredado de persona
  public Medico(){} 

  public Medico(String nomb, String ape, int ced, int ed, String gen, int tel, String corr){

    setNombre(nomb);
    setApellidos(ape);
    setID(ced);
    setEdad(ed);
    setGenero(gen);
    setTelefono(tel);
    setCorreo(corr);
    siguiente = this;

  }
}
