package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncontraTelefones {
  public static void main(String[] args) {

    final String TELEFONE_REGEX = "(\\(\\d{2}\\)\\d{4}-\\d{4})";
    String texto = "O telefone de Fulano é (81)1234-4321,\n" +
                   "já o telefone de Maria é (82)4444-5555, por fim,\n" +
                   "o número de Chico é (11)1406-0614.\n";
    Pattern fonePattern = Pattern.compile(TELEFONE_REGEX, Pattern.MULTILINE);
    Matcher foneMatcher = fonePattern.matcher(texto);
    while (foneMatcher.find()) {
      System.out.println(foneMatcher.group());
    }

  }
}
