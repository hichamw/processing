/**
 * Created by Leen Gebruiker on 9-6-2016.
 */
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.GeocodingApiRequest;
import com.google.maps.model.GeocodingResult;
import processing.core.*;
import java.io.*;
import java.util.ArrayList;

public class main extends PApplet {
    public static void main(String[] args){
        String[] a = {"MAIN"};
        PApplet.runSketch( a, new main());
    }
    public void settings(){
        size(500,500);
    }

    public void setup() {
        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyC2PY-HHdSmO3i3qAg9H6N8JvASVUqZmJc");
        GeocodingResult[] results = new GeocodingResult[0];
        try {
            results = GeocodingApi.geocode(context,"Heer Ottostraat 18,Gorinchem").await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(results[0].geometry.location.lat+", "+results[0].geometry.location.lng);

    }


    public void draw() {

    }
}
