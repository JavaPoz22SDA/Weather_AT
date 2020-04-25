package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.management.StandardEmitterMBean;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
            ObjectMapper mapper = new ObjectMapper();

            Location location = new Location("Poznan", "Poland");
            Request request = new Request("City", "Poznan, Poland");


        Weather weather = new Weather(23.5, "Poznan", request, location);
        System.out.println(weather.getTemperature());
        weather.setTemperature(35.33);
        System.out.println(weather.getTemperature());

        mapper.writeValue(new File("data.json"), weather);

        Weather readWeather = mapper.readValue(new File("data.json"), Weather.class);
        System.out.println(readWeather.getCity());
//-----------------------------------
        Book book = new Book(104, "The Fabric of the Cosmos");
        mapper.writeValue(new File("bookdata.json"), book);
        Book readFile = mapper.readValue(new File("bookdata.json"), Book.class);
        System.out.println(readFile.getTitle());




    }
}
