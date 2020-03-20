package bitwise;

import java.util.ArrayList;
import java.util.List;

public class AlunosUtil {
  public static List<Integer> getAlunosPresentes() {
    List<Integer> alunos = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      while (true) {
        int aluno = 1 + (int)(Math.random() * 100.0);
        if (!alunos.contains(aluno)) {
          alunos.add(aluno);
          break;
        }
      }
    }
    return alunos;
  }
}
