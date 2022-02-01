public class Main {
    public static void main(String[] args) {

//        int[] arr = {1,3,4,5,6,7};
//        String[] strArr = {"lalal"，"hehehe","k","sjfidj"};
//
//
        float basicSalary = 3000.0f;
        int dependents = 2;
        float salary = calculateSalaryWithSwitch(basicSalary,dependents);
        System.out.println(salary);

//        logicalOperators();

        String[] names = {"anish", "kiki", "sam", "name","mark"};
        System.out.println(names[1]);
        printNames(names);

    }

    private static float calculateSalary(float basicSalary, int dependents) {
        float salary = 0;
        if (dependents == 0) {
            salary = basicSalary - basicSalary*0.4f;
        } else if (dependents == 1) {
            salary = basicSalary - basicSalary*0.3f;
        } else {
            salary = basicSalary - basicSalary*0.2f;
        }
        return salary;
    }

    private static void logicalOperators() {
        int a =5;
        int b = 10;
        if (a < b) {
            System.out.println("a is less than b");
        }
        a = b;
        if (a <= b) {
            System.out.println("a is less than/equal to b");
        }
        a = 20;
        if (a >= b) {
            System.out.println("a is greater than/equal to b");
        }
        a = 34;
        if (a != b) {
            System.out.println("a is not equal b");
        }
    }

    private static float calculateSalaryWithSwitch(float basicSalary, int dependents) {
        float salary = 0;
        switch (dependents) {
            case 0:
                System.out.println("0 dependents");
                salary = basicSalary - basicSalary * 0.4f;
                break;
            case 1:
            case 2:
                System.out.println("1 or 2 dependents");
                salary = basicSalary - basicSalary * 0.3f;
                break;
            case 3:
                System.out.println("1 dependents");
                salary = basicSalary - basicSalary * 0.2f;
                break;
            default:
                System.out.println("more than dependents");
                salary = basicSalary - basicSalary * 0.1f;
                break;
        }
        return salary;
    }

//    private static float calculateSalaryWithSwitch(float basicSalary, int dependents, int year) {
//        float salary = 0;
//        if (year < 2000){
//
//        }
//    }

    private static void printNames(String[] names) {
//        for (int i = 0; i< names.length; i++){
//            System.out.println(names[i]);
        for (String name : names) {
            System.out.println("NAME: " + name);
        }
    }
}
