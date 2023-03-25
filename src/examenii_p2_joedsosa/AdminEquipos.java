///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package examenii_p2_joedsosa;
//
//import java.io.EOFException;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//
///**
// *
// * @author joeds
// */
//public class AdminEquipos {
//
//    private ArrayList<Clase> listaClases = new ArrayList();
//    private File archivo = null;
//
//    public AdmClase(String path) {
//        this.archivo = new File(path);
//    }
//
//    public ArrayList<Clase> getListaClases() {
//        return listaClases;
//    }
//
//    public void setListaClases(ArrayList<Clase> listaClases) {
//        this.listaClases = listaClases;
//    }
//
//    public File getArchivo() {
//        return archivo;
//    }
//
//    public void setArchivo(File archivo) {
//        this.archivo = archivo;
//    }
//
//    public void cargarArchivo() {
//        try {
//            listaClases = new ArrayList();
//            Clase temp;
//            if (archivo.exists()) {
//                FileInputStream entrada = new FileInputStream(archivo);
//                ObjectInputStream objeto = new ObjectInputStream(entrada);
//                try {
//                    while ((temp = (Clase) objeto.readObject()) != null) {
//                        listaClases.add(temp);
//                    }
//                } catch (EOFException e) {
//                    //encontro el final del archivo
//                }
//                objeto.close();
//                entrada.close();
//            }
//        } catch (IOException | ClassNotFoundException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    public void escribirArchivo() {
//        FileOutputStream fw = null;
//        ObjectOutputStream bw = null;
//        try {
//            fw = new FileOutputStream(archivo);
//            bw = new ObjectOutputStream(fw);
//            for (Clase t : listaClases) {
//                bw.writeObject(t);
//            }
//            bw.flush();
//        } catch (IOException ex) {
//        } finally {
//            try {
//                bw.close();
//                fw.close();
//            } catch (IOException ex) {
//            }
//        }
//
//    }
//}
