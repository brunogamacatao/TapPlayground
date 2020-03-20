package bitwise;

import java.util.List;

public class OrdenaAlunosBitmap {
  public static void main(String[] args) {
    List<Integer> alunos = AlunosUtil.getAlunosPresentes();
    long[] bitmap = new long[2]; // cada long tem 8 bytes - então 2 longs têm 128 bits
    for (int aluno : alunos) { // povoando o bitmap
      if (aluno <= 64) bitmap[0] = bitmap[0] | (1 << (aluno -1));
      else bitmap[1] = bitmap[1] | (1 << (aluno - 65));
    }
    for (int i = 0; i < 100; i++) { // percorrendo o bitmap
      if (i < 64 && (bitmap[0] & 1 << i) != 0) System.out.println(i + 1);
      else if (i >= 64 && (bitmap[1] & 1 << (i - 64)) != 0) System.out.println(i + 1);
    }
  }
}
