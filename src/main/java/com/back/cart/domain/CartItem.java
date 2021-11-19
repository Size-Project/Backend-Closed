package com.back.cart.domain;

import javax.persistence.Embeddable;

@Embeddable
public class CartItem {
    private Long itemId;

    private int itemAmount;
}
