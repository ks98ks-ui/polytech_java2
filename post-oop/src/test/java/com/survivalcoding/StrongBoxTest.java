package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StrongBoxTest {
    @Test
    @DisplayName("내구도가 0 이된 다음 회차엔 금고안의 제품이 나와야 한다")
    void UNKNOWN() {
        StrongBox<KeyType> strongBox = new StrongBox<>(KeyType.PADLOCK);
        strongBox.put(KeyType.PADLOCK);
        for (int i = 0; i < 1024; i++) {
            assertNull(strongBox.get());

        }

        assertEquals(KeyType.PADLOCK, strongBox.get());
    }
}