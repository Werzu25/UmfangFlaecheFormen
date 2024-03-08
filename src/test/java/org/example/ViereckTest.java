package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ViereckTest {

    Viereck viereck = new Viereck(10,20,-15,1);
    @Test
    public void berechneUmfang() {
        assertEquals(-30,viereck.berechneUmfang());
    }

    @Test
    public void berechneFläche() {
    }

    @Test
    public void getLänge() {
    }

    @Test
    public void setLänge() {
    }

    @Test
    public void getBreite() {
    }

    @Test
    public void setBreite() {
    }
}