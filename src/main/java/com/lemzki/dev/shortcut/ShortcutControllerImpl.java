package com.lemzki.dev.shortcut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ShortcutControllerImpl implements ShortcutController {

    @Autowired
    ShortcutService service;

    @Override
    public List<Shortcut> getAllShortcuts() {
        return service.getAllShortcuts();
    }
}
