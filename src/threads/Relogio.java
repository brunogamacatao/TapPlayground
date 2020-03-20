package threads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Relogio {
  public static void main(String[] args) {
    DateFormat fmt = new SimpleDateFormat("HH:mm:ss");
    Runnable relogio = () -> {
      while (true) {
        System.out.println(fmt.format(new Date()));
        try {
          Thread.sleep(1000); // espera 1 segundo
        } catch (InterruptedException e) {
          // não faz nada, essa exceção é esperada !
        }
      }
    };
    new Thread(relogio).start();
  }
}
