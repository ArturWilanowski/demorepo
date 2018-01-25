package pl.wilanowskiartur.demorepo.models;


import lombok.Data;
import lombok.NoArgsConstructor;
import pl.wilanowskiartur.demorepo.models.forms.ReservationForm;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "reservation")
@NoArgsConstructor
public class ReservationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private String name;
    private String lastname;
    private LocalDate date;
    private String adress;

    public ReservationModel(ReservationForm form){
        name = form.getName();
        lastname = form.getLastname();
        date = form.getFormatedDate();
        adress = form.getAdress();
    }
}
