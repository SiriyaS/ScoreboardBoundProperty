/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboardboundproperty;

import java.util.Scanner;

/**
 *
 * @author siriya_s
 */
public class ScoreboardBoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new object
        Scanner input = new Scanner(System.in);
        ScorePropertyBean source = new ScorePropertyBean();
        ListenerA listenerA = new ListenerA();
        ListenerB listenerB = new ListenerB();
        
        // register listener
        source.addPropertyChangeListener(listenerA);
        source.addPropertyChangeListener(listenerB);
        
        while(true) {
            System.out.print("Enter score (Enter for exit): ");
            String score = input.nextLine();
            
            if(score.equals("")) {
                System.out.println("EXIT!!");
                return;
            }
            
            // set value
            source.setScore(score);
        }
    }
    
}
