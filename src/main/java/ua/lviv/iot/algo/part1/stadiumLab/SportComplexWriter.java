package ua.lviv.iot.algo.part1.stadiumLab;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.io.FileWriter;
import java.util.Map;

public class SportComplexWriter {
    private final static String FILENAME = "table.csv";
    private final static Map<String,List<SportComplex>> map = new HashMap<>();

    public void writeToFile(List<SportComplex> sportComplexes) {
        if (sportComplexes.isEmpty()) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILENAME);
        for(SportComplex sportComplex:sportComplexes) {
            if (map.containsKey(sportComplex.getClassName())) {
                map.get(sportComplex.getClassName()).add(sportComplex);
            }else {
                List<SportComplex> list = new LinkedList<>();
                list.add(sportComplex);
                map.put(sportComplex.getClassName(),list);
            }
        }
        for (Map.Entry<String, List<SportComplex>> entry : map.entrySet()) {
            String header = entry.getValue().get(0).getHeaders();
            fileWriter.write(header);
            fileWriter.write("\n");
            for (SportComplex sportComplex: entry.getValue() ){
                String csv = sportComplex.toCSV();
                fileWriter.write(csv);
                fileWriter.write("\n");
            }
        }
        fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
