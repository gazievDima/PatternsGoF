package com.gaziev.patterns.structural.facade;

import com.gaziev.patterns.structural.facade.services.AdsService;
import com.gaziev.patterns.structural.facade.services.InfoService;
import com.gaziev.patterns.structural.facade.services.TrackerService;

public class Services {
    private final AdsService adsService = new AdsService();
    private final InfoService infoService = new InfoService();
    private final TrackerService trackerService = new TrackerService();

    public String start() {
        int id = adsService.getAdsID("com.example.project");
        String info = infoService.getInfoApp(id);
        return trackerService.sendInfoApp(info);
    }
}
