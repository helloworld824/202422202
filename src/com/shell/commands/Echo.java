package com.shell.commands;

import com.shell.Command;
import com.shell.Parser;
import com.shell.env.EnvironmentVariable;

public class Echo extends Command {

    public Echo(EnvironmentVariable env) {
        super(env);
    }

    @Override
    public void execute(Parser parser) {
        String[] args = parser.getArgs();
        for (int i = 1; i < args.length; i++) {
            if (isEnv(args[i])) {
                System.out.print(getEnv(args[i]) + " ");
            } else {
                System.out.print(args[i] + " ");
            }
        }
        System.out.println();
    }
}
