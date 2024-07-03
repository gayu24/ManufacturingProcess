package com.factoryProcess;

public class Main {
	  public static void main(String[] args) {
	        MultiStageProcess processor = new MultiStageProcess();
	        
	        for (int i = 0; i < 10; i++) {
	            processor.addItem(new Item("Item" + i, 0, i % 3, "Description" + i));
	        }

	        processor.startProcessing();
	        
	        // Allow some time for processing before shutting down
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }

	        System.out.println("Items processed: " + processor.getItemsProcessed());
	        processor.shutdown();
	    }

}
