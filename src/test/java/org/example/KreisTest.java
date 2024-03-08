package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class KreisTest {

    Kreis kreis = new Kreis(200, 200, 80);
    @Test
    public void berechneUmfang() {
        assertEquals(502.6548245743669, kreis.berechneUmfang(), 0.0000000000001);
    }

    @Test
    public void berechneFläche() {
        assertEquals(20106.1912180556, kreis.berechneFläche(), 0.0000000000001);
    }
}
