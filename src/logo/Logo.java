/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logo;

import environment.ApplicationStarter;

/**
 *
 * @author it
 */
public class Logo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        ApplicationStarter.run("Adriann's Logo", new LogoEnvironment());
    }
    
}
