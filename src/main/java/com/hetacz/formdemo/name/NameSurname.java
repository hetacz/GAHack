package com.hetacz.formdemo.name;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class NameSurname {

    private String name;
    private String surname;
}
