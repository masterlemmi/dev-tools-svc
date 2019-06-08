package com.lemzki.dev.plugin;


import com.lemzki.dev.application.Application;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "PLUGIN")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Plugin {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String link;
    private String image;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_id")
    private Application app;

}
