package time;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//import com.yychat.model.Message;
//import com.yychatclient.controller.ClientConnect;

public class Showtime extends JFrame implements ActionListener{
	JButton jb;
	JTextArea jta;
	JPanel jp;
	public Showtime(){
		jb=new JButton("��ʾʱ��");
		
		jb.addActionListener(this);
		
		jp=new JPanel();
		jta=new JTextArea();
		jp.add(jb);
		this.add(jp);
		this.add(jta);
		this.add(jp,"South");
		

		this.setSize(350,240);//���ô��ڴ�С
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showtime showtime=new Showtime();
	}
	

	@Override
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb) {
			//public String save()throws Exception{
				String time =new SimpleDateFormat("yyyy-mm-dd-hh:mm:ss").format(new java.util.Date());
				 jta.append(time+"\r\n");
		//	}
	}

}
}
