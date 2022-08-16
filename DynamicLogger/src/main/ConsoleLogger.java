package main;

public class ConsoleLogger implements ILogger {

	public ConsoleLogger() {}
	
	public void SillyMethod() {
		System.out.println("This is silly");
	}

	@Override
	public void Log(String message) {
		System.out.println("LOG - " + message);
	}

	@Override
	public void Warn(String message) {
		System.out.println("WARN - " + message);
	}

	@Override
	public void Error(String message) {
		System.out.println("ERROR - " + message);
	}

}
