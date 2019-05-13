package vn.edu.vnuk.sep.controller;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyChange(float minimumWage) {
		for(Observer observer : observers) {
			observer.update(minimumWage);
		}
	}
}
