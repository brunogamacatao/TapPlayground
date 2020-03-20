package bitwise;

import java.util.List;

public class OrdenaAlunosSimples {
  public static void main(String[] args) {
    List<Integer> alunos = AlunosUtil.getAlunosPresentes();
    alunos.stream().sorted().forEach(a -> System.out.println(a));
  }
}

