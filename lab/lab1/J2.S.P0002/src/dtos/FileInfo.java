package dtos;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class FileInfo implements Serializable {

    String fileName;
    long fileSize;
    byte[] dataByte;

    public FileInfo() {
    }

    
    public FileInfo(File f){
try {
            BufferedInputStream buf =new BufferedInputStream(new FileInputStream(f));
            fileName=f.getName();
            dataByte= new byte[(int) f.length()];
            fileSize= dataByte.length;
            buf.read(dataByte,0,dataByte.length);
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

    public FileInfo(String fileName, long fileSize, byte[] dataByte) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.dataByte = dataByte;
    }

}
