package com.shell.commands;

import com.shell.Command;
import com.shell.Parser;
import com.shell.env.EnvironmentVariable;

import java.util.ArrayList;

public class History extends Command {
	private ArrayList<String> history;

	public History(EnvironmentVariable env) {
		super(env);
		history = new ArrayList<>();
	}

	public void add(String input) {
		history.add(input);
	}

	@Override
	public void execute(Parser parser) {
		String[] args = parser.getArgs();
		int count = history.size();
		if (args.length == 2) {
			try {
				int num = Integer.parseInt(args[1]);
				count = Math.min(num, history.size());
			} catch (NumberFormatException e) {
				System.out.println("Invalid number argument");
			}
		}
		for (int i = history.size() - count; i < history.size(); i++) {
			System.out.println("\t" + (i) + " " + history.get(i));
		}
	}
}
