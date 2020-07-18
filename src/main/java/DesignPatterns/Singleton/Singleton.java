package DesignPatterns.Singleton;


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class Singleton {

    private static int logID;
    private Date logDate;
    private String logContent;
    public static final Singleton INSTANCE = new Singleton();


    public void logWriter() throws IOException {
        Path path = Paths.get("testDump"); //C:\Users\micha\IdeaProjects\PracaDomowaOdTomasza\testDump

        File file = new File("C:\\Users\\micha\\IdeaProjects\\PracaDomowaOdTomasza\\testDump\\logX.txt");

        file.createNewFile();

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(logCreator());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (INSTANCE != null) {
            throw new IllegalStateException("Only one instance of singleton can be created");
        }
    }


    public String logCreator() {
        int logId = getLogID();
        Date logDate = getLogDate();
        String logContent = getLogContent();

        return logId + " " + logDate.toString() + " " + logContent;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int getLogID() {
        return logID;
    }

    public static void setLogID(int logID) {
        Singleton.logID = logID;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) throws IOException {
        Singleton.INSTANCE.logWriter();
        Singleton.INSTANCE.logCreator();


    }
}
