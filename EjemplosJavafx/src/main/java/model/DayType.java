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
public class DayType {
    private String dayTypeId;
    private Direction direction1;
    private Direction direction2;

    public String getDayTypeId() {
        return dayTypeId;
    }

    public void setDayTypeId(String dayTypeId) {
        this.dayTypeId = dayTypeId;
    }

    public Direction getDirection1() {
        return direction1;
    }

    public void setDirection1(Direction direction1) {
        this.direction1 = direction1;
    }

    public Direction getDirection2() {
        return direction2;
    }

    public void setDirection2(Direction direction2) {
        this.direction2 = direction2;
    }
    
    
}
