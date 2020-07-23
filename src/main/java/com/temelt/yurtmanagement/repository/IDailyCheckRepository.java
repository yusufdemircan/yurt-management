package com.temelt.yurtmanagement.repository;


import com.temelt.yurtmanagement.entity.DailyCheck;
import net.bytebuddy.TypeCache;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Date;
import java.util.List;

public interface IDailyCheckRepository extends JpaRepository<DailyCheck, Long> {

    default List<DailyCheck> getDailyChecks(Date tarih) {
        return null;
    }

    // List<DailyCheck> findAll(Pageable pageable);

    //List<DailyCheck> findAll(Sort sort);

}
