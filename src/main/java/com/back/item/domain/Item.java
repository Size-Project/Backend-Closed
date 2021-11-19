package com.back.item.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String content;

    private int price;

    private int stockQuantity;

    private String imageUrl;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Builder
    public Item(
            Long id,
            String name,
            String content,
            int price,
            int stockQuantity,
            String imageUrl,
            Category category) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.imageUrl = imageUrl;
        this.category = category;
    }
}
