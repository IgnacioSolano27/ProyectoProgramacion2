package Entidades;

public class Persona {

  public Persona siguiente;
  private String nombre;
  private String apellidos;
  private int ID;
  private int edad;
  private String genero;
  private int telefono;
  private String correo;

  //metodos getter & setters
  public String getNombre() {return nombre;}
  public void setNombre(String nombre) {this.nombre = nombre;}
  public String getApellidos() {return apellidos;}
  public void setApellidos(String apellido) {this.apellidos = apellido;}
  public int getID() {return ID;}
  public void setID(int ID) {this.ID = ID;}
  public int getEdad() {return edad;}
  public void setEdad(int edad) {this.edad = edad;}
  public String getGenero() {return genero;}
  public void setGenero(String genero) {this.genero = genero;}
  public int getTelefono() {return telefono;}
  public void setTelefono(int telefono) {this.telefono = telefono;}
  public String getCorreo() {return correo;}
  public void setCorreo(String correo) {this.correo = correo;}
  
}
