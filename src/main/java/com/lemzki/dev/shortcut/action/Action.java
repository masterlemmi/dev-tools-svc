package com.lemzki.dev.shortcut.action;

import com.lemzki.dev.shortcut.Shortcut;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "APP_ACTION")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Action {

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String action;

    @OneToMany(
            mappedBy = "action",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @EqualsAndHashCode.Exclude
    private List<Shortcut> shortcuts = new ArrayList<>();

    public void addShortcut(Shortcut shortcut) {
        this.shortcuts.add(shortcut);
        shortcut.setAction(this);
    }

    public void removeShortcut(Shortcut shortcut) {
        this.shortcuts.remove(shortcut);
        shortcut.setAction(null);
    }

}
