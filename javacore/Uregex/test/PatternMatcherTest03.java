package aprendizadodevdojo.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo que nao for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = todos os caracters excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = tudo que nao for incluso no \w
        // []
        // ! = Zero ou uma
        // * = Zero ou mais
        // + = Uma ou mais
        // {n,m} de n até m
        // ()
        // | o(v\c)o ovo|oco
        // $
        // . 1.3 = 123, 133
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+ texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+ regex);
        while  (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
