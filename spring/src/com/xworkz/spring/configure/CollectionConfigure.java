package com.xworkz.spring.configure;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.spring.configure.CollectionConfigure")
public class CollectionConfigure {
	
	public CollectionConfigure() {
		System.out.println("No args constructor");
	}
	
	@Bean
	public List<String> name(){
		List<String> list1 = new ArrayList<String>();
		list1.add("Irfan");
		list1.add("Rahul");
		list1.add("Karan");
		list1.add("Kartik");
		list1.add("Nadeem");
		return list1;
	}
	
	@Bean
	public List<Integer> rollNo(){
		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(43);
		list2.add(56);
		list2.add(23);
		list2.add(36);
		list2.add(27);
		return list2;
	}
	
	@Bean
	public List<Float> number(){
		List<Float> list3 = new Vector<Float>();
		list3.add(43.5f);
		list3.add(24.8f);
		list3.add(25.7f);
		list3.add(33.5f);
		list3.add(27.6f);
		return list3;
	}
	@Bean
	public List<Character> character(){
		List<Character> list4 = new Stack<Character>();
		list4.add('A');
		list4.add('B');
		list4.add('C');
		list4.add('D');
		list4.add('E');
		return list4;
	}
	
	//---------------------------------------------------------------------------------------
	
	@Bean
	public Queue<String> address(){
		Queue<String> queue1 = new PriorityQueue<String>();
		queue1.add("Jaipur");
		queue1.add("Alwar");
		queue1.add("Bharatpur");
		queue1.add("Udaipur");
		queue1.add("Dholpur");
		return queue1;
	}
	
	@Bean
	public Queue<Integer> id(){
		Queue<Integer> queue2 = new ArrayDeque<Integer>();
		queue2.add(14);
		queue2.add(02);
		queue2.add(05);
		queue2.add(27);
		queue2.add(06);
		return queue2;
	}
	
	//---------------------------------------------------------------------------------------------
	
	@Bean
	public Set<String> vehicleType(){
		Set<String> set1 = new HashSet<String>();
		set1.add("Bus");
		set1.add("Bike");
		set1.add("Train");
		set1.add("Car");
		set1.add("Flight");
		return set1;
	}
	
	@Bean
	public Set<Integer> vehicleNumber(){
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(1245);
		set2.add(2568);
		set2.add(14404);
		set2.add(2545);
		set2.add(789654);
		return set2;
	}
	
	@Bean
	public SortedSet<Float> floatNumber(){
		SortedSet<Float> set3 = new TreeSet<Float>();
		set3.add(12.5f);
		set3.add(5.2f);
		set3.add(6.9f);
		set3.add(39.8f);
		set3.add(40.6f);
		return set3;
	}
	
}
