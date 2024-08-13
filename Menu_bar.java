import java.awt.*; 
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*;
public class Menu_bar extends JFrame implements ActionListener
{ Container c1 = getContentPane(); 
JMenuBar mb;
JMenu f; 
JMenu e; 
JMenu cl; 
JMenuItem op; 
JMenuItem sv; 
JMenuItem ct;
JMenuItem cp; 
JMenuItem r; 
JMenuItem g; 
JMenuItem b; 
JButton btn;
public Menu_bar() {
super("Menu Bar"); 
setLayout(null);
mb = new JMenuBar(); 
f = new JMenu("File"); e = new JMenu("Edit");
cl
= new JMenu("Color");
op
= new JMenuItem("Open"); 
sv = new JMenuItem("Save"); 
ct = new JMenuItem("Cut");
cp
= new JMenuItem("Copy"); 
r = new JMenuItem("Red"); g = new JMenuItem("Green"); 
b = new JMenuItem("Blue"); 
btn = new JButton("OK"); 
f.add(op);
f.add(sv);
e.add(ct);
e.add(cp);
e.add(cl);
cl.add(r);
cl.add(g);
cl.add(b);
mb.add(f);
mb.add(e);
add(btn);
setJMenuBar(mb); 
pack(); 
setSize(500, 500); 
setVisible(true);
r.addActionListener(this); 
g.addActionListener(this); 
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
if (ae.getSource() == r) { 
c1.setBackground(new Color(255, 0, 0));
} else if (ae.getSource() == g) { 
c1.setBackground(new Color(0, 255, 0));
} else if (ae.getSource() == b) { 
c1.setBackground(new Color(0, 0, 255));
}
}
public static void main(String s[]) {
Menu_bar ob
= new Menu_bar();}}