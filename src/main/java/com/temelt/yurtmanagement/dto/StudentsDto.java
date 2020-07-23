package com.temelt.yurtmanagement.dto;

import com.temelt.yurtmanagement.entity.Admin;
import com.temelt.yurtmanagement.entity.StudentHostel;
import com.temelt.yurtmanagement.entity.StudentsSex;
import com.temelt.yurtmanagement.entity.StudentsStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class StudentsDto {
    private Long tc;

    private String ad;

    private String soyad;

    private StudentsSex cinsiyet;

    private int yas;

    private int sinif;

    private StudentsStatus studentsStatus;

    private String adres;

    private String cep_tel;

    private String email;

    private AdminDto assignee;

    private StudentHostelDto ogrenci_yurt;

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

    public AdminDto getAssignee() {
        return assignee;
    }

    public void setAssignee(AdminDto assignee) {
        this.assignee = assignee;
    }

    public StudentHostelDto getOgrenci_yurt() {
        return ogrenci_yurt;
    }

    public void setOgrenci_yurt(StudentHostelDto ogrenci_yurt) {
        this.ogrenci_yurt = ogrenci_yurt;
    }
}
