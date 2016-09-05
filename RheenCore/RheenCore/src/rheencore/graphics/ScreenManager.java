package rheencore.graphics;

import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class ScreenManager {
	
	public static Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int lenX = (int)windowSize.getWidth();
	public static int lenY = (int)windowSize.getHeight();
	
	private GraphicsDevice vc;
	
	public ScreenManager(){
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		vc = env.getDefaultScreenDevice();
	}
	
	public void update(){
		Window window = vc.getFullScreenWindow();
		if(window != null){
			BufferStrategy strategy = window.getBufferStrategy();
			if(!strategy.contentsLost()){
				strategy.show();
			}
		}
	}
	
	public DisplayMode[] getCompatibleDisplayModes(){
		return vc.getDisplayModes();
	}
	
	public DisplayMode getFirstCompatibleDisplayMode(DisplayMode modes[]){
		DisplayMode compatibleModes[] = vc.getDisplayModes();
		for(int i = 0; i < modes.length; i++){
			for(int j = 0; j < compatibleModes.length; j++){
				if(displayModesMatch(modes[i], compatibleModes[j])){
					return modes[i];
				}
			}
		}
		return null;
	}
	
	private boolean displayModesMatch(DisplayMode displayMode, DisplayMode displayMode2) {
		if(displayMode.getWidth() != displayMode2.getWidth() || displayMode.getHeight() != displayMode2.getHeight()){
			return false;
		}
		if(displayMode.getBitDepth() != DisplayMode.BIT_DEPTH_MULTI && displayMode2.getBitDepth() != DisplayMode.BIT_DEPTH_MULTI && displayMode.getBitDepth() != displayMode2.getBitDepth()){
			return false;
		}
		if(displayMode.getRefreshRate() != DisplayMode.REFRESH_RATE_UNKNOWN && displayMode2.getRefreshRate() != DisplayMode.REFRESH_RATE_UNKNOWN && displayMode.getRefreshRate() != displayMode2.getRefreshRate()){
			return false;
		}
		return true;
	}

	public DisplayMode getCurrentDisplayMode(){
		return vc.getDisplayMode();
	}
	
	public void setFullScreen(DisplayMode dm){
		JFrame frame = new JFrame();
		frame.setUndecorated(true);
		frame.setIgnoreRepaint(true);
		frame.setResizable(false);
		vc.setFullScreenWindow(frame);
		
		if(dm != null && vc.isDisplayChangeSupported()){
			try {
				vc.setDisplayMode(dm);
			} catch(Exception ex){}
		}
		frame.createBufferStrategy(2);
	}
	
	public Graphics2D getGraphics(){
		Window window = vc.getFullScreenWindow();
		if(window != null){
			BufferStrategy strategy = window.getBufferStrategy();
			return (Graphics2D)strategy.getDrawGraphics();
		} else {
			return null;
		}
	}
	
	public void restoreScreen(){
		Window window = vc.getFullScreenWindow();
		if(window != null){
			window.dispose();
		}
		vc.setFullScreenWindow(null);
	}
	
	public BufferedImage createCompatibleImage(int width, int height, int alpha){
		Window window = vc.getFullScreenWindow();
		if(window != null){
			GraphicsConfiguration gfx_cfg = window.getGraphicsConfiguration();
			return gfx_cfg.createCompatibleImage(width, height, alpha);
		} else {
			return null;
		}
	}
	
	public Window getFullScreenWindow(){
		return vc.getFullScreenWindow();
	}
	
	public int getWidth(){
		Window window = vc.getFullScreenWindow();
		if(window != null){
			return window.getWidth();
		} else {
			return 0;
		}
	}
	
	public int getHeight(){
		Window window = vc.getFullScreenWindow();
		if(window != null){
			return window.getHeight();
		} else {
			return 0;
		}
	}
}
