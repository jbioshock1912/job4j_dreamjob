package store;

import model.Candidate;
import model.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PsqlMain {
    public static void main(String[] args) {

        List<Map<String, String>> employee = new ArrayList();
        Map<String, String> info1 = new HashMap<>();
        info1.put("Имя", "Кирилл");
        info1.put("Возраст", "26");
        info1.put("Должность", "Middle java dev");
        info1.put("Зарплата", "150000 руб");
        employee.add(info1);

        Map<String, String> info2 = new HashMap<>();
        info2.put("Имя", "Виталий");
        info2.put("Возраст", "28");
        info2.put("Должность", "Senior java automation QA");
        info2.put("Зарплата", "2000$");
        employee.add(info2);

        Map<String, String> info3 = new HashMap<>();
        info3.put("Имя", "Александр");
        info3.put("Возраст", "31");
        info3.put("Должность", "junior functional tester");
        info3.put("Зарплата", "50000 руб");
        employee.add(info3);

        Map<String, String> info4 = new HashMap<>();
        info4.put("Имя", "Дементий");
        info4.put("Возраст", "35");
        info4.put("Должность", "dev-ops");
        info4.put("Зарплата", "1500$");
        employee.add(info4);
        getAverageAge(employee);
        System.out.println("////");
        getEmployeesByAge(employee);
        System.out.println("////");
        getEmployeesBySalary(employee);
    }

    private static void getEmployeesByAge(List<Map<String, String>> employee) {
        for (Map<String, String> data : employee) {
            String age = data.get("Возраст");
            if (Integer.parseInt(age) < 30) {
                System.out.println(data.get("Имя"));
            }
        }
    }

    private static void getEmployeesBySalary(List<Map<String, String>> employee) {
        for (Map<String, String> data : employee) {
            String salary = data.get("Зарплата");
            if (salary.contains("руб")) {
                System.out.println(data.get("Имя"));
            }
        }
    }

    private static void getAverageAge(List<Map<String, String>> employee) {
        double sumAge = 0;
        for (Map<String, String> data : employee) {
            String age = data.get("Возраст");
            sumAge = sumAge + Double.parseDouble(age);
        }
        System.out.println(sumAge / employee.size());
    }
}
