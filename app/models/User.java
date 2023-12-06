package models;

import play.db.jpa.*;
import play.data.validation.*;

import java.sql.Time;
import java.util.*;
import javax.persistence.*;

@Entity
public class User extends Model{
    @Required
    @Column(unique = true, nullable = false)
    public String username;

    @Required
    @Column(nullable = false)
    public String password;
    @Required
    public UserType userType;
    @Required
    public String fullName;
    @Required
    public Gender gender;
    @Required
    public Date DOB;
    @Required
    public int age;
    @Required
    public String address;

    public User(UserType userType, String username, String password, String fullName,
                Gender gender, Date DOB, int age, String address){
                    this.userType = userType;
                    this.username = username;
                    this.password = password;
                    this.fullName = fullName;
                    this.gender = gender;
                    this.DOB = DOB;
                    this.age = age;
                    this.address = address;
                }

    public static User connect(String username, String password) {
        return find("username=:username and password=:password")
            .setParameter("username", username)
            .setParameter("password", password)
            .first();
      
    }
}
