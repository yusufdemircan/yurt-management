package com.temelt.yurtmanagement.repository;


import com.temelt.yurtmanagement.entity.StudentHostel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentHostelRepository extends JpaRepository<StudentHostel, Long> {
}
