/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
/**
 *
 * @author Vanessa
 */
public class Grafica {
    private JFreeChart grafica;
    private XYSeriesCollection series;
    private String eX, eY,titulo;
    
    public Grafica(String eX, String eY, String titulo) {
        this.grafica = null;
        this.series = new XYSeriesCollection();
        this.eX = eX;
        this.eY = eY;
        this.titulo = titulo;
    }
    
}
