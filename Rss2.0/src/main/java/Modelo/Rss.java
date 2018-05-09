/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Miguel
 */
@XmlRootElement(name ="rss")
public class Rss {
    
    public Channel channel;
    
}
