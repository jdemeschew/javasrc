import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.util.regex.*;

/** Standalone Swing GUI application for demonstrating REs.
 * @author	Ian Darwin, ian@darwinsys.com
 * @version #Id$
 */
public class REDemo extends JPanel {
	Pattern pattern;
	Matcher matcher;
	JTextField patternTF, stringTF;
	JCheckBox compiledOK, matches;
	JRadioButton match, find, findAll;
	JTextField findCountTF;

	/** "main program" method - construct and show */
	public static void main(String[] av) {
		final JFrame f = new JFrame("REDemo");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		REDemo comp = new REDemo();
		f.setContentPane(comp);
		f.pack();
		f.setLocation(200, 200);
		f.setVisible(true);
	}

	/** Construct the REDemo object including its GUI */
	public REDemo() {
		super();
		JPanel top = new JPanel();
		top.add(new JLabel("Pattern:", JLabel.RIGHT));
		patternTF = new JTextField(20);
		top.add(patternTF);
		compiledOK = new JCheckBox("Compiled OK?");
		// compiledOK.setEditable(false);
		top.add(compiledOK);

		JPanel mid = new JPanel();
		mid.add(new JLabel("String:", JLabel.RIGHT));
		stringTF = new JTextField(20);
		mid.add(stringTF);
		matches = new JCheckBox("Matches?");
		// matches.setEditable(false);
		mid.add(matches);

		JPanel bot = new JPanel();
		ButtonGroup bg = new ButtonGroup();
		match = new JRadioButton("Match");
		match.setSelected(true);
		bg.add(match);
		bot.add(match);
		find = new JRadioButton("Find");
		bg.add(find);
		bot.add(find);
		findAll = new JRadioButton("Find All");
		bg.add(findAll);
		bot.add(findAll);
		findCountTF = new JTextField(3);
		bot.add(findCountTF);

		setLayout(new GridLayout(3, 1, 5, 5));
		add(top);
		add(mid);
		add(bot);
	}
}