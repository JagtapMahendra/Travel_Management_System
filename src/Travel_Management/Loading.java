package Travel_Management;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable
{

	private JPanel contentPane;
	private JProgressBar ProgressBar;
	
	Connection conn;
	String username;
	int s;
	Thread th;
	
	
	
	public static void main(String[] args)
	{

		new Loading("").setVisible(true);
	}
	
	public void setUploading()
	{
		setVisible(false);
		th.start();
	}
	
	@Override
	public void run() 
	{
		try
		{
			for(int i =0 ;i<200;i++)
			{
				s=s+1;
				int m = ProgressBar.getMaximum();
				int v = ProgressBar.getValue();
				
				if(v<m)
				{
					ProgressBar.setValue(ProgressBar.getValue()+1);
				}
				else
				{
					i=201;
					setVisible(false);
					new Home(username).setVisible(true);
				}
				Thread.sleep(50);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public Loading(String username)
	{
		this.username = username;
        th = new Thread((Runnable) this);
        
        setBounds(600, 300, 600, 400);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(51,204, 255));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lbllibraryManagement = new JLabel("Travel and Toursim Management  ");
        lbllibraryManagement.setForeground(new Color(72, 209, 204));
        lbllibraryManagement.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
        lbllibraryManagement.setBounds(50, 46, 700, 35);
        contentPane.add(lbllibraryManagement);
        
        ProgressBar = new JProgressBar();
        ProgressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
        ProgressBar.setStringPainted(true);
        ProgressBar.setBounds(130, 135, 300, 25);
        contentPane.add(ProgressBar);
		
        JLabel lblNewLabel_2 = new JLabel("Please Wait....");
        lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        lblNewLabel_2.setForeground(new Color(160, 82, 45));
        lblNewLabel_2.setBounds(200, 165, 150, 20);
        contentPane.add(lblNewLabel_2);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(10, 10, 580, 380);
        contentPane.add(panel);
          
        setUndecorated(true);
        setUploading();
	}
}
