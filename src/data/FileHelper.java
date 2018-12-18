package data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

    public List<Payment> getPayments(String fileName) {
        List<Payment> payments = new ArrayList<>();
        readFile(fileName).forEach(a -> payments.add(getPayment(a)));
        return payments;
    }

    private List<String> readFile(String fileName) {
        List<String> results = new ArrayList<>();

        File file = new File(fileName);
        if (!file.exists())
            return results;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String tmp;
            while ((tmp = br.readLine()) != null) {
                results.add(tmp);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return results;
    }

    private Payment getPayment(String line) {
        line = line.replace("\"", " ");
        String[] splitted = line.split(",");
        return new Payment(
                splitted[0],
                splitted[1],
                splitted[2],
                splitted[3],
                Double.valueOf(splitted[4].equals("  ") ? "0" : splitted[4]),
                Double.valueOf(splitted[5].equals("  ") ? "0" : splitted[5]),
                splitted[6],
                Double.valueOf(splitted[7].equals("  ") ? "0" : splitted[7]),
                splitted[8],
                Double.valueOf(splitted[9].equals("  ") ? "0" : splitted[9]),
                splitted[10],
                splitted[11],
                splitted[12]
        );
    }
}
