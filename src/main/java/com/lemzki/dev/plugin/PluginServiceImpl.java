package com.lemzki.dev.plugin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class PluginServiceImpl implements PluginService {

    @Autowired
    PluginRepository repository;

    @Override
    public List<Plugin> getAllPlugins() {
        return repository.findAll();

    }
}
