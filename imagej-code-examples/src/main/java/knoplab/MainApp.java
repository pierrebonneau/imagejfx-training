/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knoplab;

import net.imagej.ImageJ;

/**
 *
 * @author pierre
 */
public class MainApp {
    public static void main(String[] args) throws Exception{
    
    // we create an imagej
    ImageJ imagej = new ImageJ();
         
    // an object that will open an image automatically for testing purpose
    AutoOpener tester = new AutoOpener();
         
    // we inject the tester
    imagej.getContext().inject(tester);
         
    // we show the ui
    imagej.ui().showUI();
         
    // we open the example file
    tester.openExampleFile();
    }
}
