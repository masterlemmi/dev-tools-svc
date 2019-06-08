package com.lemzki.dev.application;

import com.lemzki.dev.plugin.Plugin;
import com.lemzki.dev.shortcut.Shortcut;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="APPLICATION")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    //ECLIPSE, INTELLIJ, VSCODE,SUBLIME;
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    private String url;

    @OneToMany(
            mappedBy = "app",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @EqualsAndHashCode.Exclude

    private List<Plugin> plugins = new ArrayList<>();
    @OneToMany(
            mappedBy = "app",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @EqualsAndHashCode.Exclude
    private List<Shortcut> shortcuts = new ArrayList<>();

    public void addPlugin(Plugin plugin){
        this.plugins.add(plugin);
        plugin.setApp(this);
    }

    public void removePlugin(Plugin plugin){
        this.plugins.remove(plugin);
        plugin.setApp(null);
    }

    public void addShortcut(Shortcut shortcut){
        this.shortcuts.add(shortcut);
        shortcut.setApp(this);
    }

    public void removeShortcut(Shortcut shortcut){
        this.shortcuts.remove(shortcut);
        shortcut.setApp(null);
    }

}
