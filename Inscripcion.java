
import java.util.Scanner;

public class Inscripcion {
    private boolean certNacimiento;
    private boolean ciNinoCopia;
    private boolean libretaVacunas;
    private boolean controlMedicoApto;
    private boolean ciPadresCopia;
    private String personasAutorizadas[]; 
    private int cantFotos;
    
    // Composición: La inscripción TIENE UN niño
    private Nino nino; 

    public Inscripcion() {
        // podemos no inicializar los booleanos ya que java los lee automaticamente xd
        certNacimiento = false; 
        ciNinoCopia = false; 
        libretaVacunas = false;
        controlMedicoApto = false; 
        ciPadresCopia = false;
        personasAutorizadas = new String[3];
        cantFotos = 0;
        nino = new Nino(); 
    }

    public void leer(Scanner teclado) {
        System.out.println("Iniciando Inscripción");
        nino.leer(teclado); 

        System.out.println("Documentos (1 = Si, 0 = No)");
        System.out.print("¿Tiene Certificado de Nacimiento?: "); 
        certNacimiento = (teclado.nextInt() == 1); 
        teclado.nextLine();
        System.out.print("¿Tiene CI del niño (copia)?: "); 
        ciNinoCopia = (teclado.nextInt() == 1); 
        teclado.nextLine();
        System.out.print("¿Tiene Libreta de Vacunas?: "); 
        libretaVacunas = (teclado.nextInt() == 1); 
        teclado.nextLine();
        System.out.print("¿Tiene Control Médico?: "); 
        controlMedicoApto = (teclado.nextInt() == 1); 
        teclado.nextLine();
        System.out.print("¿Tiene CI de los padres (copia)?: "); 
        ciPadresCopia = (teclado.nextInt() == 1); 
        teclado.nextLine();
        
        System.out.print("Cantidad de fotos (3x3): "); 
        cantFotos = teclado.nextInt(); 
        teclado.nextLine();

        System.out.println("3 Personas Autorizadas");
        for (int i = 0; i < 3; i++) {
            System.out.print("Persona autorizada " + (i+1) + ": ");
            personasAutorizadas[i] = teclado.nextLine();
        }
    }

    public void mostrar() {
        System.out.println("DATOS DE LA INSCRIPCIÓN");
        nino.mostrar();
        System.out.println("Estado de documentos: " + verifDatos());
        System.out.println("Cantidad de fotos: " + cantFotos);
        System.out.print("Personas autorizadas: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(personasAutorizadas[i] + " | ");
        }
        System.out.println();
    }

    public String verifDatos() {
        // Verifica que todos los booleanos sean true y que tenga al menos 2 fotos
        if (certNacimiento && ciNinoCopia && libretaVacunas && controlMedicoApto && ciPadresCopia && cantFotos >= 2) {
            return "SÍ (Inscripción completa)"; } 
        else {
            return "NO (Faltan documentos o fotos)";
        }
    }
}