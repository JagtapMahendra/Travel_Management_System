package Travel_Management;

import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewPackage extends JFrame
{
	private JPanel contentPane;
	Choice c1;

	

	public static void main(String[] args)
	{

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() 
			{

				try
				{
					ViewPackage frame = new ViewPackage("");
					frame.setVisible(true);
				}
				catch(Exception e)

				{
					e.printStackTrace();
				}
			}
			
		});
		
		
	}
	public ViewPackage(String username) 
	{
		setBounds(580,220,850,450);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		///Image space
		
		
		JLabel lblName = new JLabel("VIEW PACKAGE DETAILS");
		lblName.setFont(new Font("Yu Mincho",Font.PLAIN,20));
		lblName.setBounds(88, 11, 350, 53);
		contentPane.add(lblName);
		
		JLabel lb3 = new JLabel("username :");
		lb3.setBounds(35, 70, 200, 14);
		contentPane.add(lb3);
		
		JLabel l1 = new JLabel();
		l1.setBounds(271, 70, 200, 14);
		contentPane.add(l1);
		
		JLabel lblId = new JLabel("Package :");
		lblId.setBounds(35, 110, 200, 16);
		contentPane.add(lblId);
		

		JLabel l2 = new JLabel();
		l2.setBounds(271, 70, 200, 14);
		contentPane.add(l2);
		
		JLabel lblNo = new JLabel("Number of Persons");
		lblNo.setBounds(35, 150, 200, 14);
		contentPane.add(lblNo);
		
		JLabel l3 = new JLabel();
		l3.setBounds(271, 70, 200, 14);
		contentPane.add(l3);
		
		JLabel lblid = new JLabel("")
		
		
		
	}

}
