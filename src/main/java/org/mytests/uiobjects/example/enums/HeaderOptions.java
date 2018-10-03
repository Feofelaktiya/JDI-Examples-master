package org.mytests.uiobjects.example.enums;


//public enum HeaderOptions {
//
//
//    HEADER_OPTIONS("HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS");
//    public String home;
//    public String contactForm;
//    public String service;
//    public String metalsAndColors;
//
//    HeaderOptions(String firstTab, String secondTab, String thirdTab, String forthTab) {
//        this.home = firstTab;
//        this.contactForm = secondTab;
//        this.service = thirdTab;
//        this.metalsAndColors = forthTab;
//    }
//
//}

public enum HeaderOptions {
    Home("option - 1"),
    About("option - 3");
    public String value;

    HeaderOptions(String value) {

        this.value = value;
    }

    @Override
    public String toString() {

        return value;
    }
    }
