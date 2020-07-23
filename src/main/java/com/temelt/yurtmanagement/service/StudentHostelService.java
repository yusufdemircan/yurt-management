package com.temelt.yurtmanagement.service;

import com.temelt.yurtmanagement.entity.StudentHostel;
import com.temelt.yurtmanagement.entity.Students;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentHostelService {

    StudentHostel save(StudentHostel studentHostel);

    StudentHostel getById(Long id);

    Page<StudentHostel> getAllPageable(Pageable pageable);

    Boolean delete(StudentHostel studentHostel);
}
