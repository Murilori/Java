package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void deveRetornar5(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.soma(2,3);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void deveRetornar8 (){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.subtracao(16,8);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void deveretornar1(){
        Application application = new Application();
        Integer expected = 1;
        Integer response = application.div(8,8);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void deveretornar16(){
        Application application = new Application();
        Integer expected = 16;
        Integer response = application.multiplicacao(8,2);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void deveserpar(){
        Application application = new Application();
        Boolean expected = true;
        Boolean response = application.par(4);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void compararmaior(){
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.compararmaior(10,6);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void impares(){
        Application application = new Application();
        Integer expected = 4;
        Integer response = application.impares(7);
        Assert.assertEquals(expected,response);
    }
    @Test
    public void maiusculas(){
        Application application = new Application();
        String expected = "TEXTO1";
        String response = application.maiusculas("texto1");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void minusculas(){
        Application application = new Application();
        String expected = "texto1";
        String response = application.minusculas("TEXTO1");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void quantidadeLetras(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.quantidadeLetras("DB1START");
        Assert.assertEquals(expected,response);
    }
    @Test
    public void quantidadeLetrasComEspaco(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.quantidadeLetrasComEspaco(" DB1START ");
        Assert.assertEquals(expected,response);
    }



}
