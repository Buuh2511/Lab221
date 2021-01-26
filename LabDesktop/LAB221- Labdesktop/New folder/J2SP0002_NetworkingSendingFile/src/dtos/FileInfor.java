/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;

/**
 *
 * @author dhtha
 */
public class FileInfor implements Serializable {

    private String fileName;
    private int fileSize;
    private byte[] dataBytes;

    public FileInfor(File f) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
            fileName = f.getName();
            dataBytes = new byte[(int) f.length()];
            fileSize = dataBytes.length;
            bis.read(dataBytes, 0, dataBytes.length);
        } catch (Exception e) {
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public byte[] getDataBytes() {
        return dataBytes;
    }

    public void setDataBytes(byte[] dataBytes) {
        this.dataBytes = dataBytes;
    }
    
    

}
