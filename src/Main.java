import java.util.*;

public class Main
{
        public static void main(String[] args)
        {
            Potato miPotato = new Potato();    // se crea la instancia a la clase Potato
           int opcion;
           int numBrazos = miPotato.brazos;    //obtenemos el valor actual de la variable brazos

           do {
                System.out.println();
                System.out.println("1. Recuento");
                System.out.println("2. Añadir brazo");
                System.out.println("3. Quitar brazo");
                System.out.println();
                Scanner entrada = new Scanner(System.in);
                opcion = entrada.nextInt();

                switch (opcion)
                {
                    case 1 -> {
                        System.out.println(miPotato.dimeBrazos());
                        System.out.println();
                    }
                    case 2 -> {
                        miPotato.AñadirBrazos();
                        System.out.println();
                    }
                    case 3 -> {
                        if(numBrazos <= 0){
                            System.out.println("Potato no puede perder más brazos");
                        }else{
                            miPotato.QuitarBrazos();
                            System.out.println();
                        }
                    }

                    default ->{
                        if(opcion != 0 || opcion != 1 || opcion != 2 || opcion != 3)
                        {
                            System.out.println("Seleccionar opcion correcta");System.out.println();
                        }
                    }
                }
            } while (opcion != 0);

            System.out.println("Finalmente " + miPotato.dimeBrazos() + " brazos");
        }
    }