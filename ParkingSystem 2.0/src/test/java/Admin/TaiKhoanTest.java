package Admin;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static org.junit.jupiter.api.Assertions.*;

class TaiKhoanTest {

    @Test
    void countLines() {
        TaiKhoan tk = new TaiKhoan();
        tk.countLines("src/main/java/Resources/Accounts.txt");
        System.out.println(tk.getLn());
        assertTrue(tk.getLn() > 0);
    }


    @Test
    void addData() throws FileNotFoundException {
        File file = new File("src/main/java/Resources/AccountsTest2.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();

        TaiKhoan tk = new TaiKhoan();
        tk.addData("admin", "admin", "src/main/java/Resources/AccountsTest2.txt");
        assertTrue(tk.login("admin", "admin", "src/main/java/Resources/AccountsTest2.txt"));

    }

    @Test
    void login() {
        TaiKhoan tk = new TaiKhoan();
        assertTrue(tk.login("admin1", "123", "src/main/java/Resources/AccountsTest.txt"));
    }
}