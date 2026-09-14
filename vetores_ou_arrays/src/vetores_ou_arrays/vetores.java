package vetores_ou_arrays;
import javax.swing.JOptionPane;
public class vetores {
	public static void main(String[] args) {

		int a[] = new int [10];
		String message = "números em linha:", t ="";
		
		for (int i = 0; i <= 9; i++) {
		   a[i] = Integer.parseInt(JOptionPane.showInputDialog("digite o número"));
		   t = t + a[i] + ", ";
		   JOptionPane.showMessageDialog(null, message + t);
		}
		
		t = "";
		
		for (int i = 0; i <= 9; i++) {
		 t = t + a[i] + "\n";
		}
		
		JOptionPane.showMessageDialog(null, message + "\n" + t);

	}

}
