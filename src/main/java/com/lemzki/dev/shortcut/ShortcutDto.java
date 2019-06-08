package com.lemzki.dev.shortcut;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ShortcutDto {
    private Long id;
    private String eclipse;
    private String intelliJ;
    private String vsCode;
    private String description;
}
