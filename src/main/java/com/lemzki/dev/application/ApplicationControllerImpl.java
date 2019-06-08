package com.lemzki.dev.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ApplicationControllerImpl implements ApplicationController {

    @Autowired
    ApplicationService service;

    @Override
    public List<Application> getAllPlugins() {
        return service.getAllApplications();
    }
}
