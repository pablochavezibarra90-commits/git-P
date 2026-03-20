import java.time.LocalDateTime;

import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("--- Registro de Usuario ---");
        System.out.print("Introduce nombre: ");
        String nom = teclado.nextLine();
        
        System.out.print("Introduce apellidos: ");
        String ape = teclado.nextLine();
        
        System.out.print("Introduce email: ");
        String mail = teclado.nextLine();

        Usuario nuevoUsuario = new Usuario(nom, ape, mail);

        System.out.println("\nUsuario registrado con éxito:");
        System.out.println("Nombre completo: " + nuevoUsuario.nombre + " " + nuevoUsuario.apellidos);
        System.out.println("Email: " + nuevoUsuario.email);
        
        teclado.close();
    }
}

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        System.out.println("La fecha y hora actual es: " + LocalDateTime.now());
    }
}