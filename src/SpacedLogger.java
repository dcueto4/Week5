
public class SpacedLogger implements Logger {

	
	String str;
	@Override
	public void Log(String str) {
		String holder = "";
		for(int i = 0; i < str.length(); i++) {
			holder = holder + str.charAt(i) + " ";
		}
		System.out.println("\n" + holder + "\n");
		
	}

	@Override
	public void Error(String str) {
		String holder = "";
		for(int i = 0; i < str.length(); i++) {
			holder = holder + str.charAt(i) + " ";
		}
		System.out.println("Error: " + holder + "\n");
		
	}
}
