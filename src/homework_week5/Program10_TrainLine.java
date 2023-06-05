package homework_week5;

import java.util.Scanner;

/**
 * 10.Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class Program10_TrainLine {
    public static void main(String[] args) {

        char result;
        String station[] = new String[]{
                "Stations", "Aldgate", "Borough", "Bank", "Baker Street", "Edgware Road", "Aldgate East", "Baker Street", "Green Oark",
                "Euston", "Liverpool Street", "London Bridge", "Waterloo", "Regent's Park", "Holborn", "Baker Street",
                "Paddington", "Bond Street", "Piccadilly Circus", "Warren Street",
                "Moorgate", "Oxford Circus", "St Paul", "Farringdon", "Bayswater", "Westminster", "Leicester Square",
                "Barbican", "Old Street", "Bond Street", "Waterloo", "Covent Garden", "Green Park", "Metropolitan"
        };
        String[][] trainline = new String[12][42];
        trainline[0][0] = "Metropolitan";
        trainline[0][1] = "Aldgate";
        trainline[0][2] = "LiverPool Street";
        trainline[0][3] = "Moor gate";
        trainline[0][4] = "Barbarian";

        trainline[1][0] = "Northern";
        trainline[1][1] = "London Bridge";
        trainline[1][2] = "Moor gate";
        trainline[1][3] = "Old Street";

        trainline[2][0] = "Waterloo & City";
        trainline[2][1] = "Bank";
        trainline[2][2] = "Waterloo";

        trainline[3][0] = "Bakerloo";
        trainline[3][1] = "Baker Street";
        trainline[3][2] = "Oxford";
        trainline[3][3] = "Piccadilly Circus";

        trainline[4][0] = "Central";
        trainline[4][1] = "Bank";
        trainline[4][2] = "st Paul";
        trainline[4][3] = "Bond Street";

        trainline[5][0] = "Edgware Road";
        trainline[5][1] = "Baker Street";
        trainline[5][2] = "Farringdon";
        trainline[5][3] = "Barbican";

        trainline[6][0] = "DLR";
        trainline[6][1] = "Bank";

        trainline[7][0] = "District";
        trainline[7][1] = "Edgware Road";
        trainline[7][2] = "Paddington";
        trainline[7][3] = "Bayswater";

        trainline[8][0] = "Hammersmith & City";
        trainline[8][1] = "Aldgate East";
        trainline[8][2] = "Liverpool Street";
        trainline[8][3] = "Moorgate";
        trainline[8][4] = "Barbican";

        trainline[9][0] = "Jubilee";
        trainline[9][1] = "Baker Street";
        trainline[9][2] = "Boud Street";
        trainline[9][3] = "Westminster";
        trainline[9][4] = "Waterloo";

        trainline[10][0] = "Piccadilly";
        trainline[10][1] = "Green Dark";
        trainline[10][2] = "Piccadilly Circus";
        trainline[10][3] = "Leicester Square";
        trainline[10][4] = "Covet Garden";

        trainline[11][0] = "Victoria";
        trainline[11][1] = "Easton";
        trainline[11][2] = "Warren Street";
        trainline[11][3] = "Oxford Circus";

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter tube station name of zone 1 : ");
            String userTubeStation = scanner.nextLine();
            String catchStationName = " ";
            for (int a = 0; a < station.length; a++) {
                if (userTubeStation.equalsIgnoreCase(station[a])) {
                    catchStationName = station[a];
                }
            }
            if (userTubeStation.equalsIgnoreCase(catchStationName)) {
                System.out.println(userTubeStation + " Station is in Zone 1.");
                System.out.println("------------------------------------------------");
                System.out.println("Following Lines passing through " + userTubeStation + " is : ");
                for (int i = 0; i < trainline.length; i++) {
                    for (int j = 1; j < trainline.length; j++) {
                        String MATCH = trainline[i][j];
                        if (userTubeStation.equalsIgnoreCase(MATCH)) {
                            System.out.println(trainline[i][0]);
                        }
                    }

                }
            } else {
                System.out.println("Station is not in the Zone 1,");
            }
            System.out.println("Do you want to try again : 'Y' or 'N' ");
            result = scanner.next().charAt(0);
        } while (result == 'Y' || result == 'y');
    }
}

