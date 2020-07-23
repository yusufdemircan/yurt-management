package com.temelt.yurtmanagement.service;

import com.temelt.yurtmanagement.dto.StudentsDto;
import com.temelt.yurtmanagement.entity.Students;
import com.temelt.yurtmanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentsService {

    StudentsDto save(StudentsDto students);

    StudentsDto getById(Long id);

    TPage<StudentsDto> getAllPageable(Pageable pageable);

    Boolean delete(StudentsDto students);
}
