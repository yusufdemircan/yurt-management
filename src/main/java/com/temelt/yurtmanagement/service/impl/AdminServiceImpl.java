package com.temelt.yurtmanagement.service.impl;

import com.sun.istack.NotNull;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import com.temelt.yurtmanagement.entity.Admin;
import com.temelt.yurtmanagement.repository.IAdminRepository;
import com.temelt.yurtmanagement.service.AdminService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    private final IAdminRepository adminRepository;


    public AdminServiceImpl(IAdminRepository adminRepository) {


        this.adminRepository = adminRepository;
    }



    @Override
    public Admin save(Admin admin) {

        if(admin.getMail()==null){
            throw new IllegalArgumentException("mail boş olamaz");
        }

        return adminRepository.save(admin);
    }

    @Override
    public Admin getById(Long id) {
        return adminRepository.getOne(id);
    }

    @Override
    public Page<Admin> getAllPageable(Pageable pageable) {
        return adminRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(Admin admin) {
        adminRepository.delete(admin);
        return Boolean.TRUE;
    }

    @Override
    public Admin getByUserName(String username) {
        return null;

    }
}
