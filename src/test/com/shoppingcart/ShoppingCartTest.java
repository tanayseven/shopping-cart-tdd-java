package com.shoppingcart;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class ShoppingCartTest {

    private ShoppingCart shoppingCart;

    @Before
    public void createAShoppingCart() {
        // Given
        shoppingCart = new ShoppingCart();
    }

    private void addToCartHeadFirstJava() {
        shoppingCart.addItem("Head First Java", 400);
    }

    private void addToCartTDDByExample() {
        shoppingCart.addItem("TDD by Example - Kent Beck", 600);
    }

    private void removeFromCartTDDByExample() {
        shoppingCart.removeItem("TDD by Example - Kent Beck");
    }

    private void removeFromCartHeadFirstJava() {
        shoppingCart.removeItem("Head First Java");
    }

    @Test
    public void newlyCreatedShoppingCartShouldHaveNoItems() {
        // Then
        assertEquals(0, shoppingCart.totalItems());
    }

    @Test
    public void theShoppingCartShouldHaveOneItemWhenWeAddIt() {
        // When
        addToCartHeadFirstJava();

        // Then
        assertEquals(1, shoppingCart.totalItems());
    }

    @Test
    public void theShoppingCartShouldHaveNoItemsWhenWeAddAnItemAndThenRemoveIt() {
        // When
        addToCartHeadFirstJava();
        removeFromCartHeadFirstJava();

        //Then
        assertEquals(0, shoppingCart.totalItems());

    }

    @Test
    public void theShoppingCartShouldHaveOneItemWhenWeAddTwoItemsAndRemoveOneItem() {
        // When
        addToCartHeadFirstJava();
        addToCartTDDByExample();
        removeFromCartHeadFirstJava();

        // Then
        assertEquals(1, shoppingCart.totalItems());
    }

    @Test
    public void theCostOfOneItemHeadFirstJavaAddedToTheShoppingCart() {
        // When
        addToCartHeadFirstJava();

        // Then
        assertEquals(400, shoppingCart.totalCost());
    }

    @Test
    public void theCostOfHeadFirstJavaAndTDDByExample() {
        // When
        addToCartHeadFirstJava();
        addToCartTDDByExample();

        // Then
        assertEquals(1000, shoppingCart.totalCost());
    }

    @Test
    public void theTotalCostOfAddingHeadFirstJavaAndTDDByExampleAndRemovingHeadFirstJava() {
        // When
        addToCartTDDByExample();
        addToCartHeadFirstJava();
        removeFromCartTDDByExample();

        // Then
        assertEquals(400, shoppingCart.totalCost());
    }
}
