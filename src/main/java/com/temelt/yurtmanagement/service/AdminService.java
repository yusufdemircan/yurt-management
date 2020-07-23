package com.temelt.yurtmanagement.service;

import com.temelt.yurtmanagement.entity.Admin;
import com.temelt.yurtmanagement.entity.Students;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AdminService{

    Admin save(Admin admin);

    Admin getById(Long id);

    Page<Admin> getAllPageable(Pageable pageable);

    Boolean delete(Admin admin);

    Admin getByUserName(String username);
}
