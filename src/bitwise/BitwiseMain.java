package bitwise;

public class BitwiseMain {
  private static final int HAMBURGUER   = 1;
  private static final int MILK_SHAKE   = 1 << 1;
  private static final int REFRIGERANTE = 1 << 2;
  private static final int BATATA_FRITA = 1 << 3;
  private static final int SALADA       = 1 << 4;

  private static boolean temFlag(int pedido, int flag) {
    return (pedido & flag) == flag;
  }

  public static void main(String[] args) {
    int pedido = HAMBURGUER | REFRIGERANTE | BATATA_FRITA;
    System.out.println(Integer.toBinaryString(pedido));
    System.out.println(temFlag(pedido, HAMBURGUER));
    System.out.println(temFlag(pedido, SALADA));
  }
}
