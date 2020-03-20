package threads;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Sincronizacao {
  private static void listFiles(File raiz, List<String> result) {
    for (File f : raiz.listFiles()) {
      if (f.isDirectory()) {
        listFiles(f, result);
      } else {
        System.out.println(f);
        result.add(f.getAbsolutePath());
      }
    }
  }

  public static void main(String[] args) {
    final List<String> arquivos = new ArrayList<>();

    Runnable listaArquivos = () -> {
      listFiles(new File("/home/bruno/dev/facisa/tap/TapPlayground"), arquivos);
    };

    Thread listaArquivosThread = new Thread(listaArquivos);

    listaArquivosThread.start();

    try {
      listaArquivosThread.join();
    } catch (InterruptedException e) {
    }

    System.out.println("O thread listaArquivosThread encontrou " + arquivos.size() + " arquivos");
  }
}
