package Base;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Random;

public class BaseLib{
    Random rand = new Random();

    public int randomNumber() {
        int randomInt = rand.nextInt(1000000);
        return randomInt;
    }

    public String randomUser() throws IOException{
        RandomAccessFile file = new RandomAccessFile("documents/users.txt", "r");
        long fileLength = file.length();
        Random rand = new Random();
        long randomLineNumber = (long) (rand.nextDouble() * fileLength);
        file.seek(randomLineNumber);
        String randomLineUser = file.readLine();
        file.close();
        return randomLineUser;
    }

    public BaseLib writeNewUser(String userName) {
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream(new File("documents/users.txt"), true));
            writer.println(userName);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return this;
    }
}
