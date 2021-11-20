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
 
  // se crean los médicos de la clínica
 
  Medico Med1 = new Medico(nomb, ape, ced, ed, gen, tel, corr);
  Medico Med2 = new Medico(nomb, ape, ced, ed, gen, tel, corr);
  Medico Med3 = new Medico(nomb, ape, ced, ed, gen, tel, corr);
  Medico Med4 = new Medico(nomb, ape, ced, ed, gen, tel, corr);

  //creo un objeto paciente que sera la cita1

  Paciente cita1 = new Paciente(nomb, ape, ced, ed, gen, tel, corr);

  //creo un objeto de médico que me permitirá seleccionar uno específico

  Medico eleccion = new Medico(nomb, ape, ced, ed, gen, tel, corr);
    
  public void cargarDatos() {

   //Información de el primer médico

    Med1.setNombre("Alberto");
    Med1.setApellidos("López Herrera");
    Med1.setID(304220571);
    Med1.setEdad(48);
    Med1.setGenero("Masculino");
    Med1.setTelefono(88425628);
    Med1.setCorreo("alberto_lopez@med.com");
    Med1.setCodigoMedico(103);
    Med1.setEspecialidad("Odontólogo");
    
    //Información del segundo médico
    
    Med2.setNombre("Paula");
    Med2.setApellidos("Villareal García");
    Med2.setID(116227896);
    Med2.setEdad(37);
    Med2.setGenero("Femenino");
    Med2.setTelefono(83745536);
    Med2.setCorreo("paula_villareal@med.com");
    Med2.setCodigoMedico(104);
    Med2.setEspecialidad("Pediatra");
 
    //Información del tercer médico
 
    Med3.setNombre("Sharon");
    Med3.setApellidos("Porras Valverde");
    Med3.setID(403690784);
    Med3.setEdad(32);
    Med3.setGenero("Femenino");
    Med3.setTelefono(83745536);
    Med3.setCorreo("sharon_porras@med.com");
    Med3.setCodigoMedico(105);
    Med3.setEspecialidad("Médico General");
    
    //Información del cuatro médico
    
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

      nomb = JOptionPane.showInputDialog(null, "Ingrese el nombre del paciente:");
      ape = JOptionPane.showInputDialog(null, "Ingrese los apellidos del paciente:");
      ced = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del paciente:"));
      ed = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del paciente:"));
      gen = JOptionPane.showInputDialog(null, "Ingrese género del paciente del paciente:");
      tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el teléfono del paciente:"));
      corr = JOptionPane.showInputDialog(null, "Ingrese el correo electronico del paciente:");

      //se crea nuevo paciente

      Paciente nuevo = new Paciente(nomb, ape, ced, ed, gen, tel, corr); 

      nuevo.setNumeroCita(Integer.parseInt(JOptionPane.showInputDialog(null,
       "Ingrese un número de cita para asignar al paciente")));

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
    JOptionPane.showMessageDialog(null, "A continuación se muestran los especialistas de la clínica:\n"
                                       +"La clínica cuenta con los siguientes médicos:\n"
                                       +"-----------------------------------------------------------------------------\n"
                                       +"Dr."+Med1.getNombre()+" "+Med1.getApellidos()+"\n"
                                       +"Cédula: "+Med1.getID()+"\n"
                                       +""+Med1.getGenero()+"\n"
                                       +"En el área de: "+Med1.getEspecialidad()+"\n"
                                       +"Contacto: \n"
                                       +"Teléfono: "+Med1.getTelefono()+"\n"
                                       +"Correo: "+Med1.getCorreo()+"\n"
                                       +"-----------------------------------------------------------------------------\n"
                                       +"Dr."+Med2.getNombre()+" "+Med2.getApellidos()+"\n"
                                       +"Cédula: "+Med2.getID()+"\n"
                                       +""+Med2.getGenero()+"\n"
                                       +"En el área de: "+Med2.getEspecialidad()+"\n"
                                       +"Contacto: \n"
                                       +"Teléfono: "+Med2.getTelefono()+"\n"
                                       +"Correo: "+Med2.getCorreo()+"\n"
                                       +"-----------------------------------------------------------------------------\n"
                                       +"Dr."+Med3.getNombre()+" "+Med3.getApellidos()+"\n"
                                       +"Cédula: "+Med3.getID()+"\n"
                                       +""+Med3.getGenero()+"\n"
                                       +"En el área de: "+Med3.getEspecialidad()+"\n"
                                       +"Contacto: \n"
                                       +"Teléfono: "+Med3.getTelefono()+"\n"
                                       +"Correo: "+Med3.getCorreo()+"\n"
                                       +"-----------------------------------------------------------------------------\n"
                                       +"Dr."+Med4.getNombre()+" "+Med4.getApellidos()+"\n"
                                       +"Cédula: "+Med4.getID()+"\n"
                                       +""+Med4.getGenero()+"\n"
                                       +"En el área de: "+Med4.getEspecialidad()+"\n"
                                       +"Contacto: \n"
                                       +"Teléfono: "+Med4.getTelefono()+"\n"
                                       +"Correo: "+Med4.getCorreo()+"\n"
                                       +"-----------------------------------------------------------------------------\n"
                                        );
  }

  @Override
  public void consultarHorarios() {
    mensaje = "A continuación se muestran los horarios de la clínica:\n"
             +"La clínica cuenta con los siguientes horarios disponibles para las citas medicas:\n"
             +"-----------------------------------------------------------------------------\n"
            +"Días: \n"
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

    if (registrado == true){

      //seleccionar especialidad medica
      
      do{
        opcionMedico = Integer.parseInt(JOptionPane.showInputDialog(null,
                             "1. Odontología\n"
                            +"2. Pediatría\n"
                            +"3. Médico General\n"
                            +"4. Médico Internista\n"
                            +"Elige el departamento de tu cita:\n",
                             "Especialidades", 3));

        switch(opcionMedico){
          case 1: 
            eleccion = Med1;
            JOptionPane.showMessageDialog(null,"Has elegido al médico "+eleccion.getNombre()+ " "+eleccion.getApellidos()+", "
                                              +"de la especialidad "+eleccion.getEspecialidad()+".");
            break;
          case 2: 
            eleccion = Med2;
            JOptionPane.showMessageDialog(null,"Has elegido al médico "+eleccion.getNombre()+ " "+eleccion.getApellidos()+", "
                                              +"de la especialidad "+eleccion.getEspecialidad()+".");
            break;
          case 3: 
            eleccion = Med3;
            JOptionPane.showMessageDialog(null,"Has elegido al médico "+eleccion.getNombre()+ " "+eleccion.getApellidos()+", "
                                              +"de la especialidad "+eleccion.getEspecialidad()+".");
            break;
          case 4:
            eleccion = Med4;
            JOptionPane.showMessageDialog(null,"Has elegido al médico "+eleccion.getNombre()+ " "+eleccion.getApellidos()+", "
                                              +"de la especialidad "+eleccion.getEspecialidad()+".");
            break;
          default: 
            JOptionPane.showMessageDialog(null, "La opción no está en el menú, reintente.", 
                                                "Error al elegir la especialidad",3);
        }
      }while(opcionMedico != 1 & opcionMedico != 2 & opcionMedico != 3 & opcionMedico != 4);

      //Selección de dias

      do{
        opcionDias = Integer.parseInt(JOptionPane.showInputDialog(null,
                             "1. Miércoles\n"
                            +"2. Viernes\n"
                            +"3. Sábado\n"
                            +"Elige el dia que deseas agendar tu cita:\n",
                             "Dias disponibles", 3));

        switch(opcionDias){
          case 1: 
            diasDisponibles = "Miércoles";
            break;
          case 2: 
            diasDisponibles = "Viernes";
            break;
          case 3: 
            diasDisponibles = "Sábado";
            break;
          default: 
            JOptionPane.showMessageDialog(null,
             "La opción no está en el menú, reintente.", 
             "Error al elegir el día",3);
        }
      }while(opcionDias != 1 & opcionDias != 2 & opcionDias != 3);

      //Selección de horarios

      do{
        opcionHorario = Integer.parseInt(JOptionPane.showInputDialog(null,
                             "1. 8:00 am a 9:00 am\n"
                            +"2. 10:00 am a 11:00 am\n"
                            +"3. 11:00 am a 12:00 md\n"
                            +"4. 2:00 pm a 3:00 pm\n"
                            +"5. 4:00 pm a 5:00 pm\n"
                            +"Elige el día que deseas agendar tu cita:\n",
                             "Horario disponible", 3));

        switch(opcionHorario){
          case 1: 
            horasDisponibles = "8:00 am a 9:00 am";
            break;
          case 2: 
            horasDisponibles = "10:00 am a 11:00 am";
            break;
          case 3: 
            horasDisponibles = "11:00 am a 12:00 md";
            break;
          case 4:
            horasDisponibles = "2:00 pm a 3:00 pm";
            break;
          case 5:
            horasDisponibles = "4:00 pm a 5:00 pm";
            break;
          default: 
            JOptionPane.showMessageDialog(null,
             "La opción no está en el menú, reintente.",
             "Error en la elección! ", 3);
        }
      }while(opcionHorario != 1 & opcionHorario != 2 & opcionHorario != 3 & opcionHorario != 4 & opcionHorario != 5);

      //Se muestra la cita creada

      JOptionPane.showMessageDialog(null,
                   "--CITA CREADA--\n"
                  +"El paciente "+cita1.getNombre()+ " "+cita1.getApellidos()+"\n"
                  +"con cédula: "+cita1.getID()+"\n"
                  +"Ha reservado una cita con el médico: "+eleccion.getNombre()+" "+eleccion.getApellidos()+"\n"
                  +"El día : "+diasDisponibles+ " en el horario de "+horasDisponibles+ ". \n"
                  +"\n"
                  +"Código del médico = "+eleccion.getCodigoMedico()+"\n"
                  +"\n"
                  +"El número de su cita es: "+cita1.getNumeroCita(),"Cita creada", 3);

      reservado = true;

    }else{
      JOptionPane.showMessageDialog(null,
                   "El paciente debe registrarse antes de este proceso",
                   "Paciente no encontrado", 3);
    }       
  }

  @Override 
  public void ver() {
    if(cancelar == true){
      JOptionPane.showMessageDialog(null,
                   "La cita fue cancelada, por favor reinicia el proceso.",
                   "No hay una cita registrada",3);
    }else{
      if(reservado == true){
        JOptionPane.showMessageDialog(null, "Datos del paciente: \n"
                                       +"-------------------------------------------------------------------------\n"
                                       +"Nombre del paciente: "+cita1.getNombre()+" "+cita1.getApellidos()+"\n"
                                       +"Cédula : "+cita1.getID()+"\n"
                                       +"Edad :"+cita1.getEdad()+"\n"
                                       +"Género :"+cita1.getGenero()+"\n"
                                       +"Correo electrónico :"+cita1.getCorreo()+"\n"
                                       +"Teléfono :"+cita1.getTelefono()+"\n"
                                       +"-------------------------------------------------------------------------\n"
                                       +"Información de la cita médica programada\n"
                                       +"Número de identificación asignado a la cita: "+cita1.getNumeroCita()+"\n"
                                       +"Área médica a la que asiste: "+eleccion.getEspecialidad()+"\n"
                                       +"Médico que atiende: "+eleccion.getNombre()+" "+eleccion.getApellidos()+"\n"
                                       +"Código médico: "+eleccion.getCodigoMedico()+ "\n"
                                       +"Día y hora: El día "+diasDisponibles+ " en el horario de "+horasDisponibles+"\n"
                                       +"-------------------------------------------------------------------------");
                                  
      }else{

        JOptionPane.showMessageDialog(null, "Aún no se ha reservado la cita.", "No existe una cita creada", 3);
      }
    }
        
  }

  @Override
  public void cancelar() {

    //Se reinician los datos de usuario
    if(registrado == true){
      
      cita1.setNombre(null);
      cita1.setApellidos(null);
      cita1.setID(0);
      cita1.setEdad(0);
      cita1.setGenero(null); 
      cita1.setTelefono(0);
      cita1.setCorreo(null);

      nomb = null;
      
      //Cancelar pasa a ser true 
      cancelar = true;
      //Registrado pasa a ser false y limita el acceso
      registrado = false;
      //reservado pasa a ser false y limita acceso
      reservado = false;

      JOptionPane.showMessageDialog(null, "La cita actual se ha cancelado", "Cancelar cita", 3);
    }else{
      JOptionPane.showMessageDialog(null, "No se ha creado ninguna cita aun", " Nada que cancelar", 3);
    }
  }

}