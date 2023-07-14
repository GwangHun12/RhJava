package com.kh.day13.Motel.run;

import java.util.List;
import java.util.Scanner;

import com.kh.day13.Motel.controller.MotelController;
import com.kh.day13.Motel.model.Motel;
import com.kh.day13.Motel.view.MotelView;

public class Run {
	public static void main(String[] args) {
		MotelView view = new MotelView();
		MotelController mController = new MotelController();
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		Motel motel = null;
		int number = 0;
		int index = 0;
		
		while(true) {
			choice = view.motelMenu();
			switch(choice) {
			case 1:
				number = view.inputMotelNum();
				mController.addNum(motel);
				view.displaySuccescc(number + "번방에 입실하셨습니다.");
				break;
			case 2:
				number = view.outputMotelNum();
//				List<Motel> searchList
//				= mController.searchMotelsByNum(number);
//				view.showAllMotelList(searchList);
				index = mController.searchMotelsByNumber(number);
					if(index == -1) {
						view.displayError("이미 비어있는 방입니다.");
						break;
					}
					mController.removeMotel(index);
					view.displaySuccescc(number + "번방에서 퇴실하셨습니다.");
					break;
					
			case 3:
				List<Motel> allList = mController.printMotelList();
				view.showAllMotelList(allList);
				view.displaySuccescc(null);
				break;
			}
			
		} 
	}
}
