/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author daw
 */
public class Direction {
    private String startTime;
    private String stopTime;
    private String minimumFrequency;
    private String maximumFrequency;
    private String frequencyDescription;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public String getMinimumFrequency() {
        return minimumFrequency;
    }

    public void setMinimumFrequency(String minimumFrequency) {
        this.minimumFrequency = minimumFrequency;
    }

    public String getMaximumFrequency() {
        return maximumFrequency;
    }

    public void setMaximumFrequency(String maximumFrequency) {
        this.maximumFrequency = maximumFrequency;
    }

    public String getFrequencyDescription() {
        return frequencyDescription;
    }

    public void setFrequencyDescription(String frequencyDescription) {
        this.frequencyDescription = frequencyDescription;
    }
    
    
}
