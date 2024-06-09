//2.Program to create job application form:
import javax.swing.*;

public class Exp7_2 {
    public Exp7_2() {
        // Create the frame
        JFrame jframe = new JFrame("Job Application Form");
        jframe.setLayout(null);
        jframe.setSize(650, 700);  // Adjusted size for better form layout
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title Label
        JLabel jlabel = new JLabel("JOB APPLICATION FORM");
        jlabel.setBounds(200, 10, 200, 30); // x, y, width, height
        jframe.add(jlabel);

        // Name Label
        JLabel jlabel1 = new JLabel("Name:");
        jlabel1.setBounds(50, 60, 100, 25);
        jframe.add(jlabel1);

        // Date of Birth Label
        JLabel jlabel2 = new JLabel("Date Of Birth:");
        jlabel2.setBounds(50, 100, 100, 25);
        jframe.add(jlabel2);

        // Gender Label
        JLabel jlabel3 = new JLabel("Select Gender:");
        jlabel3.setBounds(50, 140, 100, 25);
        jframe.add(jlabel3);

        // Email Label
        JLabel jlabel4 = new JLabel("Email:");
        jlabel4.setBounds(50, 180, 100, 25);
        jframe.add(jlabel4);

        // State Label
        JLabel jlabel5 = new JLabel("Select State:");
        jlabel5.setBounds(50, 220, 100, 25);
        jframe.add(jlabel5);

        // Current Status Label
        JLabel jlabel6 = new JLabel("Current Status:");
        jlabel6.setBounds(50, 260, 100, 25);
        jframe.add(jlabel6);

        // Resume Link Label
        JLabel jlabel7 = new JLabel("Resume Link:");
        jlabel7.setBounds(50, 300, 100, 25);
        jframe.add(jlabel7);

        // Qualification Label
        JLabel jlabel8 = new JLabel("Qualification:");
        jlabel8.setBounds(50, 340, 100, 25);
        jframe.add(jlabel8);

        // Applying Position Label
        JLabel jlabel9 = new JLabel("Applying Position:");
        jlabel9.setBounds(50, 410, 120, 25);
        jframe.add(jlabel9);

        // Job Type Label
        JLabel jlabel10 = new JLabel("Job Type:");
        jlabel10.setBounds(50, 480, 100, 25);
        jframe.add(jlabel10);

        // Submit Button
        JButton b1 = new JButton("SUBMIT");
        b1.setBounds(250, 530, 100, 30);
        jframe.add(b1);

        // Gender Radio Buttons
        JRadioButton jradiobutton1 = new JRadioButton("Male");
        jradiobutton1.setBounds(200, 140, 80, 25);
        jframe.add(jradiobutton1);

        JRadioButton jradiobutton2 = new JRadioButton("Female");
        jradiobutton2.setBounds(300, 140, 80, 25);
        jframe.add(jradiobutton2);

        // Group Gender Radio Buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(jradiobutton1);
        genderGroup.add(jradiobutton2);

        // Current Status Radio Buttons
        JRadioButton jradiobutton3 = new JRadioButton("Employed");
        jradiobutton3.setBounds(200, 260, 100, 25);
        jframe.add(jradiobutton3);

        JRadioButton jradiobutton4 = new JRadioButton("Unemployed");
        jradiobutton4.setBounds(300, 260, 100, 25);
        jframe.add(jradiobutton4);

        JRadioButton jradiobutton5 = new JRadioButton("Self-Employed");
        jradiobutton5.setBounds(400, 260, 130, 25);
        jframe.add(jradiobutton5);

        JRadioButton jradiobutton6 = new JRadioButton("Student");
        jradiobutton6.setBounds(530, 260, 80, 25);
        jframe.add(jradiobutton6);

        // Group Current Status Radio Buttons
        ButtonGroup statusGroup = new ButtonGroup();
        statusGroup.add(jradiobutton3);
        statusGroup.add(jradiobutton4);
        statusGroup.add(jradiobutton5);
        statusGroup.add(jradiobutton6);

        // Job Type Radio Buttons
        JRadioButton jradiobutton7 = new JRadioButton("Full Time");
        jradiobutton7.setBounds(200, 480, 100, 25);
        jframe.add(jradiobutton7);

        JRadioButton jradiobutton8 = new JRadioButton("Part Time");
        jradiobutton8.setBounds(300, 480, 100, 25);
        jframe.add(jradiobutton8);

        JRadioButton jradiobutton9 = new JRadioButton("Temporary");
        jradiobutton9.setBounds(400, 480, 100, 25);
        jframe.add(jradiobutton9);

        // Group Job Type Radio Buttons
        ButtonGroup jobTypeGroup = new ButtonGroup();
        jobTypeGroup.add(jradiobutton7);
        jobTypeGroup.add(jradiobutton8);
        jobTypeGroup.add(jradiobutton9);

        // Name Text Area
        JTextArea t1 = new JTextArea();
        t1.setBounds(200, 60, 300, 25);
        jframe.add(t1);

        // Date of Birth Text Area
        JTextArea t2 = new JTextArea();
        t2.setBounds(200, 100, 150, 25);
        jframe.add(t2);

        // Email Text Area
        JTextArea t3 = new JTextArea();
        t3.setBounds(200, 180, 300, 25);
        jframe.add(t3);

        // Resume Link Text Area
        JTextArea t4 = new JTextArea();
        t4.setBounds(200, 300, 300, 25);
        jframe.add(t4);

        // Qualification Text Area
        JTextArea t5 = new JTextArea();
        t5.setBounds(200, 340, 300, 50);
        jframe.add(t5);

        // Applying Position Text Area
        JTextArea t6 = new JTextArea();
        t6.setBounds(200, 410, 300, 50);
        jframe.add(t6);

        // State ComboBox
        JComboBox<String> State = new JComboBox<>(new String[] { "Select State", "Maharashtra", "UP", "MP", "Bihar", "Rajasthan" });
        State.setBounds(200, 220, 150, 25);
        jframe.add(State);

        // Make the frame visible
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        new Exp7_2();
    }
}
