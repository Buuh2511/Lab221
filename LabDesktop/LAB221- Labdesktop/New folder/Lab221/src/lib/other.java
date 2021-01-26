/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

/**
 *
 * @author DoanNC
 */
public class other {

    public static void openURI(URI uri) {
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(uri);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
