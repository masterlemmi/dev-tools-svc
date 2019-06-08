package com.lemzki.dev.application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    ApplicationRepository repository;

    @Override
    public List<Application> getAllApplications() {
        return repository.findAll();

    }
}
