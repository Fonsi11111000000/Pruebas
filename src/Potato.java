import java.util.Scanner;

public class Potato
{
    public int brazos;

    public Potato()
    {
        brazos = 0;
    }

    /*public int brazos;    //recoge por teclado el valor que tendrá la variable "brazos"
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir primer valor: ");
        brazos = entrada.nextInt();
        //return this.brazos;
    }*/

    public void QuitarBrazos()    //cada vez que se ejecuta la función. restará 1 al valor de la variable "brazos"
    {
        this.brazos--;
        System.out.println("Señor Potato ha perdido un brazo");
    }

    public void AñadirBrazos()    //cada vez que se ejecuta la función. restará 1 al valor de la variable "brazos"
    {
        this.brazos++;
        System.out.println("Señor Potato ha ganado un brazo");
    }

    public String dimeBrazos()     //imprime el valor actual de la variable "brazos"
    {
        return "El Señor Potato tiene " + brazos + " brazos";
    }

    //public void
    /*public String Menu()      //GETTER
    {
        return "Dale un numero de brazos al señor Potato: " + brazos;
    }*/
}
