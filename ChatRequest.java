import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

class ChatRequest extends JDialog {
		
		public ChatRequest(String id) {
			setSize(150,80);
			
	        Container con = getContentPane();
	        con.setLayout(new GridLayout(2,1));
	        
	        JOptionPane.showConfirmDialog(con, "1��1 ä���� �����Ͻðڽ��ϱ�?","1��1 ä�� ����",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,null);
	        
			setVisible(true);
	        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		}
	}