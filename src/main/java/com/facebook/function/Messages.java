package com.facebook.function;

import com.facebook.page.MessagesPage;

public class Messages {

    private static final MessagesPage messages = new MessagesPage();

    public static void gatherNumberOfTreads() throws InterruptedException {
        messages.gatherNumberOfTreads();
    }
    public static void deleteChats() {
        messages.deleteChats();
    }

}
