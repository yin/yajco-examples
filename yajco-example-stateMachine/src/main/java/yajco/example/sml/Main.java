package yajco.example.sml;

import java.io.InputStreamReader;
import java.io.Reader;

import yajco.example.sml.model.StateMachine;
//import yajco.example.sml.parser.StateMachineParser;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader reader = new InputStreamReader(Main.class.getResourceAsStream("/machine.sml"));
        StateMachine machine =null;// new StateMachineParser().parse(reader);

        System.out.println("OUTPUT: ");
        System.out.println(machine);
    }
}
