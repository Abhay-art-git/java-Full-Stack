package com.telusko;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Alien {
     @Id
//     @Column(name ="a_ge")
     private int age ;
     private String name ;
     private String team ;


     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public String getName(String navin) {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getTeam(String java) {
          return team;
     }

     public void setTeam(String team) {
          this.team = team;
     }

     @Override
     public String toString() {
          return "Alien{" +
                  "age=" + age +
                  ", name='" + name + '\'' +
                  ", team='" + team + '\'' +
                  '}';
     }
}
