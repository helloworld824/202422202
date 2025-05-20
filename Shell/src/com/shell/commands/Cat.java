package com.shell.commands;

import com.shell.Command;
import com.shell.Parser;
import com.shell.env.EnvironmentVariable;

public class Cat extends Command {

    public Cat(EnvironmentVariable env) {
        super(env);
    }

    @Override
    public void execute(Parser parser) {
        String[] args = parser.getArgs();
        if (args.length >= 3) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < args.length; i++) {
                sb.append(args[i]);
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("Usage: cat <arg1> <arg2>");
        }
    }
}
