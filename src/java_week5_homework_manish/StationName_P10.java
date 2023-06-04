package java_week5_homework_manish;

/**
 *Write a programme that tells you which line passes through particular stations.
 Just use Zone 1 stations name.
 */

import java.util.Scanner;

public class StationName_P10 {

    public static void main(String[] args)
    {
        station();
    }
    public static void station()
    {
        // Define the stations in Zone 1
        String[] centralLine = {"Bank", "Liverpool Street", "Oxford Circus"};
        String[] northernLine = {"Bank", "Moorgate", "King's Cross"};
        String[] jubileeLine = {"Waterloo", "Bond Street", "Baker Street"};

        // Get user input for the station name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a station name: ");
        String stationName = scanner.nextLine();

        // Check if the station is on the Central Line
        boolean isOnCentralLine = false;
        for (String station : centralLine)
        {
            if (station.equalsIgnoreCase(stationName))
            {
                isOnCentralLine = true;
                break;
            }
        }

        // Check if the station is on the Northern Line
        boolean isOnNorthernLine = false;
        for (String station : northernLine)
        {
            if (station.equalsIgnoreCase(stationName))
            {
                isOnNorthernLine = true;
                break;
            }
        }

        // Check if the station is on the Jubilee Line
        boolean isOnJubileeLine = false;
        for (String station : jubileeLine)
        {
            if (station.equalsIgnoreCase(stationName))
            {
                isOnJubileeLine = true;
                break;
            }
        }

        // Display the lines passing through the station
        System.out.println("Lines passing through " + stationName + ":");
        if (isOnCentralLine)
        {
            System.out.println("- Central Line");
        }
        if (isOnNorthernLine)
        {
            System.out.println("- Northern Line");
        }
        if (isOnJubileeLine)
        {
            System.out.println("- Jubilee Line");
        }

        // If the station is not on any line in Zone 1
        if (!isOnCentralLine && !isOnNorthernLine && !isOnJubileeLine)
        {
            System.out.println("The station is not in Zone 1 or is not served by the specified lines.");
        }
    }
}