package models;

import play.*;
import play.db.jpa.*;

import java.util.*;
import javax.persistence.*;


@Entity
public class Doctor extends User{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long doctorId;

    @ManyToOne
    public Department department;

    public Doctor(UserType userType, String username, String password, String fullName, Gender gender, Date DOB, int age, String address) {
        super(UserType.DOCTOR, username, password, fullName, gender, DOB, age, address);
    }
}
