import java.util.*;

public class NumerosFelizesTestDrive {
    public static void main(String[] args)
    {
      NumerosFelizes teste = new NumerosFelizes();
        System.out.println("\nTrue:");
        System.out.println(teste.eFeliz(7));
        System.out.println("\nFalse:");
        System.out.println(teste.eFeliz(8));
        System.out.println(Arrays.toString(teste.DividirNum(2034)));

        // Testes requeridos pelo enunciado:
        System.out.println("Dividindo 1: ");
        System.out.println(Arrays.toString(teste.DividirNum(1)));
        System.out.println("Dividindo 123: ");
        System.out.println(Arrays.toString(teste.DividirNum(123)));

    }
}