package com.lemzki.dev.plugin;


import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public interface PluginController {

    @GetMapping("/ide/plugins")
    List<Plugin> getAllPlugins();


}
