import java.util.Scanner;

// Hereda de Ambiente
public class Audiovisual extends Ambiente {
    private int cantProyectores;

    public Audiovisual() {
        super(); 
        cantProyectores = 0;
    }

    @Override
    public void leer(Scanner teclado) {
        super.leer(teclado); 
        System.out.print("Cantidad de proyectores: "); cantProyectores = teclado.nextInt(); teclado.nextLine();
    }

    @Override // avisa de un error xD
    public void mostrar() {
        super.mostrar();
        System.out.println(" ----> Es un audiovisual con " + cantProyectores + " proyectores.");
    }
    
    // Setter extra por si acaso xd
    public void setCantProyectores(int c) { 
        cantProyectores = c; 
    }
}