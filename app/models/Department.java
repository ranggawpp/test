package models;

import play.*;
import play.db.jpa.*;

import java.util.*;
import javax.persistence.*;


@Entity
public class Department extends Model{
    @Column(nullable = false)
    public String name;

    public Department(String name) {
        this.name = name;
    }

}
