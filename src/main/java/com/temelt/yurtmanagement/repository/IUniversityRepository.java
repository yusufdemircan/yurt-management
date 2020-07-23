package com.temelt.yurtmanagement.repository;

import com.temelt.yurtmanagement.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUniversityRepository extends JpaRepository<University, Long> {
}
