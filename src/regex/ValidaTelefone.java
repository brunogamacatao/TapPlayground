package regex;

import java.util.regex.Pattern;

public class ValidaTelefone {
  public static void main(String[] args) {
    final String TELEFONE_REGEX = "\\(\\d{2}\\)\\d{4}-\\d{4}";
    Pattern telefonePattern = Pattern.compile(TELEFONE_REGEX);
    System.out.println(telefonePattern.matcher("(83)5555-5555").matches());
  }
}
