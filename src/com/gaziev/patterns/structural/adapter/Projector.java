package com.gaziev.patterns.structural.adapter;

public class Projector {

    public static void showContent(String content) {
       if(content.equals("*.mov")) {
           System.out.println("Plays video.mov");
       } else {
           System.out.println("Invalid video format");
       }
    }
}
