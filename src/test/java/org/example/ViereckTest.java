package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ViereckTest {

    Viereck viereck = new Viereck(10,20,-15,1);
    Viereck viereck2 = new Viereck(10,20,0.33,0.4);
    @Test
    public void berechneUmfang() {
        assertEquals(-30,viereck.berechneUmfang(),0);
    }

    @Test
    public void berechneFläche() {
        assertEquals(-15,viereck.berechneUmfang(),0);
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