package ua.lviv.iot.algo.part1.stadiumLab;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SportComplexWriterTest {
    private final static String EXPECTED_FILE = "expected.csv";
    private final static String RESULT_FILE = "table.csv";
    private static final List<SportComplex> complexList = new LinkedList<>();
    private File expectedFile;
    private File resultFile;
    private SportComplexWriter complexWriter;

    @BeforeEach
    public void setUp(){

        complexList.add(new SwimmingPool("Lviv central pool", 200,
                50, 20, 50, 5));
        complexList.add(new SwimmingPool("Lviv central pool", 200,
                50, 20, 50, 5));
        complexList.add(new Stadium("Olympic stadium", 10000,
                8540, "Team of dragons", "Team of Black"));
        complexList.add(new FootballField("Silmash", 200, 50, 300, 100, "Natural grass"));
        complexList.add(new Gym("UprisingTiger", 300,
                100, 150, "5$", 7));
        complexList.add(new Gym("UprisingTiger", 300,
                100, 150, "5$", 7));

        complexWriter = new SportComplexWriter();
        expectedFile = new File(EXPECTED_FILE);
        resultFile = new File(RESULT_FILE);
    }

    @AfterEach
    public void afterEachTestCleanup(){
        resultFile.delete();
    }

    @Test
    public void emptyListInParameter(){
        List<SportComplex> list = new LinkedList<>();
        complexWriter.writeToFile(list);
        assertFalse(resultFile.exists());
    }

    @Test
    public void checkCorrectnessOfTheWriting(){
        try {
            complexWriter.writeToFile(complexList);
            List<String> expectedLines = Files.readAllLines(Path.of(EXPECTED_FILE));
            List<String> resultLines = Files.readAllLines(Path.of(RESULT_FILE));
            assertTrue(expectedLines.equals(resultLines));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void checkFileOnExisting(){
        complexWriter.writeToFile(complexList);
        assertTrue(resultFile.exists());
    }

//    @Test
//    public void checkFileOverwrite(){
//        try {
//            FileWriter writer = new FileWriter("expected.csv");
//            writer.write("Hello world on java !");
//            complexWriter.writeToFile(complexList);
//            List<String> expectedLines = Files.readAllLines(Path.of(EXPECTED_FILE));
//            List<String> resultLines = Files.readAllLines(Path.of(RESULT_FILE));
//            assertTrue(expectedLines.equals(resultLines));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }