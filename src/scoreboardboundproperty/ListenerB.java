/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboardboundproperty;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author siriya_s
 */
public class ListenerB implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println("live result: " + event.getNewValue());
    }
    
}
