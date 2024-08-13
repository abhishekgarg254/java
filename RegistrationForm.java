import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel password;
    private JPasswordField tpassword;
    private JLabel email;
    private JTextField temail;
    private JButton sub;
    private JLabel res;
    private JTextArea tres;

    // Constructor to setup GUI components and event handling
    public RegistrationForm() {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        password = new JLabel("Password");
        password.setFont(new Font("Arial", Font.PLAIN, 20));
        password.setSize(100, 20);
        password.setLocation(100, 150);
        c.add(password);

        tpassword = new JPasswordField();
        tpassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tpassword.setSize(190, 20);
        tpassword.setLocation(200, 150);
        c.add(tpassword);

        email = new JLabel("Email");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setSize(100, 20);
        email.setLocation(100, 200);
        c.add(email);

        temail = new JTextField();
        temail.setFont(new Font("Arial", Font.PLAIN, 15));
        temail.setSize(190, 20);
        temail.setLocation(200, 200);
        c.add(temail);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 250);
        sub.addActionListener(this);
        c.add(sub);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 300);
        c.add(res);

        tres = new JTextArea();
        tres.setFont(new Font("Arial", Font.PLAIN, 15));
        tres.setSize(200, 75);
        tres.setLocation(580, 100);
        tres.setLineWrap(true);
        tres.setEditable(false);
        c.add(tres);

        setVisible(true);
    }

    // Method to process the actions
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            String data = "Name : " + tname.getText() + "\n"
                        + "Password : " + new String(tpassword.getPassword()) + "\n"
                        + "Email : " + temail.getText() + "\n";
            tres.setText(data);
            res.setText("Registration Successful..");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}