/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.demo.dashboard;

import com.vaadin.addon.touchkit.extensions.OfflineMode;
import java.util.List;

/**
 *
 * @author dtraverso
 */
public class DashboardModeOfflineExtension extends OfflineMode{
    
    /*
    private final PersistOfflineTicketsServerRpc serverRpc = new PersistOfflineTicketsServerRpc() {
        @Override
        public void persistTickets(final List<String> tickets) {
            //DataUtil.persistTickets(tickets);
        }
    };*/

    public DashboardModeOfflineExtension() {
        //registerRpc(serverRpc);
    }
}