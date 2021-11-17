package Entidades;

import javax.swing.JOptionPane;

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
    if(nomb == null){

      nomb = JOptionPane.showInputDialog(null, "Ingrese el nombre del paciente");
      ape = JOptionPane.showInputDialog(null, "Ingrese los apellidos del paciente");
      ced = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del paciente"));
      ed = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del paciente"));
      gen = JOptionPane.showInputDialog(null, "Ingrese genero del paciente del paciente");
      tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el telefono del paciente"));
      corr = JOptionPane.showInputDialog(null, "Ingrese el correo electronico del paciente");

      //se crea nuevo paciente
      Paciente nuevo = new Paciente(nomb, ape, ced, ed, gen, tel, corr); 

      nuevo.setNumeroCita(Integer.parseInt(JOptionPane.showInputDialog(null,
       "Ingrese un numero de cita para asignar al paciente")));

      if (nomb != null){
        registrado = true;
      }
      JOptionPane.showMessageDialog(null, "Se ha registrado el nuevo paciente " +nuevo.getNombre()+ " " +nuevo.getApellidos());

      cita1 = nuevo;

      //En caso de que la cita anterior fue cancelada
      cancelar = false;
    
    }else{
      JOptionPane.showMessageDialog(null,
                    "Actualmente ya hay un usuario en trámite, por favor cancele la cita actual antes de ingresar otra.",
                    "Ya hay un paciente", 3);
    }
  }

  @Override
  public void consultarMedicos() {
    JOptionPane.showMessageDialog(null, "A continuacion se muestran los especialistas de la clínica:\n"
                                       +"La clínica cuenta con los siguientes médicos:\n"
                                       +"-----------------------------------------------------------------------------\n"
                                       +"Dr."+Med1.getNombre()+" "+Med1.getApellidos()+"\n"
                                       +"Cédula: "+Med1.getID()+"\n"
                                       +""+Med1.getGenero()+"\n"
                                       +"En el area de: "+Med1.getEspecialidad()+"\n"
                                       +"Contacto: \n"
                                       +"Teléfono: "+Med1.getTelefono()+"\n"
                                       +"Correo: "+Med1.getCorreo()+"\n"
                                       +"-----------------------------------------------------------------------------\n"
                                       +"Dr."+Med2.getNombre()+" "+Med2.getApellidos()+"\n"
                                       +"Cédula: "+Med2.getID()+"\n"
                                       +""+Med2.getGenero()+"\n"
                                       +"En el area de: "+Med2.getEspecialidad()+"\n"
                                       +"Contacto: \n"
                                       +"Teléfono: "+Med2.getTelefono()+"\n"
                                       +"Correo: "+Med2.getCorreo()+"\n"
                                       +"-----------------------------------------------------------------------------\n"
                                       +"Dr."+Med3.getNombre()+" "+Med3.getApellidos()+"\n"
                                       +"Cédula: "+Med3.getID()+"\n"
                                       +""+Med3.getGenero()+"\n"
                                       +"En el area de: "+Med3.getEspecialidad()+"\n"
                                       +"Contacto: \n"
                                       +"Teléfono: "+Med3.getTelefono()+"\n"
                                       +"Correo: "+Med3.getCorreo()+"\n"
                                       +"-----------------------------------------------------------------------------\n"
                                       +"Dr."+Med4.getNombre()+" "+Med4.getApellidos()+"\n"
                                       +"Cédula: "+Med4.getID()+"\n"
                                       +""+Med4.getGenero()+"\n"
                                       +"En el area de: "+Med4.getEspecialidad()+"\n"
                                       +"Contacto: \n"
                                       +"Teléfono: "+Med4.getTelefono()+"\n"
                                       +"Correo: "+Med4.getCorreo()+"\n"
                                       +"-----------------------------------------------------------------------------\n"
                                        );
  }

  @Override
  public void consultarHorarios() {
    mensaje = "A continuacion se muestran los horarios de la clínica:\n"
             +"La clínica cuenta con los siguientes horarios disponibles para las citas medicas:\n"
             +"-----------------------------------------------------------------------------\n"
            +"Dias: \n"
            +"Miércoles\n"
            +"Viernes\n"
            +"Sábado\n"
            +"-----------------------------------------------------------------------------\n"
            +"Horarios diurnos: \n"
            +"De 8:00 am a 9:00 am\n"
            +"De 10:00 am a 11:00 am\n"
            +"De 11:00 am a 12:00 md\n"
            +"-----------------------------------------------------------------------------\n"
            +"Horarios taciturnos\n"
            +"De 2:00 pm a 3:00 pm\n"
            +"De 4:00 pm a 5:00 pm\n"
            +"-----------------------------------------------------------------------------\n"
    ;
    JOptionPane.showMessageDialog(null, mensaje);
           
  }

  @Override
  public void reservar() {
    System.out.println("");        
  }

  @Override 
  public void ver() {
    System.out.println("");
        
  }

  @Override
  public void cancelar() {
   System.out.println("");
        
  }

}