package com.lemzki.dev.shortcut;


import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public interface ShortcutController {

    static final String REST_BASE = "/ide";

    @GetMapping(REST_BASE + "/shortcuts")
    List<Shortcut> getAllShortcuts();


}
