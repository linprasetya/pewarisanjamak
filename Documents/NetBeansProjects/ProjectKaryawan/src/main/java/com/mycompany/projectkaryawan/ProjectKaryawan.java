/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectkaryawan;

/**
 *
 * @author Lenovo
 */
import java.io.*;
public class ProjectKaryawan  {
    protected String nama;
    protected String nik;

    public void setNama(String nama)
    {
        this.nama=nama;
    }
    public void setNik(String nik)
    {
        this.nik=nik;
    }

    public String getNama()
    {
     return nama;
    }
    public String getNik()
    {
     return nik;
    }
}

