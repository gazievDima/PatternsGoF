package com.gaziev.patterns.structural.adapter;

public class Projector {

    public static String showContent(String content) {
       if(content.equals("*.mov")) {
           return "Plays video.mov";
       } else {
           return "Invalid video format";
       }
    }
}
