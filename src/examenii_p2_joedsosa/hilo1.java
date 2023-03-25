///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package examenii_p2_joedsosa;
//
//import java.util.ArrayList;
//import javax.swing.DefaultListModel;
//import javax.swing.JList;
//import javax.swing.JProgressBar;
//
///**
// *
// * @author joeds
// */
//public class hilo1 extends Thread{
//
//    private JProgressBar barra;
//    private int largo;
//    private ArrayList<Seres> seresVivos;
//    private JList lista;
//
//    public hilo1(JProgressBar barra, int largo, ArrayList<Seres> seresVivos, JList lista) {
//        this.barra = barra;
//        this.largo = largo * 10;
//        this.seresVivos = seresVivos;
//        this.lista = lista;
//    }
//
//    @Override
//    public void run() {
//        int contador = 0;
//        barra.setMaximum(largo);
//        DefaultListModel modelo = (DefaultListModel) lista.getModel();
//        while (contador < largo) {
//            barra.setValue(contador);
//            for (Seres serVivo : seresVivos) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                }
//                modelo.addElement(serVivo);
//                contador += 10;
//                barra.setValue(contador);
//            }
//        }
//
//}
//}
