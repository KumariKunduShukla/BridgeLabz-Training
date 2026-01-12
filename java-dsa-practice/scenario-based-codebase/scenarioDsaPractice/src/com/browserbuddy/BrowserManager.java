package com.browserbuddy;

import java.util.Stack;

public class BrowserManager {
	private Stack<BrowserTab> closedTabs = new Stack<>();
    private BrowserTab currentTab;

    public void openNewTab(String homepage) {
        currentTab = new BrowserTab(homepage);
        System.out.println("New tab opened with: " + homepage);
    }

    public BrowserTab getCurrentTab() {
        return currentTab;
    }

    public void closeCurrentTab() {
        if (currentTab != null) {
            closedTabs.push(currentTab);
            System.out.println("Tab closed");
            currentTab = null;
        }
    }

    public void restoreClosedTab() {
        if (!closedTabs.isEmpty()) {
            currentTab = closedTabs.pop();
            System.out.println("Tab restored. Current page: " +
                               currentTab.getCurrentPage());
        } else {
            System.out.println("No closed tabs to restore");
        }
    }
}