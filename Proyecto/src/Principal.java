/*
Nombres:
Alison Jara
Barbara Leiva
Naomie Contreras
*/


import java.text.ParseException;
import java.util.Scanner;

public class Principal {

    public static Pacientes pacientes = new Pacientes();
    public static Profesionales profesionales = new Profesionales();
    public static Reserva reservas = new Reserva();
    
    public static void main(String[] args) throws ParseException {
        Scanner Entrada;
        int opcion;
        do {
            System.out.println("____________________________");
            System.out.println("Ingrese una opcion");
            System.out.println("____________________________");
            System.out.println("1- Registrar paciente");
            System.out.println("2- Mostrar listado de pacientes");
            System.out.println("3- Mostrar listado especialidades");
            System.out.println("4- Mostrar listado de profesionales");
            System.out.println("5- Reserva hora");
            System.out.println("6- Modificar Paciente");
            System.out.println("7- Eliminar Paciente ");
            System.out.println("8- Salir");
    //        System.out.println("9- Cambiar Hora");
            System.out.println("____________________________");

            Entrada = new Scanner(System.in);
            opcion = Entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    pacientes.AgregarPaciente();
                    break;

                case 2:
                    pacientes.mostrarPacientes();
                    break;

                case 3:
                    profesionales.mostrar();
                    break;

                case 4:
                    profesionales.DatosProfesionales();
                    profesionales.mostrarProfesionales();
                    break;

                case 5:
                   reservas.InsertarDatos(pacientes);
                   reservas.ImprimirDatos();
                    break;
                    
                case 6:
                    pacientes.ModificarPaciente(pacientes);
                    break;
                    
                case 7:
                   pacientes.EliminarPaciente(pacientes);
/*                    
                case 8:;
                pacientes.cambiarHora()
                    break; 
 */           
            }

        } while (opcion != 8);
    }

}
