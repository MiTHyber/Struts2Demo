package com.mithyber.action;

import com.mithyber.service.TutorialFinderService;

public class TutorialAction {

    // member variable with getter for jsp (value stack)
    private String bestTutorialSite;
    // member variable for get [or post - it doesn't matter] parameter of request (automatically works if parameter has
    // the same name - that's work of interceptor and transfer is done through the value stack again )
    private String language;

    public String execute() {
	TutorialFinderService tutorialFinderService = new TutorialFinderService();
	setBestTutorialSite(tutorialFinderService.getBestTutorialSite(getLanguage()));
	return "success";
    }

    public String getBestTutorialSite() {
	return bestTutorialSite;
    }

    public void setBestTutorialSite(String bestTutorialSite) {
	this.bestTutorialSite = bestTutorialSite;
    }

    public String getLanguage() {
	return language;
    }

    public void setLanguage(String language) {
	this.language = language;
    }
}
