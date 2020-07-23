package com.temelt.yurtmanagement.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Gunluk_Kontrol")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class DailyCheck extends BaseEntity{

  
	private static final long serialVersionUID = 1L;

	@Id
    private Long id;

    @Column(name = "tarih")
    @Temporal(TemporalType.DATE)
    private Date tarih;
    @Column(name = "cikis")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cikis_zamani;
    @Column(name = "giris")
    @Temporal(TemporalType.TIMESTAMP)
    private Date giris_zamani;

    @JoinColumn(name = "assignee_student_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Students students;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public Date getCikis_zamani() {
        return cikis_zamani;
    }

    public void setCikis_zamani(Date cikis_zamani) {
        this.cikis_zamani = cikis_zamani;
    }

    public Date getGiris_zamani() {
        return giris_zamani;
    }

    public void setGiris_zamani(Date giris_zamani) {
        this.giris_zamani = giris_zamani;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
