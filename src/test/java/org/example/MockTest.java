package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class MockTest {
    @Test
    void testMock() {
        var list = mock(List.class);

        when(list.get(0)).thenReturn("Arif");
        when(list.get(10)).thenReturn("Ahmed");
        when(list.get(200)).thenReturn("Munna");

        System.out.println(list.get(0));
        System.out.println(list.get(10));
        System.out.println(list.get(200));

        verify(list, times(1)).get(0);
        verify(list, times(0)).get(1);
        verify(list, times(1)).get(10);
        verify(list, times(1)).get(200);
    }
}
