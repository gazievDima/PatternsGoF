package com.gaziev.patterns.structural.flyweight;

import java.util.HashMap;

public class DeveloperFactory {
    HashMap<String, Developer> devs = new HashMap<String, Developer>();

    public Developer getDeveloper(String devPosition) {
        if(devs.get(devPosition) == null) {
            switch(devPosition) {
                case "java": {
                    System.out.println("Java developer hired");
                    devs.put("java", new JavaDeveloper());
                }
                break;
                case "go": {
                    System.out.println("Go developer hired");
                    devs.put("go", new GoDeveloper());
                }
                break;
                case "python": {
                    System.out.println("Python developer hired");
                    devs.put("python", new PythonDeveloper());
                }
                break;
            }
        }

        return devs.get(devPosition);
    }
}
