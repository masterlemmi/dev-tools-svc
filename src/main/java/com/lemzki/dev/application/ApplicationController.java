package com.lemzki.dev.application;


import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public interface ApplicationController {

    @GetMapping("/applications")
    List<Application> getAllPlugins();


}
