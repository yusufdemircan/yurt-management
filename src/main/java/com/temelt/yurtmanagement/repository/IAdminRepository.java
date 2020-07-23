package com.temelt.yurtmanagement.repository;

import com.temelt.yurtmanagement.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepository extends JpaRepository<Admin, Long> {
}
