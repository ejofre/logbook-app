package com.rgfp.psd.logbook.domain;

import com.rgfp.psd.logbook.service.NoteService;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class NoteTest {

    @Test
    public void getSumaryPrueba() {

        Note note = new Note();
        note.setContent("12345678901234");


        String resultado = "";
        resultado = note.getSummary();
        assertEquals("1234567890", resultado);

    }


    @Test
    public void getSumaryMenosDe10Caracteres() {

        Note note = new Note();
        note.setContent("1234567");


        String resultado = "";
        resultado = note.getSummary();
        assertEquals("1234567", resultado);

    }


    @Test
    public void getSumaryVacio() {

        Note note = new Note();
        note.setContent("");


        String resultado = "";
        resultado = note.getSummary();
        assertEquals("", resultado);

    }

    @Test
    public void getSumaryNulo() {

        Note note = new Note();
        note.setContent(null);


        String resultado = "";
        resultado = note.getSummary();
        assertEquals("", resultado);

    }

    /*
    @Test
    public void clonePrueba()
    {
        Note nota1 = new Note();
        nota1.setContent("Hola mundo");
        nota1.
        Note nota2= nota1.clone();


    }
    */


}