/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author micha
 */
public class HandlerImplTest {

    private HandlerImpl instance;
    private ArrayList<String> list;
    String[] array = new String[4];

    @BeforeEach
    void init() {
        instance = new HandlerImpl();
    }

    /**
     * Test of arrayToArrayList method, of class HandlerImpl.
     */
    @DisplayName("ArrayToArrayList")
    @Test
    void testArrayToArrayList() {
        String str1 = "Test1";
        String str2 = "Test2";
        String str3 = "Test3";
        String[] data = new String[3];
        data[0] = str1;
        data[1] = str2;
        data[2] = str3;
        list = instance.arrayToArrayList(data);
        assertNotNull(list.get(1));
        assertFalse(list.isEmpty());
        for (int i = 0; i < data.length; i++) {
            String expected = data[i];
            String actual = list.get(i);
            assertEquals(expected, actual);

        }
    }

    /**
     * Test of splitString method, of class HandlerImpl.
     */
    @DisplayName("SplitString")
    @Test
    void testSplitString() {
        System.out.println("splitString");
        String str = "Hello, this text is long, please split it, so its easy to read";
        array[0] = "Hello";
        array[1] = " this text is long";
        array[2] = " please split it";
        array[3] = " so its easy to read";
        String[] expResult = array;
        String[] result = instance.splitString(str);
        assertNotNull(array[3]);
        assertFalse(array[3].isEmpty());
        assertArrayEquals(expResult, result);
    }
}
