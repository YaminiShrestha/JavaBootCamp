package demo.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    private Order order;

    @Before
    public void OrderTest() {
        order = new Order();
    }

    @Test
    public void getPriceWhenEquals() {
        //given
        order.setPrice(20.0);
        //when
        double expectedPrice = order.getPrice();
        //then
        assertEquals(expectedPrice, 20.0);
    }

    @Test
    public void getPriceWhenNotEquals() {
        //given
        order.setPrice(20.0);
        //when
        double expectedPrice = order.getPrice();
        //then
        assertNotEquals(expectedPrice, 45.0);
    }


    @Test
    public void shouldReturnSameWhenGetQuantity() {

        //given
        order.setQuantity(5);
        //when
        int quantity = order.getQuantity(5);
        //then
        assertSame(quantity, 5);
    }

    @Test
    public void setPrice() {
        Order returnPrice = order.setPrice(30.0);
        assertEquals(returnPrice, order);
    }

    @Test
    public void shouldReturnNotSameWhenGetQuantity() {

        //given
        order.setQuantity(5);
        //when
        int quantity = order.getQuantity(5);
        //then
        assertNotSame(quantity, 9);
    }

    @Test
    public void setQuantity() {
        Order returnOrder = order.setQuantity(3);
        assertEquals(returnOrder, order);
    }

    @Test
    public void shouldReturnEqualWhenGetItemName() {
        //given
        order.setItemName("Apple");
        //when
        String expectedItemName = order.getItemName();
        //then
        assertEquals(expectedItemName, "Apple");
    }

    @Test
    public void shouldReturnNotEqualWhenGetItemName() {
        //given
        order.setItemName("Apple");
        //when
        String expectedItemName = order.getItemName();
        //then
        assertNotEquals(expectedItemName, "Orange");
    }

    @Test
    public void setItemName() {
        Order returnName = order.setItemName("Apple");
        assertEquals(returnName, order);
    }

    @Test
    public void shouldReturnEqualWhenGetPriceWithTax() {
        //given
        order.setPriceWithTex(45.0);
        //when
        double expectedPrice = order.getPriceWithTex();
        //then
        assertEquals(expectedPrice, 45.0);
    }

    @Test
    public void setPriceWithTax() {

    }
}