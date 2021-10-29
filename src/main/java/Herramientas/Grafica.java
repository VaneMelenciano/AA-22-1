/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart; //grafica
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries; //serie: por cada metodo de ordenamiento 
import org.jfree.data.xy.XYSeriesCollection; //coleccion de las series, en este caso 3 (bt, bo, in)
/**
 *
 * @author Vanessa
 */
public class Grafica {
    private JFreeChart grafica;
    private XYSeriesCollection series;
    private String eX, eY,titulo;
    //El eje x es la longitud del arreglo
    //El eje Y son los tiempos obtenidos
    //El titulo puede ser: caso medio, mejor caso, peor caso
    
    public Grafica(String eX, String eY, String titulo) {
        this.grafica = null;
        this.series = new XYSeriesCollection();
        this.eX = eX;
        this.eY = eY;
        this.titulo = titulo;
    }
    
    public void agregarSerie(String tituloSerie, double[] datos){ //nombre de la serie (bt, bo, in), los datos del eje Y (tiempos)
    
        XYSeries serie = new XYSeries(tituloSerie);
        
        for (int x=0; x < datos.length;x++){
            serie.add(x, datos[x]); //agrega el núm del datos (como un id) y el datos recibido, a la serie
        }
        this.series.addSeries(serie); //agrega la serie creada a la colección de series
     
    }
    public void agregarSerie(String tituloSerie, int[] datos){ //nombre de la serie (bt, bo, in), los datos del eje Y (tiempos)
    
        XYSeries serie = new XYSeries(tituloSerie);
        
        for (int x=0; x < datos.length;x++){
            serie.add(x, datos[x]); //agrega el núm del datos (como un id) y el datos recibido, a la serie
        }
        this.series.addSeries(serie); //agrega la serie creada a la colección de series
     
    }
    public void agregarSerie(String tituloSerie, long[] datos){ //nombre de la serie (bt, bo, in), los datos del eje Y (tiempos)
    
        XYSeries serie = new XYSeries(tituloSerie);
        
        for (int x=0; x < datos.length;x++){
            serie.add(x, datos[x]); //agrega el núm del datos (como un id) y el datos recibido, a la serie
        }
        this.series.addSeries(serie); //agrega la serie creada a la colección de series
     
    }
    
    public void agregarSerie(String nombre){
        XYSeries serie = new XYSeries(nombre);
        this.series.addSeries(serie);
    }
    
    public void agregarDatoASerie(String nombre, XYDataItem dato)   { //agregar datos a una serie ya existente
        this.series.getSeries(nombre).add(dato);
    }
    
    public void crearGrafica(){
        this.grafica = ChartFactory.createXYLineChart(titulo, eX, eY, series);
        //this.grafica = ChartFactory.createScatterPlot(titulo, eX, eY, series); 
        //this.grafica = ChartFactory.createXYStepChart(titulo, eX, eY, series);
    }
    
    public void mostrarGrafica(){
        ChartFrame panel = new ChartFrame(titulo, grafica);
        panel.pack();
        panel.setVisible(true);
    }

    
}
