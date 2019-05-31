package Repository;



import Domain.Employee;

import java.io.*;

public class Employeerepository {



    public void save(Employee employee) {

        try {

            File file = new File("E:\\aptech.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file, true);
            String name=employee.getName();
            fileWriter.write(name);
            String address=employee.getAddress();
            fileWriter.write(address);
            String designation=employee.getDesignation();
            fileWriter.write(designation);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
    public void hasName(){
        try {

            FileInputStream fstream = new FileInputStream("E:\\aptech.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
           }
        } catch (Exception ex) {

        }



    }

}
