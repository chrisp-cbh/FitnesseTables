import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileUtilities {
	private File theFile;
	public boolean createFile(String path) throws Exception{
		makeSureFileDoesntExist(path);
		theFile.createNewFile();
		return theFile.exists();
	}
	public void initialiseFileObject(String path) {
		theFile = new File(path);
	}
	public boolean appendTextToFile(String text,String path) throws FileNotFoundException{
		PrintWriter writer = new PrintWriter(path);
		writer.print(text);
		writer.close();
		return true;
	}
	public boolean makeSureFileDoesntExist(String path){
		initialiseFileObject(path);
		if(theFile.exists()){
			theFile.delete();
		}
		return !theFile.exists();
	}
}
