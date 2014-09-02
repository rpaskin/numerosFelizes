public class NumerosFelizesTestDrive {
    public static void main(String[] args)
    {
      NumerosFelizes teste = new NumerosFelizes();

      System.out.println("Deve retornar 1 ");
      System.out.println(teste.separaNumero(1));
      System.out.println("Deve retornar 1, 2 e 3");
      System.out.println(teste.separaNumero(123));
      System.out.println("Deve retornar 1, 4 e 9");
      System.out.println(teste.aoQuadrado(teste.separaNumero(123)));
      System.out.println("Deve retornar 14");
      System.out.println(teste.somaTudo(teste.aoQuadrado(teste.separaNumero(123))));

      System.out.println("\nTrue para 10:");
      System.out.println(teste.eFeliz(10,0));

      System.out.println("\nTrue para 13:");
      System.out.println(teste.eFeliz(13,0));

      System.out.println("\nFalse para 3:");
      System.out.println(teste.eFeliz(3,0));
    }
}
