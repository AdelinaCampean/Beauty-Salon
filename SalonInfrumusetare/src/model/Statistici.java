package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class Statistici {

	private PersistentaFactory pfact = new  PersistentaFactory();
	private Persistenta pcl = pfact.createP("clienti.ser");
	
	
	//public FrameAngajat myA;
	
	public Statistici(String title) {
		//myA.setPanel_1(createDemoPanel());
	}

	public  HashMap<String, Integer> extractDataAge()
	{
		
		HashMap<String, Integer> freqMap = new HashMap<String, Integer>(); 

		//ArrayList<Integer> ageproc = new ArrayList<>();
		ArrayList<Client> clients = new ArrayList<>();
		
		clients = ((PersistentaClienti) pcl).incarcare();
		
		int arr[] = new int[clients.size()];
		int j=0;
		for(Client c:clients)
		{
			arr[j] = c.getVarsta();
			j++;
		}
		  
        for (int i=0;i<arr.length;i++) { 
            if (freqMap.containsKey(arr[i]+"")) { 
  
                freqMap.put(arr[i]+"", freqMap.get(arr[i]+"") + 1); 
            } 
            else { 
  
                freqMap.put(arr[i]+"", 1); 
            } 
        }
        
       /* for (Map.Entry entry : freqMap.entrySet()) { 
                 System.out.println(entry.getKey() + " " + entry.getValue()); 
         } 
        */
        return freqMap;
		
	}
	
	
	
	private PieDataset createDataset( ) {
		HashMap<String, Integer> freqMap = new HashMap<String, Integer>(); 
		
		freqMap = extractDataAge();
		
		 
	      DefaultPieDataset dataset = new DefaultPieDataset( );
	      
	      for (Map.Entry entry : freqMap.entrySet())
	      {
	    	  
	    	  dataset.setValue(entry.getKey()+"",(Number)entry.getValue());  
	      }
	       
	      return dataset;         
	   }
	
	 private  JFreeChart createChart( PieDataset dataset ) {
		 
	      JFreeChart chart = ChartFactory.createPieChart(      
	         "Procente dupa varsta",   // chart title 
	         dataset,          // data    
	         true,             // include legend   
	         true, 
	         false);

	      return chart;
	   }
	 
	   public  ChartPanel createDemoPanel() {
		      JFreeChart chart = createChart(createDataset());  
		      ChartPanel chartP = new ChartPanel((JFreeChart) null);
		  	  chartP.removeAll();
		      chartP.setChart(chart);
		  	  chartP.setBounds(192, 541, 355, 251);
		     
	      return chartP; 
	   }
	
	   
	   
	 //servicii programate
		public  HashMap<String, Integer> extractDataServices()
		{
			HashMap<String, Integer> freqMap = new HashMap<String, Integer>(); 
			
			ArrayList<Client> clients = new ArrayList<>();
			
			clients = ((PersistentaClienti) pcl).incarcare();
			
			
			int j=0;
			
			ArrayList<Serviciu> services = new ArrayList<>();
			int x=0;
			
			for(Client c:clients)
			{
				services = c.getProgramare();
				
					x+=c.getProgramare().size();
			}
			
			String arr[] = new String[x];
			
			for(Client c:clients)
			{
				services = c.getProgramare();
				
				for(Serviciu s:services)
				{
					arr[j] = s.getDenumire();
					System.out.println("here->"+arr[j]);
					j++;
				}
			}
			
			
			
			  
	        for (int i=0;i<arr.length;i++) { 
	            if (freqMap.containsKey(arr[i]+"")) { 
	  
	                freqMap.put(arr[i]+"", freqMap.get(arr[i]+"") + 1); 
	            } 
	            else { 
	  
	                freqMap.put(arr[i]+"", 1); 
	            } 
	        }
	        
	        for (Map.Entry entry : freqMap.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	    } 
			
			return freqMap;
		}
		
		private PieDataset createDatasetProg( ) {
			
			HashMap<String, Integer> freqMap = new HashMap<String, Integer>(); 
			
			freqMap = extractDataServices();
			
			 
		      DefaultPieDataset dataset = new DefaultPieDataset( );
		      
		      for (Map.Entry entry : freqMap.entrySet())
		      {
		    	  
		    	  dataset.setValue(entry.getKey()+"",(Number)entry.getValue());  
		      }
		       
		      return dataset;         
		   }
		
		 private  JFreeChart createChartProg( PieDataset dataset ) {
			 
		      JFreeChart chart = ChartFactory.createPieChart(      
		         "Servicii Programate",   // chart title 
		         dataset,          // data    
		         true,             // include legend   
		         true, 
		         false);

		      return chart;
		   }
		 
		   public  ChartPanel createDemoPanelProg() {
			   
			      JFreeChart chart = createChartProg(createDatasetProg());  
			      ChartPanel chartP = new ChartPanel((JFreeChart) null);
			  	  chartP.removeAll();
			      chartP.setChart(chart);
			  	  chartP.setBounds(192, 541, 355, 251);
			     
		      return chartP; 
		   }
	   
	   
	
}
