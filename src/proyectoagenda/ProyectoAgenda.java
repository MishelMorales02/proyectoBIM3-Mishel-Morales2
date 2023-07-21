package proyectoagenda;

import java.util.Scanner;

public class ProyectoAgenda {

    static contacto miContacto[] = new contacto[15];
    static int contador = 0;
   

    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);

        while (op != 4) {
            System.out.println("                          ");
            System.out.println("|        MENU        |");
            System.out.println("1. Guardar contacto");
            System.out.println("2. Ver todos los contactos");
            System.out.println("3. Buscar un contacto");
            System.out.println("4. Salir");
            System.out.println("|--------------------|");
            System.out.println("Ingrese el numero de opcion");

            op = entrada.nextInt();
            if (op == 1) {
                System.out.println("||| GUARDE UN NUEVO CONTACTO |||");
                crearContacto();
            } else if (op == 2) {
                System.out.println("|||||ESTOS SON TUS CONTACTOS|||||");
                verTodos();
            } else if (op == 3) {
                System.out.println("||||||BUSCAR CONTACTO||||||");
                System.out.println("Ingrese el numero del contacto: ");
                Scanner teclado = new Scanner(System.in);
                String numeroTel = teclado.nextLine();
                System.out.println(verContacto(numeroTel));
            } else if (op == 4) {
                System.out.println("°El programa ha finalizado°");
            }
        }
    }

    static public String verContacto(String nombre) {
        int posicion = -1;
        for (int i = 0; i < 15; i++) {
            if (miContacto[i] != null) {
                if (miContacto[i].verNumeroTel().equals(nombre)) {
                    posicion = i;
                    break;
                }
            }

        }
        if (posicion != -1) {
            return "Nombre: " + miContacto[posicion].verNombre() +" || "+ " Domicilio: " + miContacto[posicion].verDomicilio();

        } else {
            return "°EL CONTACTO NO FUE ENCONTRADO°";
        }
    }

    static public void crearContacto() {
        if (contador >= 15) {
            System.out.println("°°°°°°°° LA MEMORIA ESTA LLENA °°°°°°°°°");
        } else {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el nombre del nuevo contacto");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese el numero de telefono");
            String numeroTel = teclado.nextLine();
            System.out.println("Ingrese el domicilio del contacto");
            String domicilio = teclado.nextLine();
            miContacto[contador] = new contacto(nombre, domicilio, numeroTel);
            System.out.println("EL DATO FUE ALMACENADO");
            contador++;
        }
    }

    static public void verTodos() {
        for (int i = 0; i < contador; i++) {
            System.out.println("////////////////////////////////////////////////////////////////");
            System.out.println("Nombre: " + miContacto[i].verNombre());
            System.out.println("Numero de Telefono: " + miContacto[i].verNumeroTel());
            System.out.println("Domicilio: " + miContacto[i].verDomicilio());
            System.out.println("////////////////////////////////////////////////////////////////");
        }
    }


        }
    
    
