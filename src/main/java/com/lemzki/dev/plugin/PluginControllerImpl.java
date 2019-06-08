package com.lemzki.dev.plugin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class PluginControllerImpl implements PluginController {

    @Autowired
    PluginService service;

    @Override
    public List<Plugin> getAllPlugins() {
        return service.getAllPlugins();
    }
}
