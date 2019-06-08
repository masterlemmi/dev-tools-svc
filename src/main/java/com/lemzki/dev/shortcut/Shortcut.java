package com.lemzki.dev.shortcut;

import com.lemzki.dev.application.Application;
import com.lemzki.dev.shortcut.action.Action;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="SHORTCUT")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Shortcut {
    @Id
    @GeneratedValue
    private Long id;
    private String shortcutKey;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_id")
    private Application app;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "action_id")
    private Action action;
}
