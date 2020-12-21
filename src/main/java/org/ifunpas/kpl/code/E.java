package org.ifunpas.kpl.code;

import java.util.ArrayList;
import java.util.List;

public class E {
	
	
	private List<String> dataList = new ArrayList<String>();
	
	public E() {
		System.out.println("Ctor di kelas E");
	}
	
	
	 public boolean contains(String n) {
		 boolean hasil = false;
		 if (dataList.contains(n) ) {
			 hasil = true;			 
		} else {
			hasil = false;
		}
		 return hasil;
	 }
	 
	
		
	public List<String> getDataList() {
		return dataList;
	}


	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}
	
	public boolean tambahData(String n) {
		if (dataList.size() < 11) {
			dataList.add(n);	
			return true;
		} else {
			return false;
		}
	}
	public void tampilData() {
		for(int i =0; i < dataList.size(); i++) {
			String p = dataList.get(i);
			System.out.println(p);
		}
	}
	public String toString() {
		return "toString di kelas E";
	}
}
