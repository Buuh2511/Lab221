/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utills;

import java.util.Comparator;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import utills.Course;

/**
 *
 * @author Admin
 */
public class CourseFullModel<T> extends AbstractTableModel { 
String[] header;
    int[] indexes;
    Vector<Course> data;
    
    
    public CourseFullModel(String[] header,int[] indexes){
        int i=0;
        this.header=new String[header.length];
        for(i=0;i<header.length;i++){
            this.header[i]=header[i];
        }
        this.indexes=new int[indexes.length];
        for(i=0;i<header.length;i++){
            this.indexes[i]=indexes[i];
        }
        this.data = new Vector<Course>();
    }
    
    public Vector<Course> getData(){
        return data;
    }
     
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return (columnIndex>=0&&columnIndex<header.length)?header[columnIndex]:"";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex<0||rowIndex>=data.size()||columnIndex<0||columnIndex>=header.length)
            return null;
        Course c=data.get(rowIndex);
        switch(indexes[columnIndex]){
            case 0:return c.getCode();
            case 1:return c.getName();
            case 2:return c.getCredit();
        }
        return null;
    }
    
//    Comparator<Course> comp = new Comparator<Course>() {
//        @Override
//        public int compare(Course o1, Course o2) {
//            return o1.getName().compareToIgnoreCase(o2.getName());
//        }
//    };
//    
}