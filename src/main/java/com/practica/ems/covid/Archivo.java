package com.practica.ems.covid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Archivo {
    private String fichero;
    private File archivo;
    private FileReader fr;
    private BufferedReader br;

    public Archivo(String fichero, File archivo, FileReader fr, BufferedReader br) {
        this.fichero = fichero;
        this.archivo = archivo;
        this.fr = fr;
        this.br = br;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public FileReader getFr() {
        return fr;
    }

    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }
}
