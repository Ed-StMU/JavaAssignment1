import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class TempConverter extends JFrame {

	private JPanel panel;
	private JLabel celsiusLabel;
	private JLabel fahrenLabel;
	private JTextField celsiusText;
	private JTextField fahrenText;
	private JButton button;

	public TempConverter() {

		super("Temperature Converter");

		panel = new JPanel();
		celsiusLabel = new JLabel("Celsius: ");
		fahrenLabel = new JLabel("Fahrenheit: ");
		celsiusText = new JTextField(5);
		fahrenText = new JTextField(5);
		fahrenText.setEditable(false);
		button = new JButton("Convert");
		button.addActionListener(new ButtonListener());

		panel.add(celsiusLabel);
		panel.add(celsiusText);
		panel.add(fahrenLabel);
		panel.add(fahrenText);
		panel.add(button);

		add(panel);
		pack();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String str;
			double fahrenheit;
			DecimalFormat df = new DecimalFormat("#.0#");

			str = celsiusText.getText();
			fahrenheit = Double.parseDouble(str) * (9.0 / 5) + 32;
			fahrenText.setText(df.format(fahrenheit));
		}
	}

	public static void main(String[] args) {
		new TempConverter();
	}
}
