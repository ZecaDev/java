package aprendizadodevdojo.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
        String regex = "(([^,])|([\\w.-]))+@([a-z])+((\\.|$|\\s)([a-z]|$)+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        Pattern pattern = Pattern.compile(regex);
//        System.out.println("Email valido");
//        System.out.println("#@!zoro@mail.br");
//        System.out.println(texto.split(",")[1].trim());
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+ texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+ regex);
        while  (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
