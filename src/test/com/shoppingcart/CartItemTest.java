package com.shoppingcart;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class CartItemTest {
    @Test
    public void createANewItemAndHaveNameCheckingMethod() {
        // Given
        CartItem cartItem = new CartItem();

        // When
        cartItem.addProduct("TDD By Example - Kent Beck");

        // Then
        assertTrue(cartItem.isItemName("TDD By Example - Kent Beck"));
    }

}
