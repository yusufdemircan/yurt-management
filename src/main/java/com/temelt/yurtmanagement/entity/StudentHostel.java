package com.temelt.yurtmanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "studentHostel")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class StudentHostel extends BaseEntity {
    @Id
    private Long yurt_id;
    @Column(name = "yurt_adi",length = 100)
    private String yurt_adi;
    @Column(name = "yurt_tel",length = 11)
    private String yurt_tel;
    @Column(name = "yurt_adres",length = 100)
    private String yurt_adres;
    @Column(name = "hakkimizda",length = 100)
    private String hakkimizda;
    @Column(name = "yurt_mail",length = 100)
    private String yurt_mail;
    @Column(name = "yurt_oda")
    private int yurt_oda;

    @JoinColumn(name = "assignee_admin_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Admin assignee;

    @JoinColumn(name = "ogrenci_yurt_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Students> students;

    public Long getYurt_id() {
        return yurt_id;
    }

    public void setYurt_id(Long yurt_id) {
        this.yurt_id = yurt_id;
    }

    public String getYurt_adi() {
        return yurt_adi;
    }

    public void setYurt_adi(String yurt_adi) {
        this.yurt_adi = yurt_adi;
    }

    public String getYurt_tel() {
        return yurt_tel;
    }

    public void setYurt_tel(String yurt_tel) {
        this.yurt_tel = yurt_tel;
    }

    public String getYurt_adres() {
        return yurt_adres;
    }

    public void setYurt_adres(String yurt_adres) {
        this.yurt_adres = yurt_adres;
    }

    public String getHakkimizda() {
        return hakkimizda;
    }

    public void setHakkimizda(String hakkimizda) {
        this.hakkimizda = hakkimizda;
    }

    public String getYurt_mail() {
        return yurt_mail;
    }

    public void setYurt_mail(String yurt_mail) {
        this.yurt_mail = yurt_mail;
    }

    public int getYurt_oda() {
        return yurt_oda;
    }

    public void setYurt_oda(int yurt_oda) {
        this.yurt_oda = yurt_oda;
    }

    public Admin getAssignee() {
        return assignee;
    }

    public void setAssignee(Admin assignee) {
        this.assignee = assignee;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }
}
