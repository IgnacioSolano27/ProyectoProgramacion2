package Entidades;

//importar interfaces
import Interfaces.Cancelable;
import Interfaces.Consultable;
import Interfaces.Ingresable;
import Interfaces.Reservable;
import Interfaces.Visible;

public class Cita extends Medico implements Ingresable, Consultable, Reservable, Visible, Cancelable{

  public Cita(){}
   
  //variables de uso local
   
  public int opcionDias = 0, opcionHorario = 0, opcionMedico = 0;
  public String diasDisponibles = null;
  public String horasDisponibles = null;
  public String nomb = null , ape = null, gen = null, corr = null;
  public int ced = 0, ed = 0, tel = 0;
  public String mensaje = null;
  public boolean registrado = false;
  public boolean cancelar = false;
  public boolean reservado = false;
 
  // se crean los medicos de la clinica
 
  Medico Med1 = new Medico(nomb, ape, ced, ed, gen, tel, corr);
  Medico Med2 = new Medico(nomb, ape, ced, ed, gen, tel, corr);
  Medico Med3 = new Medico(nomb, ape, ced, ed, gen, tel, corr);
  Medico Med4 = new Medico(nomb, ape, ced, ed, gen, tel, corr);

  //creo un objeto paciente que sera la cita1

  Paciente cita1 = new Paciente(nomb, ape, ced, ed, gen, tel, corr);

  //creo un objeto de medico que me permitirá seleccionar uno especifico

  Medico eleccion = new Medico(nomb, ape, ced, ed, gen, tel, corr);
    
  public void cargarDatos() {

   //Información de el primer médico

    Med1.setNombre("Alberto");
    Med1.setApellidos("Lopez Herrera");
    Med1.setID(304220571);
    Med1.setEdad(48);
    Med1.setGenero("Masculino");
    Med1.setTelefono(88425628);
    Med1.setCorreo("alberto_lopez@med.com");
    Med1.setCodigoMedico(103);
    Med1.setEspecialidad("Odontólogo");
    
    //Informacion del segundo medico
    
    Med2.setNombre("Paula");
    Med2.setApellidos("Villareal García");
    Med2.setID(116227896);
    Med2.setEdad(37);
    Med2.setGenero("Femenino");
    Med2.setTelefono(83745536);
    Med2.setCorreo("paula_villareal@med.com");
    Med2.setCodigoMedico(104);
    Med2.setEspecialidad("Pediatra");
 
    //Informacion del tercer medico
 
    Med3.setNombre("Sharon");
    Med3.setApellidos("Porras Valverde");
    Med3.setID(403690784);
    Med3.setEdad(32);
    Med3.setGenero("Femenino");
    Med3.setTelefono(83745536);
    Med3.setCorreo("sharon_porras@med.com");
    Med3.setCodigoMedico(105);
    Med3.setEspecialidad("Médico General");
    
    //Informacion del cuatro medico
    
    Med4.setNombre("Federico");
    Med4.setApellidos("Ramírez Saenz");
    Med4.setID(1089390433);
    Med4.setEdad(44);
    Med4.setGenero("Masculino");
    Med4.setTelefono(83745536);
    Med4.setCorreo("federico_ramirez@med.com");
    Med4.setCodigoMedico(106);
    Med4.setEspecialidad("Médico Internista");

  }

  @Override
  public void registrar() {    
    // TODO Auto-generated method stub
  }

  @Override
  public void consultarMedicos() {
    // TODO Auto-generated method stub
        
  }

  @Override
  public void consultarHorarios() {
   // TODO Auto-generated method stub
        
  }

  @Override
  public void reservar() {
  // TODO Auto-generated method stub
        
  }

  @Override 
  public void ver() {
   // TODO Auto-generated method stub
        
  }

  @Override
  public void cancelar() {
  // TODO Auto-generated method stub
        
  }

}