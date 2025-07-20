package com.example.myassssmentapplication

import org.junit.Test
import org.junit.Assert.*

class EntityUnitTest {

    @Test
    fun entity_isInitializedCorrectly() {
        val testEntity = Entity(
            property1 = "AAPL",
            property2 = "Stock",
            description = "Shares of Apple Inc."
        )

        assertEquals("AAPL", testEntity.property1)
        assertEquals("Stock", testEntity.property2)
        assertEquals("Shares of Apple Inc.", testEntity.description)
    }
}
