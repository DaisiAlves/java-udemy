import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now(); 
        Instant d03 = Instant.now(); //Data hora global, é gerado com o fuso horário de londres

        LocalDate d04 = LocalDate.parse("2025-01-11");//Tranformar uma data em texto no formato ISO
        LocalDateTime d05 = LocalDateTime.parse("2025-01-11T01:30:26");
        Instant d06 = Instant.parse("2025-01-11T01:30:26Z");
        Instant d07 = Instant.parse("2025-01-11T01:30:26-03:00");//Especifica um time zone diferente do GMT que é o de londre, ou seja esse horário que apresentei esta tres horas atrasado de londres, então vai imprimir o horario de londres com 3 horas a mais.

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03); 
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
    }

}
