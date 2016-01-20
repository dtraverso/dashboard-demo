/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.demo.dashboard;

import com.vaadin.server.UIClassSelectionEvent;
import com.vaadin.server.UIProvider;
import com.vaadin.ui.UI;

/**
 *
 * @author dtraverso
 */
public class DashboardUIProvider extends UIProvider {

    @Override
    public Class<? extends UI> getUIClass(UIClassSelectionEvent event) {
        String userAgent = event.getRequest().getHeader("user-agent")
                .toLowerCase();

        if (userAgent.toLowerCase().contains("webkit")
                || userAgent.toLowerCase().contains("windows phone 8")
                || userAgent.toLowerCase().contains("windows phone 9")) {
            return DashboardUI.class;
        } else {
            return DashboardFallbackUI.class;
        }
    }
}