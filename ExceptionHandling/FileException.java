import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class FileProcessingException extends Exception { 
    public FileProcessingException(String message) { 
        super(message);
     }
     }

class FileHandler { 
    public static void readFile(String filePath) throws FileProcessingException {
         try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
             System.out.println(br.readLine()); 
            }
             catch (IOException e) {
                 throw new FileProcessingException("Error reading file: " + e.getMessage()); 
                } 
            } }
         public   class FileException{
                public static void main(String[] args) {
                    FileHandler f=new FileHandler();
                    try{
                    f.readFile("C:\\TechM Training\\java\\Arrays.java");
                }
                catch(FileProcessingException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    

