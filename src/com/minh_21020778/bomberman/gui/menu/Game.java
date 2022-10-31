package com.minh_21020778.bomberman.gui.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import com.minh_21020778.bomberman.gui.CodeDialog;
import com.minh_21020778.bomberman.gui.Frame;
import com.minh_21020778.bomberman.gui.InfoDialog;

// không hoàn thành được phần menu trước khi hết hạn :((((
public class Game extends JMenu {

	public Frame frame;
	
	public Game(Frame frame) {
		super("Game");
		this.frame = frame;

		/*
		 * New Game
		 */
		JMenuItem newgame = new JMenuItem("New Game");
		newgame.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		newgame.addActionListener(new MenuActionListener(frame));
		add(newgame);
		
		/*
		 * Scores
		 */
		JMenuItem scores = new JMenuItem("Top Scores");
		scores.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
		scores.addActionListener(new MenuActionListener(frame));
		add(scores);
	}
	
	class MenuActionListener implements ActionListener {
		public Frame _frame;
		public MenuActionListener(Frame frame) {
			_frame = frame;
		}
		
		  @Override
		public void actionPerformed(ActionEvent e) {
			  
			  if(e.getActionCommand().equals("New Game")) {
				  _frame.newGame();
			  }
			  
			  if(e.getActionCommand().equals("Top Scores")) {
				  new InfoDialog(_frame, "Top Scores", "If i had more time..", JOptionPane.INFORMATION_MESSAGE);
			  }
			  
			  if(e.getActionCommand().equals("Codes")) {
				  new CodeDialog(_frame);
			  }

		  }
		}

}
