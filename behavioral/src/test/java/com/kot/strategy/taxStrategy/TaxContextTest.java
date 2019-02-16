package com.kot.strategy.taxStrategy;

import com.kot.strategy.taxStrategy.domain.Country;
import com.kot.strategy.taxStrategy.domain.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxContextTest {

    @Test
    void calculateTax() {
        //given
        Product car = new Product("100");
        TaxContext taxContext = new TaxContext();

        //when
        String euTax = taxContext.calculateTax(car, Country.EU);
        String maltaTax = taxContext.calculateTax(car, Country.MALTA);

        //then
        assertEquals("50", euTax);
        assertEquals("00", maltaTax);
    }
}