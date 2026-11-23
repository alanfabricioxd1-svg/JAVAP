import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("SISTEMA CENTRO INFANTIL ANDRESITO");
        
        // 1. Instanciar y llenar un Audiovisual
        Audiovisual aula1 = new Audiovisual();
        aula1.leer(teclado);
        
        // 2. Usar los métodos de la clase Ambiente
        aula1.nuevasSillas(5);
        aula1.nuevoObjeto("Televisor 50 pulgadas");
        
        // 3. Mostrar el Audiovisual
        System.out.println("Mostrando Ambiente");
        aula1.mostrar();
        
        // 4. Instanciar y llenar una Inscripción (que crea a su Niño por dentro)
        Inscripcion insc1 = new Inscripcion();
        insc1.leer(teclado);
        
        // 5. Mostrar la inscripción completa
        insc1.mostrar();
        
        teclado.close();
    }
}