package test.Entidades;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Entidades.Cita;
import Entidades.Medico;
import Entidades.Paciente;

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

  @Test
  public void probarConsultarMedicos(){
    
    Medico medPrueba = new Medico();

    medPrueba.setNombre("Sharon");
    String nombreObtenido = medPrueba.getNombre();
    String nombreEsperado = "Sharon";
    assertEquals(nombreEsperado, nombreObtenido);

    medPrueba.setApellidos("Porras Valverde");
    String apellidoObtenido = medPrueba.getApellidos();
    String apellidoEsperado = "Porras Valverde";
    assertEquals(apellidoEsperado, apellidoObtenido);

    medPrueba.setGenero("Femenino");
    String generoObtenido = medPrueba.getGenero();
    String generoEsperado = "Femenino";
    assertEquals(generoEsperado, generoObtenido);

    medPrueba.setEspecialidad("Médico General");
    String especialidadObtenida = medPrueba.getEspecialidad();
    String especialidadEsperada = "Médico General";
    assertEquals(especialidadEsperada, especialidadObtenida);

    medPrueba.setTelefono(83745536);
    int telefonoObtenido = medPrueba.getTelefono();
    int telefonoEsperado = 83745536;
    assertEquals(telefonoEsperado, telefonoObtenido);

    medPrueba.setCorreo("sharon_porras@med.com");
    String correoObtenido = medPrueba.getCorreo();
    String correoEsperado = "sharon_porras@med.com";
    assertEquals(correoEsperado, correoObtenido);
  }

  @Test
  public void probarConsultarHorarios(){

    //Consultar horarios muestra un mensaje tipo texto con los horarios 
    Cita cita = new Cita();
    
    cita.mensaje = "En este mensaje se muestra en el metodo original un texto que especifica horarios";

    String mensajeEsperado = "En este mensaje se muestra en el metodo original un texto que especifica horarios";
    String mensajeObtenido = cita.mensaje;

    assertEquals(mensajeEsperado, mensajeObtenido);
    
  }

  @Test
  public void probarReservar(){

    //involucra estos datos de un paciente para crear la cita

    Paciente cita1 = new Paciente();

    cita1.setNombre("Alex");
    String nombreObtenido = cita1.getNombre();
    String nombreEsperado = "Alex";
    assertEquals(nombreEsperado, nombreObtenido);

    cita1.setApellidos("Solano");
    String apellidoObtenido = cita1.getApellidos();
    String apellidoEsperado = "Solano";
    assertEquals(apellidoEsperado, apellidoObtenido);

    cita1.setID(123);
    int IDObtenido = cita1.getID();
    int IDEsperado = 123;
    assertEquals(IDEsperado, IDObtenido);

    cita1.setNumeroCita(01);
    int numeroCitaObtenido = cita1.getNumeroCita();
    int numeroCitaEsperado = 01;
    assertEquals(numeroCitaEsperado, numeroCitaObtenido); 
    
    //involucra estos datos de medico para crear la cita

    Medico eleccion = new Medico();

    eleccion.setNombre("Paula ");
    String nombreObtenidoMed = eleccion.getNombre();
    String nombreEsperadoMed = "Paula ";
    assertEquals(nombreEsperadoMed, nombreObtenidoMed);


    eleccion.setApellidos("Villareal Garcia");
    String apellidoObtenidoMed = eleccion.getApellidos();
    String apellidoEsperadoMed = "Villareal Garcia";
    assertEquals(apellidoEsperadoMed, apellidoObtenidoMed);

    eleccion.setCodigoMedico(104);
    int codigoMedicoObtenido = eleccion.getCodigoMedico();
    int codigoMedicoEsperado = 104;
    assertEquals(codigoMedicoEsperado, codigoMedicoObtenido);

    //involucra estos datos de cita para crear la cita

    Cita cita = new Cita();

    cita.diasDisponibles = "Martes";
    String diasDisponiblesObtenido = cita.diasDisponibles;
    String diasDisponiblesEsperado = "Martes";
    assertEquals(diasDisponiblesEsperado, diasDisponiblesObtenido);

    cita.horasDisponibles = "2:00 pm a 3:00 pm";
    String horasDisponiblesObtenido = cita.horasDisponibles;
    String horasDisponiblesEsperado = "2:00 pm a 3:00 pm";
    assertEquals(horasDisponiblesEsperado, horasDisponiblesObtenido);   

  } 

  @Test
  public void probarVer(){

    Paciente pacientePrueba = new Paciente();

    pacientePrueba.setNombre("Sofía");
    String nombreObtenido = pacientePrueba.getNombre();
    String nombreEsperado = "Sofía";
    assertEquals(nombreObtenido, nombreEsperado);

    pacientePrueba.setApellidos("Lopez Estrada");
    String apellidoObtenido = pacientePrueba.getApellidos();
    String apellidoEsperado = "Lopez Estrada";
    assertEquals(apellidoObtenido, apellidoEsperado);
    
    pacientePrueba.setID(123);
    int IDObtenido = pacientePrueba.getID();
    int IDEsperado = 123;
    assertEquals(IDObtenido, IDEsperado);

    pacientePrueba.setEdad(24);
    int edadObtenido = pacientePrueba.getEdad();
    int edadEsperada = 24;
    assertEquals(edadObtenido, edadEsperada);

    pacientePrueba.setGenero("Femenino");
    String generoObtenido = pacientePrueba.getGenero();
    String generoEsperado = "Femenino";
    assertEquals(generoObtenido, generoEsperado);

    pacientePrueba.setCorreo("sofia@gmail.com");
    String correoObtenido = pacientePrueba.getCorreo();
    String correoEsperado = "sofia@gmail.com";
    assertEquals(correoObtenido, correoEsperado);

    pacientePrueba.setTelefono(84845264);
    int telefonoObtenido = pacientePrueba.getTelefono();
    int telefonoEsperado = 84845264;
    assertEquals(telefonoObtenido, telefonoEsperado);

    pacientePrueba.setNumeroCita(01);
    int numeroCitaObtenido = pacientePrueba.getNumeroCita();
    int numeroCitaEsperado = 01;
    assertEquals(numeroCitaObtenido, numeroCitaEsperado);

    Medico eleccion = new Medico();

    eleccion.setEspecialidad("Médico Internista");
    String especialidadObtenida = eleccion.getEspecialidad();
    String especialidadEsperada = "Médico Internista";
    assertEquals(especialidadObtenida, especialidadEsperada);

    eleccion.setNombre("Federico");
    String nombreMedObtenido = eleccion.getNombre();
    String nombreMedEsperado = "Federico";
    assertEquals(nombreMedObtenido, nombreMedEsperado);

    eleccion.setApellidos("Ramírez Saenz");
    String apellidoMedObtenido = eleccion.getApellidos();
    String apellidoMedEsperado = "Ramírez Saenz";
    assertEquals(apellidoMedObtenido, apellidoMedEsperado);

    eleccion.setCodigoMedico(106);
    int codigoMedicoObtenido = eleccion.getCodigoMedico();
    int codigoMedicoEsperado = 106;
    assertEquals(codigoMedicoObtenido, codigoMedicoEsperado);

    Cita citaPrueba = new Cita();

    citaPrueba.diasDisponibles = "Viernes";
    String diasDisponibleObtenido = citaPrueba.diasDisponibles; 
    String diasDisponiblesEsperado = "Viernes";
    assertEquals(diasDisponibleObtenido, diasDisponiblesEsperado);
    
    citaPrueba.horasDisponibles = "De 4:00 pm a 5:00 pm";
    String horasDisponiblesObtenido = citaPrueba.horasDisponibles;
    String horasDisponiblesEsperado = "De 4:00 pm a 5:00 pm";
    assertEquals(horasDisponiblesObtenido, horasDisponiblesEsperado);

  }

  @Test
  public void probarCancelar(){

    Paciente paciente1 = new Paciente ();

    paciente1.setNombre (null);
    assertNull(paciente1.getNombre());
   
    paciente1.setApellidos (null);
    assertNull (paciente1.getApellidos());
  
    paciente1.setID (0);
    int esperado = 0;
    int obtenido = paciente1.getID();
    assertEquals(esperado, obtenido);
  
    paciente1.setGenero (null);
    assertNull (paciente1.getGenero());
  
    paciente1.setNumeroCita (0);
    int Esperado = 0;
    int Obtenido = paciente1.getNumeroCita();
    assertEquals(Obtenido, Esperado);
  
    paciente1.setCorreo (null);
    assertNull (paciente1.getCorreo()); 
  
    Cita cita = new Cita ();
  
    cita.cancelar = true;
    assertTrue(cita.cancelar);
  
    cita.registrado = false;
    assertFalse(cita.registrado);
  
    cita.reservado = false;
    assertFalse(cita.reservado);

  }

}
