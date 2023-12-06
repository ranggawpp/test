package models;

import play.*;
import play.db.jpa.*;

import java.util.*;
import javax.persistence.*;


@Entity
public class Admin extends User {
    public Admin(UserType userType, String username, String password, String fullName,
                Gender gender, Date DOB, int age, String address) {
        super(UserType.ADMIN, username, password, fullName, gender, DOB, age, address);
    }
}
