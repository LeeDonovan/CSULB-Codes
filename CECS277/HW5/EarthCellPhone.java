import java.io.*;
import java.lang.*;

public interface EarthCellPhone 
{
        public void sendMessage(String languageType, String fileName) throws InvalidLanguageException;
        public void readMessage(String fileName);
}



