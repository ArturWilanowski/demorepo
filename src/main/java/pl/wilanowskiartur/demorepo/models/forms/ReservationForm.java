package pl.wilanowskiartur.demorepo.models.forms;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservationForm {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String lastname;
    @Getter
    @Setter
    private String date;
    @Getter
    @Setter
    private String adress;

    DateTimeFormatter format =  DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public LocalDate getFormatedDate(){
            return LocalDate.parse(date, format);
    }
}
