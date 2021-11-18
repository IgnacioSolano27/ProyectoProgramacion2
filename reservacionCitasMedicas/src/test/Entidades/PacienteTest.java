package test.Entidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Entidades.Paciente;

public class PacienteTest {
@Test
  public void probarSetNombre (){  

  //Instancia de persona para crear la conexión
  Paciente paciente = new Paciente();

  //Defino el resultado esperado
  String esperado = "Federico"; 

  //Ejecuto acción del método
  paciente.setNombre("Federico");

  //Defino el resultado obtenido
  String obtenido = paciente.getNombre();
  
  //Comparo los resultados
  assertEquals(esperado, obtenido);
  
  }

  @Test
  public void probarSetApellidos (){

    Paciente paciente = new Paciente ();
    String esperado = "Campos";
    paciente.setApellidos("Campos");
    String obtenido = paciente.getApellidos();
    assertEquals(esperado, obtenido);

  }
  
  @Test
  public void probarSetID (){

    Paciente paciente = new Paciente ();
    int esperado = 304580158;
    paciente.setID(304580158);
    int obtenido = paciente.getID();
    assertEquals(esperado, obtenido);

  }

  @Test
  public void probarSetEdad (){
    
    Paciente paciente = new Paciente ();
    int esperado = 30;
    paciente.setEdad(30);
    int obtenido = paciente.getEdad();
    assertEquals (esperado, obtenido);

  }

  @Test
  public void probarSetGenero (){
   
    Paciente paciente = new Paciente ();
    String esperado = "Femenino";
    paciente.setGenero("Femenino");
    String obtenido = paciente.getGenero();
    assertEquals (esperado, obtenido);

  }

  @Test
  public void probarSetTelefono (){
   
    Paciente paciente = new Paciente ();
    int esperado = 22368756;
    paciente.setTelefono(22368756);
    int obtenido = paciente.getTelefono();
    assertEquals (esperado, obtenido);

  }

  @Test
  public void probarSetCorreo (){

    Paciente paciente = new Paciente ();
    String esperado = "user@gmail.com";
    paciente.setCorreo("user@gmail.com");
    String obtenido = paciente.getCorreo();
    assertEquals (esperado, obtenido);

  }
}
