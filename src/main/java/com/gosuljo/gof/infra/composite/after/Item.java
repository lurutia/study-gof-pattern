package com.gosuljo.gof.infra.composite.after;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Item implements Component {
    private String name;
    private int price;
}
