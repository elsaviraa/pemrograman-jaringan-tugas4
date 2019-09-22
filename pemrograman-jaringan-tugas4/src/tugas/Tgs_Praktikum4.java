/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elsa
 */
public class Tgs_Praktikum4 {
    
    private Tgs_Praktikum4Frame view;
    private List<Integer> list = new ArrayList<>();
    
    public Tgs_Praktikum4 (Tgs_Praktikum4Frame view){
        
        this.view = view;
        
        this.view.getHasilLuas().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitung();
            }
        }) ;
        
        this.view.getHasilKeliling().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               hapus();
            }
        });
        
    }
    int panjang,lebar,luas,keliling;
    
    void hitung() {
        panjang = Integer.parseInt(view.getPanjang().getText());
        lebar = Integer.parseInt(view.getLebar().getText());
        luas = panjang*lebar;
        keliling = 2 *(panjang + lebar);
        view.getHasilLuas().setText(String.valueOf(luas));
        view.getHasilKeliling().setText(String.valueOf(keliling));

        view.getPanjang().setText(""+panjang);
        view.getLebar().setText(""+lebar);
        view.getHasilLuas().setText(""+luas);
        view.getHasilKeliling().setText(""+keliling);
        
    }
    
    void hapus() {
        view.getPanjang().setText("");
        view.getLebar().setText("");
        view.getHasilKeliling().setText("");
        view.getHasilLuas().setText("");
    }
        
 }
    

