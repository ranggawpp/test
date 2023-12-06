package models;

import play.*;
import play.db.jpa.*;

import java.util.*;
import javax.persistence.*;


@Entity
public class Medical_Report extends Model{
    @ManyToOne
    public Patient patient; // Use Patient instead of String _patientName

    @ManyToOne
    public Doctor doctor; // Use Doctor instead of commented-out _doctor

    @Column(nullable = false)
    public Date reportDate;

    @Column(nullable = false)
    public String reportDetail;
}
