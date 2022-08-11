package Admin;

import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaiKhoan {
    private String tenDangNhap;
    private Boolean isAdmin = false;
    private int ln;

    public Boolean getAdmin() {
        return isAdmin;
    }

    //get line
    public int getLn() {
        return ln;
    }


    private void readfile(String fileName ) {
        try{
            FileReader fr = new FileReader(fileName);

            fr.close();

        } catch (FileNotFoundException ex){
            try {
                FileWriter fr = new FileWriter(fileName);

            } catch (IOException ex1) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    void countLines(String fileName)
    {
        try {
            ln = 1;
            RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
            for (int i = 0; raf.readLine() != null; i++)
            {
                ln++;
            }

        } catch (IOException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void addData(String usr, String pswd, String Filename)
    {
        try {
            RandomAccessFile raf = new RandomAccessFile(Filename, "rw");
            for(int i = 0; i < ln; i++)
            {
                raf.readLine();
            }

            raf.writeBytes("Username:"+usr+"\n");
            raf.writeBytes("Password:"+pswd+"\n");
            raf.close();

        } catch (IOException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    Boolean login(String usr, String pswd, String FileName)
    {
        try {


            RandomAccessFile raf = new RandomAccessFile(FileName, "rw");
            countLines(FileName);

            for(int i = 0; i < ln - 1; i+=2)
            {
                String forUser = raf.readLine().substring(9);
                String forPswd = raf.readLine().substring(9);

                if(usr.equals("admin") & pswd.equals("123"))
                {
                    isAdmin = true;
                    tenDangNhap = "admin";
                    return true;
                }
                else if (usr.equals(forUser) & pswd.equals(forPswd))
                {
                    tenDangNhap = forUser;
                    return true;
                }

            }
            raf.close();
        }
        catch (IOException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
