package com.temelt.yurtmanagement.service.impl;

import com.temelt.yurtmanagement.entity.Students;
import com.temelt.yurtmanagement.entity.University;
import com.temelt.yurtmanagement.repository.IUniversityRepository;
import com.temelt.yurtmanagement.service.UniversityService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UniversityServiceImpl implements UniversityService {

    public final IUniversityRepository universityRepository;

    public UniversityServiceImpl(IUniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public University save(University university) {
        return universityRepository.save(university);
    }

    @Override
    public University getById(Long id) {
        return universityRepository.getOne(id);
    }

    @Override
    public Page<University> getAllPageable(Pageable pageable) {
        return universityRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(University university) {
        universityRepository.delete(university);
        return Boolean.TRUE;
    }
}
