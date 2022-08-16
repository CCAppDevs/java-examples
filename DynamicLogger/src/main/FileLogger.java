package main;
import java.io.*;

public class FileLogger implements ILogger {
	private File myFile;

	public FileLogger(String path) {
		try {
			myFile = new File(path);
			
			if (myFile.createNewFile()) {
				System.out.println("File created: " + myFile.getName());
			} else {
				System.out.println("File already exists.");
				// TODO open existing file instead
			}
		} catch (IOException e) {
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
	}
	
	private void WriteMessage(String severity, String message) {
		try {
			FileWriter fw = new FileWriter(myFile, true);
			fw.write(severity + " - " + message + "\n");
			fw.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occured writing the file.");
			e.printStackTrace();
		}
	}

	@Override
	public void Log(String message) {
		WriteMessage("LOG", message);
	}

	@Override
	public void Warn(String message) {
		WriteMessage("WARN", message);
	}

	@Override
	public void Error(String message) {
		WriteMessage("ERROR", message);
	}

}
