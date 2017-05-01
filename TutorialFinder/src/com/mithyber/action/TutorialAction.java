package com.mithyber.action;

import com.mithyber.service.TutorialFinderService;

public class TutorialAction {

    private String bestTutorialSite;

    public String execute() {
	TutorialFinderService tutorialFinderService = new TutorialFinderService();
	setBestTutorialSite(tutorialFinderService.getBestTutorialSite());
	return "success";
    }

    public String getBestTutorialSite() {
	return bestTutorialSite;
    }

    public void setBestTutorialSite(String bestTutorialSite) {
	this.bestTutorialSite = bestTutorialSite;
    }
}
