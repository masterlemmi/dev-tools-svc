package com.lemzki.dev.shortcut;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ShortcutServiceImpl implements ShortcutService {

    @Autowired
    ShortcutRepository repository;


    @Override
    public List<Shortcut> getAllShortcuts() {
        return repository.findAll();
    }
}
