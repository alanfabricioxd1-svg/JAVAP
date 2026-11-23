import java.util.Scanner;

public class Nino {
    private int ciNino;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String fechaNacimiento;
    private int edad;

    public Nino() {
        ciNino = 0; 
        nombre = ""; 
        apPaterno = ""; 
        apMaterno = "";
        fechaNacimiento = ""; 
        edad = 0;
    }

    public void leer(Scanner teclado) {
        System.out.println("Datos del Niño");
        System.out.print("CI del niño: "); 
        ciNino = teclado.nextInt(); 
        teclado.nextLine();
        System.out.print("Nombre: "); 
        nombre = teclado.nextLine();
        System.out.print("Apellido Paterno: "); 
        apPaterno = teclado.nextLine();
        System.out.print("Apellido Materno: "); 
        apMaterno = teclado.nextLine();
        System.out.print("Fecha Nacimiento (DD/MM/AAAA): "); 
        fechaNacimiento = teclado.nextLine();
        System.out.print("Edad: "); 
        edad = teclado.nextInt(); 
        teclado.nextLine();
    }

    public void mostrar() {
        System.out.println("Niño: " + nombre + " " + apPaterno + " " + apMaterno + " , CI: " + ciNino + " , Edad: " + edad + " , Fecha Nac: " + fechaNacimiento);
    }

    public boolean verifApellidos(String apP, String apM) {
        return this.apPaterno.equals(apP) && this.apMaterno.equals(apM);
    }
    
    // Getters
    public int getCiNino() { 
        return ciNino; 
    }
    public String getNombreCompleto() { 
        return nombre + " " + apPaterno + " " + apMaterno; 
    }
}