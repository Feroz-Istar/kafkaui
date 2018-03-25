package service;


import java.util.Arrays;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import mythread.MyThread;


public class AppContextListener implements ServletContextListener {
	private static Boolean flag = false;
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("destroying listner ...");
	    flag = false;

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("initalizing bootstrap listner ...");
		 MyThread myThread = new MyThread();
		 myThread.start();
	    	}
		
	}
	
