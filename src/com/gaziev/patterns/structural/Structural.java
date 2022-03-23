package com.gaziev.patterns.structural;

import com.gaziev.patterns.Patterns;
import com.gaziev.patterns.structural.adapter.ConverterAdapter;
import com.gaziev.patterns.structural.adapter.NetworkSource;
import com.gaziev.patterns.structural.adapter.Projector;

public class Structural extends Patterns {

    public static void show() {
        printTitle("STRUCTURAL");
        exampleAdapter();
    }

    private static void exampleAdapter() {
        String content = NetworkSource.getContent();
        Projector.showContent(content); //show error content type
        Projector.showContent(ConverterAdapter.convert(content)); //successful use of data
    }
}
