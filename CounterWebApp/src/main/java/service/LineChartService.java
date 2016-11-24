package service;

import persistence.entities.User;
import persistence.entities.Stats;
import persistence.entities.Day;
import persistence.entities.Exercises;
import persistence.entities.Set;
import java.util.*;

import persistence.repositories.UserRepository;
import persistence.repositories.WorkoutRepository;

import java.io.*;
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.ChartUtilities; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChartService{

   public void getLineChart(String username, int id, String goal) {

      StatsService ss = new StatsService();

      ArrayList<Stats> stats = ss.getAveragePerDay(username, id, goal);
      System.out.println(stats.get(0).getAverage());

      try{
       DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
      for(int i = 0; i<stats.size(); i++){
         line_chart_dataset.addValue(stats.get(i).getAverage(), "Average Weight", stats.get(i).getDate() );
      }

      JFreeChart lineChartObject = ChartFactory.createLineChart(
         "Progress","Date",
         "Average Weight",
         line_chart_dataset,PlotOrientation.VERTICAL,
         true,true,false);

      int width = 640; /* Width of the image */
      int height = 480; /* Height of the image */ 
      File lineChart = new File( "src/main/webapp/WEB-INF/pages/images/"+username+".jpeg" ); 
      ChartUtilities.saveChartAsJPEG(lineChart ,lineChartObject, width ,height);        
      }
      catch(Exception e){

      }

   }

}