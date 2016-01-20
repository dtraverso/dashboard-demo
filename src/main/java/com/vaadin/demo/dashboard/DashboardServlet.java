package com.vaadin.demo.dashboard;

import com.vaadin.addon.touchkit.server.TouchKitServlet;
import com.vaadin.addon.touchkit.settings.TouchKitSettings;
import javax.servlet.ServletException;

import com.vaadin.server.VaadinServlet;

@SuppressWarnings("serial")
public class DashboardServlet extends TouchKitServlet {

    @Override
    protected final void servletInitialized() throws ServletException {
        super.servletInitialized();

        TouchKitSettings s = getTouchKitSettings();

        String contextPath = getServletConfig().getServletContext().getContextPath();
        s.getApplicationIcons().addApplicationIcon(contextPath + "/VAADIN/themes/dashboard/img/app-icon.png");
        s.getApplicationCacheSettings().setCacheManifestEnabled(true);
        getService().addSessionInitListener(new DashboardSessionInitListener());
    }
}