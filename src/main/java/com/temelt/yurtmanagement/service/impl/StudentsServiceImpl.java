package com.temelt.yurtmanagement.service.impl;

import com.temelt.yurtmanagement.dto.StudentsDto;
import com.temelt.yurtmanagement.entity.Students;
import com.temelt.yurtmanagement.repository.IStudentsRepository;
import com.temelt.yurtmanagement.service.StudentsService;
import com.temelt.yurtmanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class StudentsServiceImpl implements StudentsService {

    private final IStudentsRepository studentsRepository;
    private final ModelMapper modelMapper;

    public StudentsServiceImpl(IStudentsRepository studentsRepository, ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.studentsRepository = studentsRepository;
    }


    @Override
    public StudentsDto save(StudentsDto students) {
        if (students.getCep_tel() == null) {
            throw new IllegalArgumentException("telefon no boş");
        }
        Students studentsDb=modelMapper.map(students, Students.class);
        studentsDb = studentsRepository.save(studentsDb);
        return modelMapper.map(studentsDb,StudentsDto.class);
    }

    @Override
    public StudentsDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<StudentsDto> getAllPageable(Pageable pageable) {
        Page<Students> data = studentsRepository.findAll(pageable);
        TPage page = new TPage<StudentsDto>();
        StudentsDto[] dtos=modelMapper.map(data.getContent(),StudentsDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;

    }

    @Override
    public Boolean delete(StudentsDto students) {
        return null;
    }
}
