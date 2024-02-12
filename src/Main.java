//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dataFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(dataFull);
        String dataMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(dataMedium);
        String dataShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(dataShort);
    }
}