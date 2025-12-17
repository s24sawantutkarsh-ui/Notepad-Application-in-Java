import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Notepad extends Frame implements ActionListener
{
    MenuItem m6, m7, m8, m9, m10, m11, m12, m13, m14, m15, m16;
    TextArea t1;

    Notepad()
    {
        setLayout(new BorderLayout());
        t1 = new TextArea();
        add(t1);

        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);

        Menu m1 = new Menu("file");
        Menu m2 = new Menu("edit");
        Menu m3 = new Menu("format");
        Menu m4 = new Menu("view");
        Menu m5 = new Menu("help");

        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);
        mbar.add(m4);
        mbar.add(m5);

        // file...
        m6 = new MenuItem("open");
        m1.add(m6);
        m6.addActionListener(this);

        m7 = new MenuItem("save as");
        m1.add(m7);
        m7.addActionListener(this);

        m8 = new MenuItem("exit");
        m1.add(m8);
        m8.addActionListener(this);

        // edit...
        m9 = new MenuItem("cut");
        m2.add(m9);

        m10 = new MenuItem("copy");
        m2.add(m10);

        m11 = new MenuItem("Paste");
        m2.add(m11);

        m12 = new MenuItem("delete");
        m2.add(m12);

        // format...
        m13 = new MenuItem("word wrap");
        m3.add(m13);

        m14 = new MenuItem("font");
        m3.add(m14);

        // view...
        m15 = new CheckboxMenuItem("Status bar");
        m4.add(m15);

        // help...
        m16 = new CheckboxMenuItem("about notepad");
        m5.add(m16);

        setSize(1500, 1000);
        setTitle("Notepad");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == m6)
        {
            FileDialog f2 = new FileDialog(this, "open", FileDialog.LOAD);
            f2.setVisible(true);
        }

        if (e.getSource() == m7)
        {
            FileDialog f1 = new FileDialog(this, "save as", FileDialog.SAVE);
            f1.setVisible(true);
        }

        if (e.getSource() == m8)
        {
            // System.exit(0);
            this.setVisible(false);
        }
    }

    public static void main(String args[])
    {
        Notepad n1 = new Notepad();
    }
}