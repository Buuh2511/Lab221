/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buuh.dtos;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;

/**
 *
 * @author Buu Huynh
 */
public class FileInfor implements  Serializable{
    String fileName;
    long fileSize;
    byte[] dataByte;

    public FileInfor() {
    }

    public FileInfor(String fileName, long fileSize, byte[] dataByte) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.dataByte = dataByte;
    }
    
    public FileInfor(File f){
        try {
            BufferedInputStream buf = new BufferedInputStream(new FileInputStream(f));
            fileName = f.getName();
            dataByte = new byte[(int) f.length()];
            fileSize = dataByte.length;
            buf.read(dataByte, 0, dataByte.length);
        } catch (Exception e) {
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public byte[] getDataByte() {
        return dataByte;
    }

    public void setDataByte(byte[] dataByte) {
        this.dataByte = dataByte;
    }
    
    
}
