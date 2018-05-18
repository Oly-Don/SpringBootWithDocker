package com.south.oly;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ApplicationTest {
    Application application = new Application();

    @Test(testName = "测试首页打印内容", timeOut = 3000)
    public void testHome() {
        String result = application.home();
        assertEquals(result, "Hello Docker World." + "<br />Welcome to <a href='https://hub.docker.com/'>https://hub.docker.com/</a></li>");
    }

    @Test
    public void testMain() {
        Application.main(new String[]{"args"});
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme