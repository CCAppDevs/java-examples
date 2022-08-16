package main;

public class StaticLogger {

	public static void Log(String message) {
		System.out.println("LOG - " + message);
	}
	
	public static void Warn(String message) {
		System.out.println("WARN - " + message);
	}
	
	public static void Error(String message) {
		System.out.println("ERROR - " + message);
	}

}
