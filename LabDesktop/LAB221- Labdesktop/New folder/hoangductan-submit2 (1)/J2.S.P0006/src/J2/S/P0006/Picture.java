/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J2.S.P0006;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author kim ngân
 */
public class Picture {
    public String[] getImage() {
        File file = new File(getClass().getResource("/images").getFile());
        String[] imageList = file.list();
        return imageList;

    }

    public void showImages(int index, JLabel lb) {
        String[] imageList = getImage();
        String imageName = imageList[index];
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/" + imageName));
        Image image = icon.getImage().getScaledInstance(lb.getHeight(), lb.getWidth(), Image.SCALE_SMOOTH);
        lb.setIcon(icon);
    }
}
