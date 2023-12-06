package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class Patient extends User{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long patientId;

    public Blood bloodType;

    public Patient(String username, String password, String fullName,
                Gender gender, Date DOB, int age, String address, Blood bloodType) {
        super(UserType.PATIENT, username, password, fullName, gender, DOB, age, address);
        this.bloodType = bloodType;
    }
}
