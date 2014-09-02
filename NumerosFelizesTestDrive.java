public class NumerosFelizesTestDrive {
    public static void main(String[] args)
    {
      NumerosFelizes teste = new NumerosFelizes();
      System.out.println("\nTrue:");
      System.out.println(teste.eFeliz(13));
      System.out.println("\nFalse:");
      System.out.println(teste.eFeliz(3));
      System.out.println("\nTrue:");
      System.out.println(teste.eFeliz(10));
      System.out.println("Deve retornar 1 ");
      System.out.println(teste.separaNumero(1));
      System.out.println("Deve retornar 1, 2 e 3");
      System.out.println(teste.separaNumero(123));

    }
}
