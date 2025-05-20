package com.shell;

import com.shell.env.EnvironmentVariable;

public abstract class Command {
    protected EnvironmentVariable env;

    public Command(EnvironmentVariable env) {
        this.env = env;
    }

    public abstract void execute(Parser parser);

    protected String getEnv(String key) {
        return env.getValue(key);
    }

    protected boolean isEnv(String str) {
        return str != null && env.getValue(str) != null;
    }
}
