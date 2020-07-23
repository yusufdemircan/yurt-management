package com.temelt.yurtmanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Optional;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Students extends BaseEntity {
    @Id
    private Long tc;

    @Column(name = "ad", length = 100)
    private String ad;

    @Column(name = "soyad", length = 100)
    private String soyad;

    @Column(name = "cinsiyet")
    @Enumerated(EnumType.STRING)
    private StudentsSex cinsiyet;

    @Column(name = "yas")
    private int yas;

    @Column(name = "sinif")
    private int sinif;

    @Column(name = "students_status")
    @Enumerated(EnumType.STRING)
    private StudentsStatus studentsStatus;

    @Column(name = "adres", length = 255)
    private String adres;

    @Column(name = "cep_tel", length = 11)
    private String cep_tel;

    @Column(name = "mail", length = 100)
    private String email;

    @JoinColumn(name="ogrenci_yurt_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private StudentHostel ogrenci_yurt;

    @JoinColumn(name="ogrenci_okul_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private University ogrenci_okul;

  

    @JoinColumn(name = "assignee_admin_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Admin assignee;

    public Long getTc() {
        return tc;
    }

    public void setTc(Long tc) {
        this.tc = tc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public StudentsSex getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(StudentsSex cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public StudentsStatus getStudentsStatus() {
        return studentsStatus;
    }

    public void setStudentsStatus(StudentsStatus studentsStatus) {
        this.studentsStatus = studentsStatus;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getCep_tel() {
        return cep_tel;
    }

    public void setCep_tel(String cep_tel) {
        this.cep_tel = cep_tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StudentHostel getOgrenci_yurt() {
        return ogrenci_yurt;
    }

    public void setOgrenci_yurt(StudentHostel ogrenci_yurt) {
        this.ogrenci_yurt = ogrenci_yurt;
    }

    public University getOgrenci_okul() {
        return ogrenci_okul;
    }

    public void setOgrenci_okul(University ogrenci_okul) {
        this.ogrenci_okul = ogrenci_okul;
    }

 
    public Admin getAssignee() {
        return assignee;
    }

    public void setAssignee(Admin assignee) {
        this.assignee = assignee;
    }
}
