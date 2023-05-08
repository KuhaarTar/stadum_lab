package ua.lviv.iot.algo.part1.stadiumLab.writer;

import ua.lviv.iot.algo.part1.stadiumLab.models.SportComplex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SportComplexWriter {
    private final static String FILENAME = "table.csv";
    private final static List<String> printedClasses = new ArrayList<>();
    public void writeToFile(List<SportComplex> sportComplexes) {
        if (sportComplexes.isEmpty()) {
            return;
        }
        sportComplexes.sort(Comparator.comparing(g -> g.getClass().getName()));
        try( FileWriter fileWriter = new FileWriter(FILENAME);) {
            for (SportComplex sportComplex : sportComplexes) {
                String className = sportComplex.getClass().getName();
                if (!printedClasses.contains(className)) {
                    String header = sportComplex.getHeaders();
                    fileWriter.write(header);
                    fileWriter.write("\n");
                    printedClasses.add(className);
                }
                String csv = sportComplex.toCSV();
                fileWriter.write(csv);
                fileWriter.write("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
