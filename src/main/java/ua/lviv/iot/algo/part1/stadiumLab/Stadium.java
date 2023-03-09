package ua.lviv.iot.algo.part1.stadiumLab;
import lombok.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Stadium {
    String name;
    int capacity;
    int currentAttendance;
    String homeTeam;
    String awayTeam;
    static Stadium instance;
    static Stadium getInstance() {
        if (instance == null) {
            instance = new Stadium();
        }
        return instance;
    }
    void addAttendies(int count){
        if ( currentAttendance!=capacity ) {
            currentAttendance += count;
        } else {
            System.out.println("Stadium is full");
        }
    }
    void decreaseAttendance () {
        if (currentAttendance-100<0){
            currentAttendance=0;
        } else {
            currentAttendance=currentAttendance-100;
        }
    }
    void changeHomeTeam(String teamName) {
        homeTeam=teamName;
    }
    void changeAwayTeam(String teamName){
        awayTeam=teamName;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", currentAttendance=" + currentAttendance +
                ", homeTeam='" + homeTeam + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                '}';
    }

    public static void main(String[] args) {
        int icrement=0;

        Stadium [] objects = new Stadium[4];
        objects[0]= new Stadium();
        objects[1]= new Stadium("CityStadium",1000,450,"Blue team","RedTeam");
        objects[2]= getInstance();
        objects[3]= getInstance();

        while (icrement>=0 && icrement< objects.length) {
            System.out.println(objects[icrement].toString());
            icrement++;
        }
    }
}