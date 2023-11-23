package com.facebook.function;

import com.facebook.page.WallPage;

public class Wall {
    private static final WallPage wall = new WallPage();

    public static boolean isHomeButtonDisplaying(){
        return wall.isHomeButtonDisplaying();
    }
    public static void navigateToMessagesByURL(){
        wall.navigateToMessagesByURL();
    }
}
