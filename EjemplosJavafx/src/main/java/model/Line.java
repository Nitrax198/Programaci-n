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
public class Line {

    private int date;
    private String lineId;
    private String label;
    private String headerA;
    private String headerB;
    private int incidents;
    private List<DayType> dayType;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getHeaderA() {
        return headerA;
    }

    public void setHeaderA(String headerA) {
        this.headerA = headerA;
    }

    public String getHeaderB() {
        return headerB;
    }

    public void setHeaderB(String headerB) {
        this.headerB = headerB;
    }

    public int getIncidents() {
        return incidents;
    }

    public void setIncidents(int incidents) {
        this.incidents = incidents;
    }

    public List<DayType> getDayType() {
        return dayType;
    }

    public void setDayType(List<DayType> dayType) {
        this.dayType = dayType;
    }
    
    
}
