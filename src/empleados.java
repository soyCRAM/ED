import java.util.Scanner;

public class empleados {

	public static void main(String[] args) {
		
		// VARIABLES.
		
		
		// Insercion manual de empleados.
		emple em1 = new emple(01,"Agustin","Serafin","Villa Plana",123456789);
		emple em2 = new emple(02,"Ramon","Escozon","Barsobia",123123123);
		emple em3 = new emple(03,"Siliana","Del Pilar","Carnivas",121212121);
		
		// Impresion de empleados.
		
			System.out.println("Empleado 1:");
			System.out.println("ID: "+em1.getID());
			System.out.println("Nombre: "+em1.getNombre());
			System.out.println("Apellido: "+em1.getApp());
			System.out.println("Direccion: "+em1.getDireccion());
			System.out.println("Tlf: "+em1.getTlf());
		
			System.out.println("Empleado 2:");
			System.out.println("ID: "+em2.getID());
			System.out.println("Nombre: "+em2.getNombre());
			System.out.println("Apellido: "+em2.getApp());
			System.out.println("Direccion: "+em2.getDireccion());
			System.out.println("Tlf: "+em2.getTlf());
			
			System.out.println("Empleado 3:");
			System.out.println("ID: "+em3.getID());
			System.out.println("Nombre: "+em3.getNombre());
			System.out.println("Apellido: "+em3.getApp());
			System.out.println("Direccion: "+em3.getDireccion());
			System.out.println("Tlf: "+em3.getTlf());
			
		// INICIO DE PROGRAMA.
		/*
		System.out.println("Bienvenido al registro de empleados:");
		System.out.println("1. Insertar un empleado.");
		System.out.println("2. Leer un empleado.");
		*/
		Scanner a = new Scanner(System.in);
		
		
		
		
		/* PARA INTRODUCIR LOS DATOS DE FORMA MANUAL.
			// Pedir opcion al usuario.
			opc = a.nextInt();
			
			
			if (opc == 1) {
				
				// Insertar empleado.
				while (elige == 's') {
					
				
				}
				
			} else if (opc == 2) {
				// Leer empleado.
				
				emple.getID();
				emple.getNombre();
				
				
				
				} else if (opc != 1 && opc != 2) {
					
					System.out.println("No has introducido una opcion correcta.");
					
				}
				
				*/
		
		System.out.println(">> Chao.");
		

	}


}
