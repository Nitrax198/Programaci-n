/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.ArrayMap;
import com.google.api.client.util.GenericData;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.Arrive;
import model.Arrives;
import model.LineInfo;
import model.Stop;
import model.StopsLine;

/**
 *
 * @author user
 */
public class BusDao {

    public static void main(String[] args) throws IOException {
        BusDao b = new BusDao();
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

//        StopsLine stops = m.readValue(b.GetStopsLine("76", "PLAZA BEATA"),
//                new TypeReference<StopsLine>() {
//        });
//        for (Stop stop : stops.getStop()) {
//            System.out.println(stop.getStopId());
//        }

//        System.out.println(b.GetArrivesStop("2794"));

//        Arrives arrives = m.readValue(b.GetArrivesStop("2794"), new TypeReference<Arrives>() {
//        });
//        for (Arrive stop : arrives.getArrives()) {
//            System.out.println(stop.getStopId());
//            System.out.println(stop.getBusTimeLeft());
//            System.out.println(stop.getLatitude());
//            System.out.println(stop.getLongitude());
//            System.out.println(stop.getBusPositionType());
//        }

    }

    public StopsLine GetStopsLine(String idLine, String Direccion) throws IOException {
        BusDao b = new BusDao();
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
        JsonFactory JSON_FACTORY = new JacksonFactory();
        HttpRequestFactory requestFactory
                = HTTP_TRANSPORT.createRequestFactory((HttpRequest request) -> {
                    request.setParser(new JsonObjectParser(JSON_FACTORY));
                });

        GenericUrl url = new GenericUrl("https://openbus.emtmadrid.es:9443/emt-proxy-server/last/geo/GetStopsLine.php");

        GenericData data = new GenericData();
        data.put("idClient", "WEB.SERV.oscar.novillo@iesquevedo.es");
        data.put("passKey", "4C7A2AC7-2AC4-4AAE-9E63-E27EEA72969E");
        data.put("line", idLine);
        data.put("direction", Direccion);

        HttpRequest requestGoogle = requestFactory.buildPostRequest(url, new UrlEncodedContent(data));
        StopsLine stops = m.readValue(requestGoogle.execute().parseAsString(),
                new TypeReference<StopsLine>() {
        });
        return stops;
    }

    public StopsLine GetArrivesStop(String idStop) throws IOException {
        BusDao b = new BusDao();
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
        JsonFactory JSON_FACTORY = new JacksonFactory();
        HttpRequestFactory requestFactory
                = HTTP_TRANSPORT.createRequestFactory((HttpRequest request) -> {
                    request.setParser(new JsonObjectParser(JSON_FACTORY));
                });

        GenericUrl url = new GenericUrl("https://openbus.emtmadrid.es:9443/emt-proxy-server/last/geo/GetArriveStop.php");

        GenericData data = new GenericData();
        data.put("idClient", "WEB.SERV.oscar.novillo@iesquevedo.es");
        data.put("passKey", "4C7A2AC7-2AC4-4AAE-9E63-E27EEA72969E");
        data.put("idStop", idStop);

        HttpRequest requestGoogle = requestFactory.buildPostRequest(url, new UrlEncodedContent(data));
        StopsLine stops = m.readValue(requestGoogle.execute().parseAsString(),
                new TypeReference<StopsLine>() {
        });
        return stops;
    }
    public LineInfo SacarListado() throws IOException {
        BusDao b = new BusDao();
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
        JsonFactory JSON_FACTORY = new JacksonFactory();
        HttpRequestFactory requestFactory
                = HTTP_TRANSPORT.createRequestFactory((HttpRequest request) -> {
                    request.setParser(new JsonObjectParser(JSON_FACTORY));
                });

        GenericUrl url = new GenericUrl("https://openbus.emtmadrid.es:9443/emt-proxy-server/last/bus/GetListLines.php%22");

        GenericData data = new GenericData();
        data.put("idClient", "WEB.SERV.oscar.novillo@iesquevedo.es");
        data.put("passKey", "4C7A2AC7-2AC4-4AAE-9E63-E27EEA72969E");

        //pasamos de LocalDate a String
        LocalDate localDate = LocalDate.now();//For reference
        String sDate = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        data.put("SelectDate", sDate);

        HttpRequest requestGoogle = requestFactory.buildPostRequest(url, new UrlEncodedContent(data));
        LineInfo Lineas = m.readValue(requestGoogle.execute().parseAsString(),
                new TypeReference<LineInfo>() {
        });
        return Lineas;
    }
}
