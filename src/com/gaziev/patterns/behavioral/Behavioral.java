package com.gaziev.patterns.behavioral;

import com.gaziev.patterns.Patterns;
import com.gaziev.patterns.behavioral.chain.valid.CheckAuthorization;
import com.gaziev.patterns.behavioral.chain.valid.childs.ValidEmpty;
import com.gaziev.patterns.behavioral.chain.valid.childs.ValidUser;
import com.gaziev.patterns.behavioral.chain.valid.childs.ValidWords;
import com.gaziev.patterns.behavioral.command.EndWorkCommand;
import com.gaziev.patterns.behavioral.command.StartWorkCommand;
import com.gaziev.patterns.behavioral.command.WriteCodeCommand;
import com.gaziev.patterns.behavioral.command.devs.JavaDeveloper;
import com.gaziev.patterns.behavioral.command.devs.PythonDeveloper;
import com.gaziev.patterns.behavioral.iterator.MyCollection;
import com.gaziev.patterns.behavioral.iterator.Square;
import com.gaziev.patterns.behavioral.mediator.Button;
import com.gaziev.patterns.behavioral.mediator.ButtonMediator;
import com.gaziev.patterns.behavioral.mediator.Mediator;
import com.gaziev.patterns.behavioral.mediator.RadioButton;
import com.gaziev.patterns.behavioral.memento.devs.AndroidDeveloper;
import com.gaziev.patterns.behavioral.memento.devs.Developer;
import com.gaziev.patterns.behavioral.memento.project.AndroidProject;
import com.gaziev.patterns.behavioral.memento.project.Project;
import com.gaziev.patterns.behavioral.memento.repositories.AndroidRepository;
import com.gaziev.patterns.behavioral.memento.repositories.Memento;
import com.gaziev.patterns.behavioral.observer.People;
import com.gaziev.patterns.behavioral.observer.WeatherStation;
import com.gaziev.patterns.behavioral.state.machine.CocktailMachine;
import com.gaziev.patterns.behavioral.state.machine.CoffeeMachine;
import com.gaziev.patterns.behavioral.state.machine.Machine;
import com.gaziev.patterns.behavioral.state.state.ChooseDrink;
import com.gaziev.patterns.behavioral.strategy.devs.*;
import com.gaziev.patterns.behavioral.strategy.projects.ServerProject;
import com.gaziev.patterns.behavioral.strategy.projects.WebSiteProject;
import com.gaziev.patterns.behavioral.template.NewsPage;
import com.gaziev.patterns.behavioral.template.WebSite;
import com.gaziev.patterns.behavioral.template.WelcomePage;
import com.gaziev.patterns.behavioral.visitor.Drawing;
import com.gaziev.patterns.behavioral.visitor.Rotate;
import com.gaziev.patterns.behavioral.visitor.Visitor;
import com.gaziev.patterns.behavioral.visitor.shapes.RoundShape;
import com.gaziev.patterns.behavioral.visitor.shapes.Shape;
import com.gaziev.patterns.behavioral.visitor.shapes.SquareShape;

public class Behavioral extends Patterns {

    public static void show() {
        printTitle("BEHAVIORAL");
        exampleObserver();
        exampleChain();
        exampleCommand();
        exampleIterator();
        exampleVisitor();
        exampleMediator();
        exampleMemento();
        exampleState();
        exampleTemplateMethod();
        exampleStrategy();
    }

    private static void exampleObserver() {
        println("//use observer pattern.");

        WeatherStation station = new WeatherStation("+23");
        People man = new People("Dima", 28);
        println("man temperature: " + man.getTemperature());

        station.observe(man);
        println("man temperature: " + man.getTemperature());
        station.setWeather("-13");
        println("man temperature: " + man.getTemperature());
        println("");
    }

    private static void exampleChain() {
        println("//use chain pattern.");

        CheckAuthorization validEmpty = new ValidEmpty();
        CheckAuthorization validUser = new ValidUser();
        CheckAuthorization validWords = new ValidWords();

        validEmpty.setNextCheck(validWords);
        validWords.setNextCheck(validUser);
        validEmpty.check("dima", "12345");
        println("");
    }

