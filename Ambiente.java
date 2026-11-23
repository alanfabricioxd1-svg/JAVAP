import java.util.Scanner;

public class Ambiente {
    protected int nro;
    protected int capacidad;
    protected int cantSillas;
    protected int cantMesas;
    protected String estantes[][]; 
    protected int cantEstantes;

    public Ambiente() {
        nro = 0; 
        capacidad = 0; 
        cantSillas = 0; 
        cantMesas = 0;
        estantes = new String[3][20];
        cantEstantes = 0;
    }

    public void leer(Scanner teclado) {
        System.out.println("Datos del Ambiente");
        System.out.print("Nro de ambiente: "); 
        nro = teclado.nextInt(); 
        teclado.nextLine();
        System.out.print("Capacidad: "); 
        capacidad = teclado.nextInt(); 
        teclado.nextLine();
        System.out.print("Cantidad de sillas: "); 
        cantSillas = teclado.nextInt(); 
        teclado.nextLine();
        System.out.print("Cantidad de mesas: "); 
        cantMesas = teclado.nextInt(); 
        teclado.nextLine();
    }

    public void mostrar() {
        System.out.println("Ambiente Nro: " + nro + " , Capacidad: " + capacidad + " , Sillas: " + cantSillas + " , Mesas: " + cantMesas);
    }

    public void nuevoObjeto(String obj) {
        if (cantEstantes < 3) {
            estantes[cantEstantes][0] = obj; 
            cantEstantes++;
            System.out.println("Objeto agregado al estante: " + obj);
        } else {
            System.out.println("No hay más espacio en los estantes principales");
        }
    }

    public void nuevasSillas(int s) { 
        cantSillas = cantSillas + s; 
    }
    
    public void nuevasMesas(int m) { 
        cantMesas = cantMesas + m; 
    }
    
    public void nuevoEstante(String e) { 
        nuevoObjeto(e); 
    }
}