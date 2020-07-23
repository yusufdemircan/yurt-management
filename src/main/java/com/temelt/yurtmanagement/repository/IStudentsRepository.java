package com.temelt.yurtmanagement.repository;

import com.temelt.yurtmanagement.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentsRepository extends JpaRepository<Students, Long> {
}
