package com.kh.day12.music.run;

import java.util.List;
import java.util.Scanner;

import com.kh.day12.music.controller.MusicController;
import com.kh.day12.music.model.vo.Music;
import com.kh.day12.music.view.MusicView;

public class Run {
	public static void main(String[] args) {
		MusicView view = new MusicView();
		MusicController mController = new MusicController();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Music music = null;
		String title = "";
		do {
			choice = view.musicMenu();
			switch(choice) {
			case 1: 
				// MusicFunction -> MusicView, MusicController
				music = view.inputMusicInfo();
				mController.addAtLast(music);
				view.displaySuccess("마지막 위치에 추가 성공!");
				break;
			case 2: 
				music = view.inputMusicInfo();
				mController.addAtZero(music);
				view.displaySuccess("첫 위치에 추가 성공!");
				break;
			case 3: 
				List<Music> allList = mController.printMusicList();
				view.showAllMusicList(allList);
				view.displaySuccess("전체 정보 조회 성공");
				break;
			case 4: 
				title = view.inputMusicName("검색");
				List<Music> searchList
				= mController.searchMusicsByName(title);
				view.showAllMusicList(searchList);
				view.displaySuccess("검색한 " + title + "조회 성공!");
				break;
			case 5: 
				title = view.inputMusicName("삭제"); 
					int index = mController.searchOneByTitle(title);
					if(index == -1) {
						view.displayError("존재하지 않습니다.");
						break;
					}
					mController.removeMusic(index);
					view.displaySuccess("곡 삭제 성공!");
					break;
			case 6: break;
			case 7: break;
			case 8: break;
			case 9: break;
			case 10: break;
			case 0: System.out.println("프로그램을 종료합니다."); break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		} while(choice != 0);
	}
}
