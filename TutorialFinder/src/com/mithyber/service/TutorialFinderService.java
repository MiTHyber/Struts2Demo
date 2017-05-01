package com.mithyber.service;

public class TutorialFinderService {

    public String getBestTutorialSite(String language) {
	if ("java".equals(language))
	    return "Youtube";
	else
	    return "It's still youtube I guess";
    }
}
