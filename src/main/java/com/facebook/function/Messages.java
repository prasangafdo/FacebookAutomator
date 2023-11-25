package com.facebook.function;

import com.facebook.page.MessagesPage;

public class Messages {

    private static final MessagesPage messages = new MessagesPage();

    public static void gatherNumberOfTreads(){
        messages.gatherNumberOfTreads();
    }
}
