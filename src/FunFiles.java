/*
* HÄR SKRIVER MAN VAD KLASSEN GÖR OCH VEM SOM HAR SKAPAT DEN
 */
import java.io.File;
import java.io.IOException;

public class FunFiles {
    //attribut

    //konstruktor
    public FunFiles() {
        //findFiles(); //kör findFiles när FunFiles skapas
        createFile();
    }

    //metoder

    /*
    *   Finds all files
    */
    public void findFiles() {
        File myPath = new File("C:\\Programmering2\\Filer\\src\\Mapp"); //Sätt in filnamn mellan ""
        String[] allFiles = myPath.list(); //Lista av allt i vår allFiles
        for (String filenames : allFiles) { //För alla strings i allFiles
            System.out.println(filenames); //Skriver ut stringen
        }
    }

    /*
    *   Create a new file if the file does not already exist
    */
    public void createFile() {
        File myFile = new File("test.txt");
        try {
            if (myFile.createNewFile()) { //Körs om filen inte redan finns
                System.out.println("File added");
            }
            else { //Om filen redan finns
                System.out.println("File already exists");
            }
        } catch (IOException e) { //Input output exception
            System.out.println("Can't do - ERROR");
            e.printStackTrace();
        }
    }
}
