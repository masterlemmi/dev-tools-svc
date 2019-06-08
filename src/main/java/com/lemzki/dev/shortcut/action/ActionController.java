package com.lemzki.dev.shortcut.action;


import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public interface ActionController {

    @GetMapping("/actions")
    List<Action> getAllActions();


}
