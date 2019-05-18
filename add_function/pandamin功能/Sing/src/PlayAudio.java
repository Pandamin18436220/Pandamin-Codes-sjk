

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.NoPlayerException;
import javax.media.Player;


public class PlayAudio implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String path=new String();
		File directory=new File("");
		try{
			path=directory.getCanonicalPath();
		}catch(IOException e2){
			e2.printStackTrace();
		}
		path=path+"\\sound\\yychat提示音.mp3";
		path=path.replace("\\","/");
		path="file:///"+path;
		
		URL url=null;
		try{
			url=new URL(path);
		}catch(MalformedURLException e1){
			e1.printStackTrace();
		}
		MediaLocator ml=null;
		ml=new MediaLocator(url);
		Player player=null;
		try{
			player=Manager.createPlayer(ml);
		}catch(NoPlayerException e){
			e.printStackTrace();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		player.prefetch();
		player.start();
		//让线程睡眠1秒
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		player.stop();
		player.close();
	}
	
	
	
}
