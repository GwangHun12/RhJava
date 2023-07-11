package com.kh.day12.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.day12.music.model.vo.Music;

public class MusicController {

		List<Music> mList;
		
		public MusicController() {
			mList = new ArrayList<Music>();
		}
		
		/**
		 * 마지막 위치에 곡 추가
		 * @param music
		 */
		public void addAtLast(Music music) {
			mList.add(music);
		}
		/**
		 * 첫 위치에 추가
		 * @param music
		 */
		public void addAtZero(Music music) {
			mList.add(0, music);
		}
		
		/**
		 * 음악 전체 정보 출력
		 * @return
		 */
		public List<Music> printMusicList() {
			return mList;
		}

		public List<Music> searchMusicsByName(String title) {
			// TODO Auto-generated method stub
			// 찾은 음악을 담을 리스트
			List<Music> findList = new ArrayList<Music>();
			// 기존 음악이 있는 mList에서 찾기
			for(Music mOne : mList) {
				// 입력한 이름이 같으면
				if(mOne.getTitle().equals(title)) {
					// findList에 추가하기
					findList.add(mOne);
				}
			}
			// 다 찾았으면 리턴하기
			return findList;
		}
		
		public int searchOneByTitle(String title) {
			for(int i = 0; i < mList.size(); i++) {
				Music music = mList.get(i);
				if(music.getTitle().equals(title)) {
					// mList에서 삭제
					return i;	// 삭제 했으면 그만 나와
				}
			}
			return -1;
		}
		/**
		 * 곡 삭제가히
		 * @param title
		 */

		public void removeMusic(int i) {
			// mList에서 삭제
			mList.remove(i);
		}
}
