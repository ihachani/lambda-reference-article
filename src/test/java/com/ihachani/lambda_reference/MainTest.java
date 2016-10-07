/*
 *    Copyright 2016 lonsomehell
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.ihachani.lambda_reference;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private final String OLD_WAY_OUTPUT = "Old way  speech\n";// \n was added because println is used.
    private final String LAMBDA_OUTPUT = "Lambda  speech\n";
    private final String METHOD_REFRENCE_OUTPUT = "Method Reference speech\n";

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void sanityTest() {
        String text = "hello";
        System.out.print(text);
        assertEqualsOutputStream(text);
    }

    private void assertEqualsOutputStream(String text) {
        assertEquals(text, outContent.toString());
    }

    @Test
    public void oldWayTest() {
        Main.oldWay();
        assertEqualsOutputStream(OLD_WAY_OUTPUT);
    }

    @Test
    public void lambdaTest() {
        Main.lambdaWay();
        assertEqualsOutputStream(LAMBDA_OUTPUT);
    }

    @Test
    public void referenceMethodTest() {
        Main.methodReferenceWay();
        assertEqualsOutputStream(METHOD_REFRENCE_OUTPUT);
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
