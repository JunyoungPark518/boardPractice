package factory;

import domain.Command;

public class CommandFactory {
	public static Command create(String directory, String action, String page) {
		return new Command(directory, action, page);
	}
}
