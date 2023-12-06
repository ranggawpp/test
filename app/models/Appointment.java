package models;

import play.*;
import play.db.jpa.*;

import java.sql.Time;
import java.util.*;
import javax.persistence.*;


@Entity
public class Appointment extends Model {
    @ManyToOne
    public Patient patient;

    @ManyToOne
    public Doctor doctor;

    @ManyToOne
    public Department department;

    @Column(nullable = false)
    public Date appointmentDate;

    @Column(nullable = false)
    public Time appointmentTime;
}
