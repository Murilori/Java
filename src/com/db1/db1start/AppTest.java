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
        Boolean reponse = application.par(4);
        Assert.assertEquals(expected,reponse);
    }
    @Test


}
