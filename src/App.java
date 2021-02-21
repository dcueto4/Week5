
public class App {

	public static void main(String[] args) {
		
		AsteriskLogger wordToLog = new AsteriskLogger();
		wordToLog.Log("Hello");
		wordToLog.Error("Unexpectedly");
		
		SpacedLogger wordToSpace = new SpacedLogger(); 
		wordToSpace.Log("Hello");
		wordToSpace.Error("Unexpectedly");
	}



}
