package edu.ucla.distefanolab.thyrosim.algorithm;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

public class Plotter {
    private XYSeriesCollection dataset;
    private JFreeChart chart;
    private ChartPanel chartPanel;
    private XYSeries series;

    public Plotter() {
        dataset = new XYSeriesCollection();
        chart = ChartFactory.createXYLineChart(
                "Thyrosim Simulation", // chart title
                "Time", // x axis label
                "Values", // y axis label
                dataset // data
        );

        chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        JFrame frame = new JFrame("Thyrosim Plot");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setVisible(true);

        series = new XYSeries("values");
    }

    public void add_value(double time, double value){
        series.add(time, value);
    }

    public void plot(
        // double[] time, double[] q
        ) {
        dataset.removeAllSeries();
        // XYSeries series = new XYSeries("q");

        // for (int i = 0; i < time.length; i++) {
        //     series.add(time[i], q[i]);
        // }

        dataset.addSeries(series);
    }
}