/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.qlct.bangct;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dovie_000
 */
public class DataThuChi {
    public List<BangThuChi> tablethuchi = new ArrayList();
    
    public void addbang(BangThuChi data){
        tablethuchi.add(data);
    }
    
    public void setbang(int i,BangThuChi data){
        tablethuchi.set(i,data);
    }
    public void removebang(int i){
        tablethuchi.remove(i);
    }
}
