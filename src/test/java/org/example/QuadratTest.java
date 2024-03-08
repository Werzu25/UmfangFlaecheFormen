package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuadratTest {

    Quadrat quader=new Quadrat(3,3,5,5);
    @Test
    public void berechneUmfang() {
        assertEquals(20,quader.berechneUmfang(),0.0);
    }

    @Test
    public void berechneFläche() {
        assertEquals(25,quader.berechneFläche(),0.0);
    }
}