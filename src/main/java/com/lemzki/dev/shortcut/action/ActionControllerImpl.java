package com.lemzki.dev.shortcut.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ActionControllerImpl implements ActionController {

    @Autowired
    ActionService service;

    @Override
    public List<Action> getAllActions() {
        return service.getAllActions();
    }
}