    private static void exampleCommand() {
        println("//use command pattern.");

        StartWorkCommand startWorkCommand = new StartWorkCommand();
        WriteCodeCommand writeCodeCommand = new WriteCodeCommand();
        EndWorkCommand endWorkCommand = new EndWorkCommand();

        JavaDeveloper javaDeveloper = new JavaDeveloper("Dima", "Android Developer");
        javaDeveloper.startWork(startWorkCommand);
        javaDeveloper.writeCode(writeCodeCommand);
        javaDeveloper.endWork(endWorkCommand);

        PythonDeveloper pythonDeveloper = new PythonDeveloper("Alexey", "Python Developer");
        pythonDeveloper.startWork(startWorkCommand);
        pythonDeveloper.writeCode(writeCodeCommand);
        pythonDeveloper.endWork(endWorkCommand);
        println("");
    }

    private static void exampleIterator() {
        println("//use iterator pattern.");

        MyCollection myCollection = new MyCollection();
        myCollection.add(new Square("green"));
        myCollection.add(new Square("orange"));
        myCollection.add(new Square("blue"));
        myCollection.add(new Square("red"));

        while (myCollection.hasNext()) {
            System.out.println(myCollection.getNext());
        }

        myCollection.remove(new Square("green"));
        myCollection.remove(new Square("orange"));

        while (myCollection.hasNext()) {
            System.out.println(myCollection.getNext());
        }
        println("");
    }

    private static void exampleVisitor() {
        println("//use visitor pattern.");

        Shape round = new RoundShape("yellow", "round");
        round.draw();

        Shape square = new SquareShape("blue", "square");
        square.draw();

        Visitor visitorRotate = new Rotate();
        round.action(visitorRotate);
        square.action(visitorRotate);

        Visitor visitorDrawing = new Drawing();
        round.action(visitorDrawing);
        square.action(visitorDrawing);
        println("");
    }

    private static void exampleMediator() {
        println("//use mediator pattern.");

        RadioButton button1 = new Button("ONE", false);
        RadioButton button2 = new Button("TWO", false);
        RadioButton button3 = new Button("THREE", false);

        RadioButton[] buttons = {button1, button2, button3};

        Mediator buttonMediator = new ButtonMediator(buttons);
        buttonMediator.select(button1);
        System.out.println("====");
        buttonMediator.select(button2);
        System.out.println("====");
        buttonMediator.select(button3);
        println("");
    }

    private static void exampleMemento() {
        println("//use memento pattern.");

        Developer developer = new AndroidDeveloper();
        Memento repository = new AndroidRepository();
        Project project = new AndroidProject("Android Project");

        project.updateCode(developer.writeCode(1.0f));
        System.out.println(project);

        repository.save(project.clone());

        project.updateCode(developer.writeCode(2.0f));
        System.out.println(project);

        project = repository.load();
        System.out.println(project);
        println("");
    }

    private static void exampleState() {
        println("//use state pattern.");

        Machine coffeeMachine = new CoffeeMachine("????????", new ChooseDrink());
        Machine cocktailMachine = new CocktailMachine("????????????????", new ChooseDrink());

        for(int i = 0; i < 3; i++) {
            coffeeMachine.doWork();
            coffeeMachine.changeState();
        }

        for(int i = 0; i < 3; i++) {
            cocktailMachine.doWork();
            cocktailMachine.changeState();
        }
        println("");
    }

    private static void exampleTemplateMethod() {
        println("//use template method pattern.");

        WebSite newsPage = new NewsPage("News page");
        WebSite welcomePage = new WelcomePage("Welcome page");

        newsPage.showPage();
        println("");
        welcomePage.showPage();
        println("");
    }

    private static void exampleStrategy() {
        println("//use strategy pattern.");

        FullstackDev fullstackDev = new FullstackDev("Artem");
        BackendDev backendDev1 = new BackendDev("Dima");
        WebDev webDev1 = new WebDev("Anna");

        ServerProject serverProject = new ServerProject();
        WebSiteProject webSiteProject = new WebSiteProject();


        serverProject.hiredDev(backendDev1);
        serverProject.hiredDev(fullstackDev);
        serverProject.doWork();

        webSiteProject.hiredDev(webDev1);
        webSiteProject.hiredDev(fullstackDev);
        webSiteProject.doWork();
        println("");
    }

}
