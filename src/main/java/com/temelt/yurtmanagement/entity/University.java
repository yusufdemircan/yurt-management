package com.temelt.yurtmanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "university")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class University extends BaseEntity {
    @Id
    private Long bolum_id;
    @Column(name = "bolum", length = 100)
    private String bolum;
    @Column(name = "fakulte", length = 100)
    private String fakulte;
    @Column(name = "kayit_tarihi")
    private Date kayit_tarihi;
    @Column(name = "bolum_tel", length = 11)
    private String bolum_tel;

    @JoinColumn(name = "assignee_admin_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Admin assignee;

    @JoinColumn(name = "ogrenci_okul")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Students> studentsList;

    public Long getBolum_id() {
        return bolum_id;
    }

    public void setBolum_id(Long bolum_id) {
        this.bolum_id = bolum_id;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getFakulte() {
        return fakulte;
    }

    public void setFakulte(String fakulte) {
        this.fakulte = fakulte;
    }

    public Date getKayit_tarihi() {
        return kayit_tarihi;
    }

    public void setKayit_tarihi(Date kayit_tarihi) {
        this.kayit_tarihi = kayit_tarihi;
    }

    public String getBolum_tel() {
        return bolum_tel;
    }

    public void setBolum_tel(String bolum_tel) {
        this.bolum_tel = bolum_tel;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }
}
