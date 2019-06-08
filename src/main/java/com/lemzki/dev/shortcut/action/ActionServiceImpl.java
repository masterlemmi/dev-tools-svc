package com.lemzki.dev.shortcut.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ActionServiceImpl implements ActionService {

    @Autowired
    ActionRepository repository;


    @Override
    public List<Action> getAllActions() {
        return repository.findAll();
    }
}
