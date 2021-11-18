package test.Entidades;

import Entidades.Persona;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonaTest {

  @Test
  public void probarSetNombre (){  

  //Instancia de persona para crear la conexión
  Persona persona = new Persona();

  //Defino el resultado esperado
  String esperado = "Ignacio"; 

  //Ejecuto acción del método
  persona.setNombre("Ignacio");

  //Defino el resultado obtenido
  String obtenido = persona.getNombre();
  
  //Comparo los resultados
  assertEquals(esperado, obtenido);
  
  }

  @Test
  public void probarSetApellidos (){

    Persona persona = new Persona();
    String esperado = "Lopez";
    persona.setApellidos("Lopez");
    String obtenido = persona.getApellidos();
    assertEquals(esperado, obtenido);
  }
  
  @Test
  public void probarSetID (){

     Persona persona = new Persona();
     int esperado = 203550896;
     persona.setID(203550896);
     int obtenido = persona.getID();
     assertEquals(esperado, obtenido);

  }

  @Test
  public void probarSetEdad (){
    
      Persona persona = new Persona();
      int esperado = 44;
      persona.setEdad(44);
      int obtenido = persona.getEdad();
      assertEquals (esperado, obtenido);

  }

  @Test
  public void probarSetGenero (){
   
    Persona persona = new Persona();
    String esperado = "Masculino";
    persona.setGenero("Masculino");
    String obtenido = persona.getGenero();
    assertEquals (esperado, obtenido);
  }

  @Test
  public void probarSetTelefono (){
   
    Persona persona = new Persona();
    int esperado = 88368756;
    persona.setTelefono(88368756);
    int obtenido = persona.getTelefono();
    assertEquals (esperado, obtenido);
  }

  @Test
  public void probarSetCorreo (){

    Persona persona = new Persona ();
    String esperado = "usuario@gmail.com";
    persona.setCorreo("usuario@gmail.com");
    String obtenido = persona.getCorreo();
    assertEquals (esperado, obtenido);
  }    
}
