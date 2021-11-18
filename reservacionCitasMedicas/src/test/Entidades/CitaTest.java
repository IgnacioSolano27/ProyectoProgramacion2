package test.Entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Entidades.Cita;
import Entidades.Medico;

public class CitaTest {

  @Test
  public void probarCargarDatos(){
  
    Medico medPrueba = new Medico();

    medPrueba.setNombre("Alberto");
    String nombreObtenido = medPrueba.getNombre();
    String nombreEsperado = "Alberto";
    assertEquals(nombreObtenido, nombreEsperado);

    medPrueba.setApellidos("Lopez Herrera");
    String apellidoObtenido = medPrueba.getApellidos();
    String apellidoEsperado = "Lopez Herrera";
    assertEquals(apellidoObtenido, apellidoEsperado);

    medPrueba.setID(304220571);
    int IDObtenido = medPrueba.getID();
    int IDEsperado = 304220571;
    assertEquals(IDObtenido, IDEsperado);

    medPrueba.setEdad(48);
    int edadObtenido = medPrueba.getEdad();
    int edadEsperada = 48;
    assertEquals(edadObtenido, edadEsperada);

    medPrueba.setGenero("Masculino");
    String generoObtenido = medPrueba.getGenero();
    String generoEsperado = "Masculino";
    assertEquals(generoObtenido, generoEsperado);

    medPrueba.setTelefono(88425628);
    int telefonoObtenido = medPrueba.getTelefono();
    int telefonoEsperado = 88425628;
    assertEquals(telefonoObtenido, telefonoEsperado);

    medPrueba.setCorreo("alberto_lopez@med.com");
    String correoObtenido = medPrueba.getCorreo();
    String correoEsperado = "alberto_lopez@med.com";
    assertEquals(correoObtenido, correoEsperado);

    medPrueba.setCodigoMedico(103);
    int codigoMedicoObtenido = medPrueba.getCodigoMedico();
    int codigoMedicoEsperado = 103;
    assertEquals(codigoMedicoObtenido, codigoMedicoEsperado);

    medPrueba.setEspecialidad("Odontólogo");
    String especialidadObtenida = medPrueba.getEspecialidad();
    String especialidadEsperada = "Odontólogo";
    assertEquals(especialidadObtenida, especialidadEsperada);
  }

  @Test
  public void probarRegistrar(){

    Cita cita = new Cita();

    cita.nomb = "Alex";
    String nombreObtenido = cita.nomb;
    String nombreEsperado = "Alex";
    assertEquals(nombreObtenido, nombreEsperado);

    cita.ape = "Solano";
    String apellidoObtenido = cita.ape;
    String apellidoEsperado = "Solano";
    assertEquals(apellidoObtenido, apellidoEsperado);

    cita.ced = 123;
    int cedulaObtenido = cita.ced;
    int cedulaEsperada = 123;
    assertEquals(cedulaObtenido, cedulaEsperada);

    cita.ed = 20;
    int edadObtenido = cita.ed;
    int edadEsperada = 20;
    assertEquals(edadObtenido, edadEsperada);

    cita.gen = "Masculino";
    String generoObtenido = cita.gen;
    String generoEsperado = "Masculino";
    assertEquals(generoObtenido, generoEsperado);

    cita.tel = 84848484;
    int telefonoObtenido = cita.tel;
    int telefonoEsperado = 84848484;
    assertEquals(telefonoObtenido, telefonoEsperado);

    cita.corr = "Alex@mail.com";
    String correoObtenido = cita.corr;
    String correoEsperado = "Alex@mail.com";
    assertEquals(correoObtenido, correoEsperado);
  }

}
