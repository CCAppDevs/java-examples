package main;

public interface ILogger {
	public void Log(String message);
	public void Warn(String message);
	public void Error(String message);
}
