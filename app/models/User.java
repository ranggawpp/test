package models;

import play.db.jpa.*;

import java.sql.Time;
import java.util.*;
import javax.persistence.*;


@Entity
public class User extends Model{
    @Column(unique = true, nullable = false)
    public String username;

    @Column(nullable = false)
    public String password;
    public UserType userType;
    public String fullName;
    public Gender gender;
    public Date DOB;
    public int age;
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
}
