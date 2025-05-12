import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import javax.print.attribute.DocAttribute;

public class CityWeatherDashboard {
    public static void main(String[] args) {
        Map<String, Double> cityWeather = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println(" add --> Add a city + temperature\n" +
            "update --> Update a city's temperature\n" + "view --> View all city temperature/n" +
            "remove --> Delete a city from the list \n" + " exit --> Quit");
            System.out.print("Enter: ");
            String user_input = scanner.nextLine();
            if (user_input.equals("exit"))
            {
                System.out.println("Goodbye");
                break;
            } else if (user_input.equals("add"))
            {
                System.out.print("Enter city name: ");
                String cityName = scanner.nextLine();
                System.out.print("Enter city temperature: ");
                Double cityTemperature = scanner.nextDouble();
                scanner.nextLine();
                cityWeather.put(cityName, cityTemperature);
            } else if (user_input.equals("update"))
            {
                System.out.print("Enter city name to update: ");
                String City = scanner.nextLine();
                System.out.print("Enter temperature: ");
                Double updateCityTemp = scanner.nextDouble();
                scanner.nextLine();
                if (cityWeather.containsKey(City))
                {
                    cityWeather.put(City, updateCityTemp);
                    System.out.println(City+ " update to " + updateCityTemp + "°F");
                } else {
                    System.out.println("City not found");
                }

            } else if( user_input.equals("remove"))
            {
                System.out.print("Enter city to remove: ");
                String cityRemove = scanner.nextLine();
                if (cityWeather.containsKey(cityRemove))
                {
                    cityWeather.remove(cityRemove);
                    System.out.println("Sucessful remvoed city");
                } else {
                    System.out.println("City not found");
                }
            } else if (user_input.equals("view"))
            {
                for (Map.Entry<String, Double> enter : cityWeather.entrySet())
                {
                    System.out.println(enter.getKey() + " --> " + enter.getValue()+ "°F");
                }
            }
        }
    }
}
