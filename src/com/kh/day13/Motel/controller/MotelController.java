package com.kh.day13.Motel.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.day13.Motel.model.Motel;

public class MotelController {

	List<Motel> mList;
	
	public MotelController() {
		mList = new ArrayList<Motel>();
	}
	
	public void addNum(Motel motel) {
		mList.add(motel);
	}

	public List<Motel> searchMotelsByNum(int number) {
		List<Motel> findList = new ArrayList<Motel>();
		for(Motel mOne : mList) {
			if(mOne.getNumber() == (number)) {
				findList.add(mOne);
			}
		}
		return mList;
	}

	public int searchMotelsByNumber(int number) {
		// TODO Auto-generated method stub
		for(int i = 0; i < mList.size(); i++) {
			Motel motel = mList.get(i);
			if(motel.getNumber() == (number)) {
				return i;
			}
		}
		return -1;
	}

	public void removeMotel(int i) {
		mList.remove(i);
	}

	public List<Motel> printMotelList() {
		// TODO Auto-generated method stub
		return mList;
	}

}
