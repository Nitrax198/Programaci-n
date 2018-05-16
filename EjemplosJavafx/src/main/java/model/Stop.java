/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author daw
 */
public class Stop {

    private String stopId;
    private int pmv;
    private String name;
    private String postalAddress;
    private double latitude;
    private double longitude;
    private List<String> lineId;
    private List<LineInfo> line;
    
    
    

    //    private String type;
//    private String siteId;
//    private String description;
//    private String streetType;
//    private String numberType;
//    private String streetNumber;
//    private String zipCode;
//    private double latitude;
//    private double longitude;
//    private String poiType;
//    private String poiDirection;
//    private String poiStreetNumber;
//    private String poiPhoneNumber;

    public String getStopId() {
        return stopId;
    }

    public void setStopId(String stopId) {
        this.stopId = stopId;
    }

    public int getPmv() {
        return pmv;
    }

    public void setPmv(int pmv) {
        this.pmv = pmv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<String> getLineId() {
        return lineId;
    }

    public void setLineId(List<String> lineId) {
        this.lineId = lineId;
    }

    public List<LineInfo> getLine() {
        return line;
    }

    public void setLine(List<LineInfo> line) {
        this.line = line;
    }
}
