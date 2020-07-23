/*package com.temelt.yurtmanagement.service.impl;


import com.temelt.yurtmanagement.entity.DailyCheck;
import com.temelt.yurtmanagement.repository.IDailyCheckRepository;
import com.temelt.yurtmanagement.service.DailyCheckService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DailyCheckImpl implements DailyCheckService {

    public final IDailyCheckRepository dailyCheckRepository;

    public DailyCheckImpl(IDailyCheckRepository dailyCheckRepository) {
        this.dailyCheckRepository = dailyCheckRepository;
    }


    @Override
    public DailyCheck save(DailyCheck dailyCheck) {


        return dailyCheckRepository.save(dailyCheck);
    }

    @Override
    public DailyCheck getById(Long id) {
        return dailyCheckRepository.getOne(id);
    }

    @Override
    public Page<DailyCheck> getAllPageable(Pageable pageable) {
        return dailyCheckRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(DailyCheck dailyCheck) {

        dailyCheckRepository.delete(dailyCheck);
        return Boolean.TRUE;
    }
}
*/