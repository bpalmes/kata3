/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.Dimension;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author usuario
 */
import org.jfree.ui.ApplicationFrame;
public class HistogramaDisplay extends ApplicationFrame{
    private final Histograma<String> histogram;
    public HistogramaDisplay(){
        super("HISTOGRAM");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }
   private ChartPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel (createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }
   private JFreeChart createChart (DefaultCategoryDataset dataset){
       JFreeChart chart = ChartFactory.createBarChart(null,"Dominio","Nº email",dataset,PlotOrientation.VERTICAL,true,true,false);
       return chart;
   }
   
   private DefaultCategoryDataset createDataset (){
       DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       for(Object key : histogram.keySet()){
           dataset.addValue (histogram.get(key),"", "gmail.com");
       }
       dataset.addValue(10,"ENE", "gmail.com");
       dataset.addValue(7,"ENE","ulpgc.es");
       dataset.addValue(5,"ENE","hotmail.com");
       
       return dataset;
       
   }
   public void execute(){
       setVisible(true);
   }


    
}
