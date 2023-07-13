package com.kh.day14.swing.Component.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Exercise_SliderChangeEvent extends JFrame{
	private JLabel colorLabel;
	private JSlider[] sliders;
	
	public Exercise_SliderChangeEvent() {
		setTitle("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		colorLabel = new JLabel("SLIDER EXAMPLE");
		sliders = new JSlider[3];
		for(int i = 0; i < sliders.length; i++) {
			sliders[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sliders[i].setPaintLabels(true);
			sliders[i].setPaintTicks(true);
			sliders[i].setMajorTickSpacing(50);
			sliders[i].setMinorTickSpacing(10);
			sliders[i].addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
					int r = sliders[0].getValue();
					int g = sliders[1].getValue();
					int b = sliders[2].getValue();
					colorLabel.setOpaque(true);
					colorLabel.setBackground(new Color(r, g, b));
				}
			});
			c.add(sliders[i]);
		}
		sliders[0].setForeground(Color.RED);
		sliders[1].setForeground(Color.GREEN);
		sliders[2].setForeground(Color.BLUE);
		c.add(colorLabel);
		setSize(300, 230);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise_SliderChangeEvent();
	}
}
