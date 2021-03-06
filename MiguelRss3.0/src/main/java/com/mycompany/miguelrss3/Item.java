
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miguelrss3;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author oscar
 */
public class Item {
    
    
    private String title;
    private String link;
    private String description;
    
    @XmlElement(name="title",namespace="http://search.yahoo.com/mrss/")
    public String mediaTitle;
    
    @XmlElement(name="thumbnail",namespace="http://search.yahoo.com/mrss/")
    public Thumbnail thumbnail;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
    
}
