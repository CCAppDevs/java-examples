package main;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILogger Logger = new ConsoleLogger();
		
		Logger.Log("This goes to the console");
		Logger.Warn("This is a warning");
		
		Logger = new FileLogger("test.txt");
		Logger.Log("this is a test of the file system");
		Logger.Warn("this is a second message");
		
		
		
		StaticLogger.Log("this is a static method");
		StaticLogger.Warn("this is a static method");
	}

}
