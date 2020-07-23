package com.temelt.yurtmanagement.service;

import com.temelt.yurtmanagement.entity.DailyCheck;
import com.temelt.yurtmanagement.entity.Students;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DailyCheckService {

    DailyCheck save(DailyCheck dailyCheck);

    DailyCheck getById(Long id);

    Page<DailyCheck> getAllPageable(Pageable pageable);

    Boolean delete(DailyCheck dailyCheck);

}
