package models;

import java.math.BigDecimal;
import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Transaction extends Model {

    @ManyToOne
    public Patient patient;

    @ManyToOne
    public Appointment appointment;

    @Column(nullable = false)
    public Date paymentDate;

    @Column(nullable = false)
    public BigDecimal paymentAmount; 

    public Transaction(BigDecimal paymentAmount){
        this.paymentAmount = paymentAmount;
    }
}

