package threads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Relogios {
  private static final DateFormat DATE_FMT = new SimpleDateFormat("HH:mm:ss");

  private static Runnable criarRelogio(String prefixo, long delay) {
    return () -> {
      while (true) {
        System.out.println(prefixo + " - " + DATE_FMT.format(new Date()));
        try {
          Thread.sleep(delay);
        } catch (InterruptedException e) {
          // não faz nada, essa exceção é esperada !
        }
      }
    };
  }

  public static void main(String[] args) {
    int nCores = Runtime.getRuntime().availableProcessors();
    ExecutorService executor = Executors.newFixedThreadPool(nCores);
    executor.execute(criarRelogio("relógio A", 500));
    executor.execute(criarRelogio("relógio B", 1000));
    executor.execute(criarRelogio("relógio C", 750));
  }
}
