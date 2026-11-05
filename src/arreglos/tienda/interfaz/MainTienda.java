package arreglos.tienda.interfaz;

import arreglos.tienda.modelo.AppStore;
import arreglos.tienda.modelo.Juego;

import javax.swing.*;
import java.util.Scanner;

public class MainTienda {
    static Scanner sc = new Scanner(System.in);
    static AppStore as1 = new AppStore();

    static void main() {

        as1.inicializarDatos();

        String nombre;
        String categoria;
        int tamanio;
        double precio;
        int licenciaDisponibles;
        int opc;
        int cantidad;
        do{

            menu();
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:{
                    ingresarJuego();

                }break;
                case 2:{
                    mostrarJuegos();
                }break;
                case 3:{

                }break;
                case 4:{

                }break;
                case 5:{

                }break;
                case 6:{

                }break;
                case 7:{

                }break;
                default:
                    System.out.println("No es una opción válida");
            }

        }while(opc != 7);
    }
    public static void menu(){
        System.out.println("**********AppStore Udla**********");
        System.out.println("1. Ingresar Juego");
        System.out.println("2. Mostrar juegos");
        System.out.println("3. Buscar juego");
        System.out.println("4. Comprar");
        System.out.println("5. Vender");
        System.out.println("6. Juego más vendido");
        System.out.println("7. Salir");
        System.out.print("Ingrese una opcion: ");
    }

    public static void ingresarJuego(){
        System.out.println("******INGRESO DE DATOS******");
        System.out.printf("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.printf("Ingrese la categoria: ");
        String categoria = sc.nextLine();
        System.out.println("Ingrese el tamanio: ");
        int tamanio = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el precio: ");
        double precio = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese el stock inicial: ");
        int licenciasDisponibles = Integer.parseInt(sc.nextLine());
        as1.agregarJuego(new Juego(nombre,categoria,tamanio,precio,licenciasDisponibles))){
            JOptionPane.showMessageDialog(null, "Juego agregado con éxito");
        }else
            JOptionPane.showMessageDialog(null,"No fu posible el Juego");
    }
    public static void mostrarJuegos(){
        Juego juegos[] = as1.getJuegos();
        for (Juego j : juegos){
            if(j != null){
                System.out.println(j);
            }else{
                System.out.println("No existe el juego");
                return;
            }
        }
    }
}
