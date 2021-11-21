import javax.swing.JOptionPane;

import Entidades.Cita;

public class App extends Cita {

  public static int opcion = 0;
  public static void main(String[] args) throws Exception {

    Cita cita = new Cita();

    cita.cargarDatos(); //Metodo para cargar datos a los medicos al iniciar el sistema 

    do{

      opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
          "1. Registrar nuevo paciente\n"
         +"2. Consultar la disponibilidad de horarios y especialidades\n"
         +"3. Reservar una cita\n"
         +"4. Mostrar informacion de la cita creada\n"
         +"5. Cancelar cita\n"
         +"6. Salir\n "
         +"Seleccione la opción que desea realizar:", "Menú de opciones ", 3 ));

      switch(opcion){
        case 1:
          cita.registrar();
          break;
        case 2:
          cita.consultarMedicos();
          cita.consultarHorarios();
          break;
        case 3:
          cita.reservar();
          break;
        case 4:
          cita.ver();
          break;
        case 5:
          cita.cancelar();
          break;
        case 6: 
          System.exit(0);
          JOptionPane.showMessageDialog(null, "Sistema finalizado.");
          break;
      }
    }while(opcion != 6);
  }
}