package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {
    DashaMap map = new DashaMap();
    @Test
    public void setTest(){
        map.set("Dog", 1);

        Assert.assertEquals("1", map.get("Dog"));
    }

    @Test
    public void deleteTest(){
        map.set("Hero", 1);
        map.delete("Hero");

        Assert.assertEquals(0, map.size());
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void getTest(){
        map.set("Dad", 1);
        map.set("Kid", 2);

        Assert.assertEquals("2", map.get("Kid"));
    }

    @Test
    public void isEmptyTest(){
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void isEmptyTest2(){
        map.set("Test", 1);
        Assert.assertFalse(map.isEmpty());
    }

    @Test
    public void sizeTest(){
        map.set("Test", 1);
        map.set("Test2", 2);
        map.set("Test3", 3);

        Assert.assertEquals(3, map.size());
    }
    @Test
    public void bucketSizeTest(){
        map.set("Lab", 1);
        map.set("Lab2", 2);
        Integer expected = 2;
        Assert.assertEquals(expected, map.bucketSize("l"));
    }

    @Test
    public void bucketSizeTest2(){
        map.set("Lab3", 1);
        map.set("Lab4", 2);
        Integer expected = 0;
        Assert.assertEquals(expected, map.bucketSize("j"));
    }

}