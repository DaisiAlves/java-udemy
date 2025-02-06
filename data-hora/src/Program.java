import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
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


        // TRANSFORMAR FATA PARA TEXTO: 

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Essa instanciação irá buscar a data do computador, e converter do horário de Londres

        System.out.println("d04 = " + d04.format(fmt3));
        System.out.println("d04 = " + fmt3.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d06 = " + d06.toString());

        //O Instant não funciona com o format, por ser global, para conseguir fazer isso tem que informar para qual horario eu quero 


        ZoneId.getAvailableZoneIds(); // classe que retorna uma coleção com os nomes dos fuso horários customizados 

       

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);


        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 mês = " + d04.getYear());
    }

}
