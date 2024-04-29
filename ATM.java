//ba classe JPasswordField tavasote chatgpt ashna shodam
//baghie code ro be komake doc e tozihat hal kardam
//https://youtu.be/Kmgo00avvEw?si=9iVCwkqxjYi_NHap
//Dar fil e zip, dar kenar code, file fonte entekhabi ham hast

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM implements ActionListener {
    JFrame frame1, frame2Fa, frameMainFa, frameFinalFa;
    JFrame framePassChangeFa, frameInventoryFa, frameCashFa, frameTransferFa;
    JLabel lanLabelFa, lanLabelEn;
    JLabel passLabelFa, passChangeLabelFa, inventoryLabelFa, cashLabelFa, transferCashLabelFa, transferNumLabelFa;
    JLabel finalLabelFa;
    JButton lanButtonFa, lanButtonEn;
    JButton confirmPassButtonFa, confirmButtonFa;
    JButton passChangeButtonFa, inventoryButtonFa, transferButtonFa, cashButtonFa;
    JButton exitButtonFa, backButtonFa;
    JPasswordField passInput;
    JTextField transferInput, numInput, cashInput;
    JPanel panel1;
    Font font = new Font("Shabnam", Font.BOLD, 35);

    ATM() {
        //Determining frames and panels
        frame1 = new JFrame("ATM");
        frame1.setSize(1000, 600);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setLocationRelativeTo(null);
        frame1.setLayout(null);
        frame1.setResizable(false);
        frame1.getContentPane().setBackground(new Color(0x7F1E1E));

        frame2Fa = new JFrame("ATM");
        frame2Fa.setSize(1000, 600);
        frame2Fa.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame2Fa.setLocationRelativeTo(null);
        frame2Fa.setLayout(null);
        frame2Fa.setResizable(false);
        frame2Fa.getContentPane().setBackground(new Color(0x7F1E1E));

        frameMainFa = new JFrame("ATM");
        frameMainFa.setSize(1000, 600);
        frameMainFa.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameMainFa.setLocationRelativeTo(null);
        frameMainFa.setLayout(null);
        frameMainFa.setResizable(false);
        frameMainFa.getContentPane().setBackground(new Color(0x7F1E1E));

        framePassChangeFa = new JFrame("ATM");
        framePassChangeFa.setSize(1000, 600);
        framePassChangeFa.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        framePassChangeFa.setLocationRelativeTo(null);
        framePassChangeFa.setLayout(null);
        framePassChangeFa.setResizable(false);
        framePassChangeFa.getContentPane().setBackground(new Color(0x7F1E1E));

        frameInventoryFa = new JFrame("ATM");
        frameInventoryFa.setSize(1000, 600);
        frameInventoryFa.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameInventoryFa.setLocationRelativeTo(null);
        frameInventoryFa.setLayout(null);
        frameInventoryFa.setResizable(false);
        frameInventoryFa.getContentPane().setBackground(new Color(0x7F1E1E));

        frameCashFa = new JFrame("ATM");
        frameCashFa.setSize(1000, 600);
        frameCashFa.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameCashFa.setLocationRelativeTo(null);
        frameCashFa.setLayout(null);
        frameCashFa.setResizable(false);
        frameCashFa.getContentPane().setBackground(new Color(0x7F1E1E));

        frameTransferFa = new JFrame("ATM");
        frameTransferFa.setSize(1000, 600);
        frameTransferFa.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameTransferFa.setLocationRelativeTo(null);
        frameTransferFa.setLayout(null);
        frameTransferFa.setResizable(false);
        frameTransferFa.getContentPane().setBackground(new Color(0x7F1E1E));

        frameFinalFa = new JFrame("ATM");
        frameFinalFa.setSize(1000, 600);
        frameFinalFa.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameFinalFa.setLocationRelativeTo(null);
        frameFinalFa.setLayout(null);
        frameFinalFa.setResizable(false);
        frameFinalFa.getContentPane().setBackground(new Color(0x7F1E1E));


        //Determining Labels and text field
        lanLabelEn = new JLabel("Choose Language");
        lanLabelEn.setFont(font);
        lanLabelEn.setForeground(Color.WHITE);
        lanLabelEn.setBounds(350, 50, 400, 50);

        lanLabelFa = new JLabel("زبان را انتخاب کنید");
        lanLabelFa.setFont(font);
        lanLabelFa.setForeground(Color.WHITE);
        lanLabelFa.setBounds(370, 450, 400, 50);

        passLabelFa = new JLabel("لطفا رمز خود را وارد نمایید:");
        passLabelFa.setFont(font);
        passLabelFa.setForeground(Color.WHITE);
        passLabelFa.setBounds(315, 150, 450, 50);

        passChangeLabelFa = new JLabel("رمز جدید را وارد کنید:");
        passChangeLabelFa.setFont(font);
        passChangeLabelFa.setForeground(Color.WHITE);
        passChangeLabelFa.setBounds(330, 150, 400, 50);

        finalLabelFa = new JLabel("عملیات با موفقیت انجام شد!");
        finalLabelFa.setFont(font);
        finalLabelFa.setForeground(Color.WHITE);
        finalLabelFa.setBounds(275, 150, 600, 50);

        inventoryLabelFa = new JLabel("موجودی حساب شما: 123456789 ریال");
        inventoryLabelFa.setFont(font);
        inventoryLabelFa.setForeground(Color.WHITE);
        inventoryLabelFa.setBounds(175, 150, 700, 50);

        cashLabelFa = new JLabel("مبلغ مورد نظر را وارد نمایید:");
        cashLabelFa.setFont(font);
        cashLabelFa.setForeground(Color.WHITE);
        cashLabelFa.setBounds(280, 150, 750, 50);

        transferCashLabelFa = new JLabel("مبلغ مورد نظر را وارد نمایید:");
        transferCashLabelFa.setFont(font);
        transferCashLabelFa.setForeground(Color.WHITE);
        transferCashLabelFa.setBounds(280, 100, 750, 50);

        transferNumLabelFa = new JLabel("شماره کارت مقصد را وارد کنید:");
        transferNumLabelFa.setFont(font);
        transferNumLabelFa.setForeground(Color.WHITE);
        transferNumLabelFa.setBounds(280, 250, 750, 50);

        passInput = new JPasswordField();
        passInput.setBounds(310, 250, 400, 50);
        passInput.setFont(new Font("Shabnam", Font.BOLD, 60));

        cashInput = new JTextField();
        cashInput.setBounds(300, 250, 400, 50);
        cashInput.setFont(new Font("Shabnam", Font.BOLD, 50));

        transferInput = new JTextField();
        transferInput.setBounds(300, 150, 400, 50);
        transferInput.setFont(new Font("Shabnam", Font.BOLD, 50));

        numInput = new JTextField();
        numInput.setBounds(300, 300, 400, 50);
        numInput.setFont(new Font("Shabnam", Font.BOLD, 50));

        //Determining buttons
        lanButtonEn = new JButton("English");
        lanButtonEn.setFont(font);
        lanButtonEn.setBackground(Color.LIGHT_GRAY);
        lanButtonEn.setBounds(25, 225, 200, 100);
        lanButtonEn.setFocusable(false);
        lanButtonEn.addActionListener(this);

        lanButtonFa = new JButton("فارسی");
        lanButtonFa.setFont(font);
        lanButtonFa.setBackground(Color.LIGHT_GRAY);
        lanButtonFa.setBounds(750, 225, 200, 100);
        lanButtonFa.setFocusable(false);
        lanButtonFa.addActionListener(this);

        confirmPassButtonFa = new JButton("ثبت");
        confirmPassButtonFa.setFont(font);
        confirmPassButtonFa.setBackground(Color.LIGHT_GRAY);
        confirmPassButtonFa.setFocusable(false);
        confirmPassButtonFa.addActionListener(this);
        confirmPassButtonFa.setBounds(400, 350, 200, 100);

        confirmButtonFa = new JButton("تایید");
        confirmButtonFa.setFont(font);
        confirmButtonFa.setBackground(Color.LIGHT_GRAY);
        confirmButtonFa.setFocusable(false);
        confirmButtonFa.addActionListener(this);
        confirmButtonFa.setBounds(500, 400, 200, 100);

        passChangeButtonFa = new JButton("تغییر رمز");
        passChangeButtonFa.setFont(font);
        passChangeButtonFa.setBackground(Color.LIGHT_GRAY);
        passChangeButtonFa.setBounds(700, 300, 300, 100);
        passChangeButtonFa.setFocusable(false);
        passChangeButtonFa.addActionListener(this);

        inventoryButtonFa = new JButton("اعلام موجودی");
        inventoryButtonFa.setFont(font);
        inventoryButtonFa.setBackground(Color.LIGHT_GRAY);
        inventoryButtonFa.setBounds(700, 100, 300, 100);
        inventoryButtonFa.setFocusable(false);
        inventoryButtonFa.addActionListener(this);

        cashButtonFa = new JButton("برداشت وجه");
        cashButtonFa.setFont(font);
        cashButtonFa.setBackground(Color.LIGHT_GRAY);
        cashButtonFa.setBounds(0, 100, 300, 100);
        cashButtonFa.setFocusable(false);
        cashButtonFa.addActionListener(this);

        transferButtonFa = new JButton("کارت به کارت");
        transferButtonFa.setFont(font);
        transferButtonFa.setBackground(Color.LIGHT_GRAY);
        transferButtonFa.setBounds(0, 300, 300, 100);
        transferButtonFa.setFocusable(false);
        transferButtonFa.addActionListener(this);

        exitButtonFa = new JButton("لغو");
        exitButtonFa.setFont(font);
        exitButtonFa.setBackground(Color.LIGHT_GRAY);
        exitButtonFa.setFocusable(false);
        exitButtonFa.addActionListener(this);
        exitButtonFa.setBounds(400, 400, 200, 100);

        backButtonFa = new JButton("برگشت");
        backButtonFa.setFont(font);
        backButtonFa.setBackground(Color.LIGHT_GRAY);
        backButtonFa.setFocusable(false);
        backButtonFa.addActionListener(this);
        backButtonFa.setBounds(300, 400, 200, 100);


        frame1.add(lanLabelEn);
        frame1.add(lanLabelFa);
        frame1.add(lanButtonEn);
        frame1.add(lanButtonFa);

        frame2Fa.add(confirmPassButtonFa);
        frame2Fa.add(passLabelFa);

        frameMainFa.add(passChangeButtonFa);
        frameMainFa.add(inventoryButtonFa);
        frameMainFa.add(cashButtonFa);
        frameMainFa.add(transferButtonFa);
        frameMainFa.add(exitButtonFa);

        frameFinalFa.add(finalLabelFa);

        framePassChangeFa.add(passChangeLabelFa);

        frameInventoryFa.add(inventoryLabelFa);

        frameCashFa.add(cashLabelFa);
        frameCashFa.add(cashInput);

        frameTransferFa.add(transferInput);
        frameTransferFa.add(numInput);
        frameTransferFa.add(transferCashLabelFa);
        frameTransferFa.add(transferNumLabelFa);

        frame1.setVisible(true);

    }


    public static void main(String[] args) {
        ATM atm = new ATM();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==lanButtonFa){
            frame2Fa.setVisible(true);
            frame1.setVisible(false);
            passInput.setText("");
            frame2Fa.add(passInput);
        }
        if(e.getSource()== confirmPassButtonFa){
            frameMainFa.setVisible(true);
            frame2Fa.setVisible(false);
            passInput.setText("");

        }
        if(e.getSource()== confirmButtonFa){
            //hamaro false mikonam bejoz safheye nahayi chon malum nist tu kudum safhe hastim
            frameCashFa.remove(backButtonFa);
            frameTransferFa.remove(backButtonFa);
            frameInventoryFa.remove(backButtonFa);
            framePassChangeFa.remove(backButtonFa);
            frameFinalFa.add(backButtonFa);
            passInput.setText("");

            frameFinalFa.setVisible(true);
            frameInventoryFa.setVisible(false);
            frameCashFa.setVisible(false);
            frameTransferFa.setVisible(false);
            framePassChangeFa.setVisible(false);
        }
        if(e.getSource()== backButtonFa){
            //hamaro false mikonam bejoz safheye asli chon malum nist tu kudum safhe hastim
            frameMainFa.setVisible(true);
            frameInventoryFa.setVisible(false);
            frameCashFa.setVisible(false);
            frameTransferFa.setVisible(false);
            framePassChangeFa.setVisible(false);
            frameFinalFa.setVisible(false);
        }
        if(e.getSource()== exitButtonFa){
            frame1.setVisible(true);
            frameMainFa.setVisible(false);
        }
        if(e.getSource()== passChangeButtonFa){
            //Dokme tayid va bargasht ro az baghie safhe ha hazf va be safhe feli ezafe mikonam
            //majburam baraye hame safhe ha bejoz safhe feli remove bezaram chon nemidunim tu kudum safhe hastim
            //az in farayand baraye jelogiri az tolid dokmehaye ezafi ba karkarde yeksan estefade kardam
            //dar safhe haye amaliatie digar ham haminkar ro mikonam
            frameCashFa.remove(confirmButtonFa);
            frameTransferFa.remove(confirmButtonFa);
            frameInventoryFa.remove(confirmButtonFa);
            framePassChangeFa.add(confirmButtonFa);

            frameCashFa.remove(backButtonFa);
            frameTransferFa.remove(backButtonFa);
            frameInventoryFa.remove(backButtonFa);
            frameFinalFa.remove(backButtonFa);
            framePassChangeFa.add(backButtonFa);
            framePassChangeFa.setVisible(true);
            frameMainFa.setVisible(false);
            frame2Fa.remove(passInput);
            framePassChangeFa.add(passInput);
        }
        if(e.getSource()== inventoryButtonFa){
            framePassChangeFa.remove(confirmButtonFa);
            frameCashFa.remove(confirmButtonFa);
            frameTransferFa.remove(confirmButtonFa);
            frameInventoryFa.add(confirmButtonFa);

            framePassChangeFa.remove(backButtonFa);
            frameCashFa.remove(backButtonFa);
            frameTransferFa.remove(backButtonFa);
            frameFinalFa.remove(backButtonFa);
            frameInventoryFa.add(backButtonFa);

            frameInventoryFa.setVisible(true);
            frameFinalFa.setVisible(false);
        }
        if(e.getSource()== cashButtonFa){
            framePassChangeFa.remove(confirmButtonFa);
            frameInventoryFa.remove(confirmButtonFa);
            frameTransferFa.remove(confirmButtonFa);
            frameCashFa.add(confirmButtonFa);

            framePassChangeFa.remove(backButtonFa);
            frameInventoryFa.remove(backButtonFa);
            frameTransferFa.remove(backButtonFa);
            frameFinalFa.remove(backButtonFa);
            frameCashFa.add(backButtonFa);

            frameCashFa.setVisible(true);
            frameMainFa.setVisible(false);
        }
        if(e.getSource()== transferButtonFa){
            framePassChangeFa.remove(confirmButtonFa);
            frameCashFa.remove(confirmButtonFa);
            frameInventoryFa.remove(confirmButtonFa);
            frameTransferFa.add(confirmButtonFa);

            framePassChangeFa.remove(backButtonFa);
            frameCashFa.remove(backButtonFa);
            frameInventoryFa.remove(backButtonFa);
            frameFinalFa.remove(backButtonFa);
            frameTransferFa.add(backButtonFa);

            frameTransferFa.setVisible(true);
            frameMainFa.setVisible(false);
        }

    }
}
