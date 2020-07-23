package com.temelt.yurtmanagement.service.impl;

import com.temelt.yurtmanagement.entity.StudentHostel;
import com.temelt.yurtmanagement.repository.IStudentHostelRepository;
import com.temelt.yurtmanagement.service.StudentHostelService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentHostelServiceImpl implements StudentHostelService {
    public final IStudentHostelRepository studentHostelRepository;

    public StudentHostelServiceImpl(IStudentHostelRepository studentHostelRepository) {
        this.studentHostelRepository = studentHostelRepository;
    }


    @Override
    public StudentHostel save(StudentHostel studentHostel) {


        return studentHostelRepository.save(studentHostel);
    }

    @Override
    public StudentHostel getById(Long id) {
        return studentHostelRepository.getOne(id);
    }

    @Override
    public Page<StudentHostel> getAllPageable(Pageable pageable) {
        return studentHostelRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(StudentHostel studentHostel) {
        studentHostelRepository.delete(studentHostel);
        return Boolean.TRUE;
    }
}
