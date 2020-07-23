package com.temelt.yurtmanagement.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Admins")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Admin extends  BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username", length = 100,unique = true)
    private String user_name;

    @Column(name = "password", length = 100)
    private String pass;

    @Column(name = "nameSurname")
    private String name_surname;

    @Column(name = "email")
    private String mail;



    @JoinColumn(name = "ogrenci_admin_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Students> students;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName_surname() {
        return name_surname;
    }

    public void setName_surname(String name_surname) {
        this.name_surname = name_surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }
}
