package com.sample;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by konishiyuji on 2016/03/05.
 */
public class MainTest {

    @org.junit.Test
    public void testAdd() throws Exception {
        Main m = new Main();

        assertThat(m.add(3, 4), is(7));
    }
}