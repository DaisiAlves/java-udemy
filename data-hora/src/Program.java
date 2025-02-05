import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Esse padrao pode ser colocado direto depois da data dentro do argumento
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now(); 
        Instant d03 = Instant.now(); //Data hora global, é gerado com o fuso horário de londres

        LocalDate d04 = LocalDate.parse("2025-01-11");//Tranformar uma data em texto no formato ISO
        LocalDateTime d05 = LocalDateTime.parse("2025-01-11T01:30:26");
        Instant d06 = Instant.parse("2025-01-11T01:30:26Z");
        Instant d07 = Instant.parse("2025-01-11T01:30:26-03:00");//Especifica um time zone diferente do GMT que é o de londre, ou seja esse horário que apresentei esta tres horas atrasado de londres, então vai imprimir o horario de londres com 3 horas a mais.

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);// o metodo parse do LocalDate tem uma sobrecarga que aceita o segundo argumento que é como voce vai interpretar o texto.
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 07, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 1, 1 , 30, 5);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03); 
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
    }

}
