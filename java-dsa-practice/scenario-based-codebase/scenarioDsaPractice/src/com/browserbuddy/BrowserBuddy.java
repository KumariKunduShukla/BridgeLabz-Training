package com.browserbuddy;

public class BrowserBuddy {
	public static void main(String[] args) {

        BrowserManager manager = new BrowserManager();

        manager.openNewTab("google.com");
        BrowserTab tab = manager.getCurrentTab();

        tab.visit("youtube.com");
        tab.visit("chatgpt.com");

        tab.back();
        tab.forward();

        manager.closeCurrentTab();
        manager.restoreClosedTab();
    }
}