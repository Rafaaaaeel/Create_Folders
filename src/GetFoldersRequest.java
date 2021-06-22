import javax.swing.*;
import java.io.File;

public class GetFoldersRequest {
    private String foldersRequestAnswer;
    private String[] foldersSplitValue;

    public void foldersRequestToUser(){
        this.foldersRequestAnswer = JOptionPane.showInputDialog("Files Split by 'white-space'");
        splitTheFoldersRequestInAList(foldersRequestAnswer);
    }
    private void splitTheFoldersRequestInAList(String foldersList){
        this.foldersSplitValue = foldersList.split(" ");
        createFolders(foldersSplitValue);
    }
    private void createFolders(String[] folders) {
        String path = "C:\\Users\\rafae\\Documents\\TEST FOLDER\\";
        for (String i : folders) {
            File fileCreator = new File(path + i);
            if (fileCreator.exists()){
                System.out.println("File does exist: " + i);
                continue;
            }else{
                System.out.println("Create folder: " + i);
            }
            fileCreator.mkdir();
        }
    }
}