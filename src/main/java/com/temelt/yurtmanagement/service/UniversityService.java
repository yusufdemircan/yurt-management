package com.temelt.yurtmanagement.service;

import com.temelt.yurtmanagement.entity.Students;
import com.temelt.yurtmanagement.entity.University;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UniversityService {

    University save(University university);

    University getById(Long id);

    Page<University> getAllPageable(Pageable pageable);

    Boolean delete(University university);
}
