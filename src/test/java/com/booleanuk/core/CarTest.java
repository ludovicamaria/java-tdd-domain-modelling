package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {
    @Test
    void canInstantiateNewCarAndAssignItABrand(){
        // 1. Set up
        Car car = new Car();
        String brand = "BMW";

        // 2. Execute
        String message = car.IsOfBrand(brand);

        // 3. Verify
        assertEquals("BMW", message);
    }
}
