package com.ti.sesionone;

public class OOPExample {
    public void main(String[] args) {
        Employee.setEmployeeName("luis");
        Employee.setSalary(1000.0f);

        System.out.println(Employee.getEmployeeName()+" his/her salary is " + Employee.getSalary());

        /*Car car = new Car();

        car.setTireCount(4);
        System.out.println(car.getTireCount());*/
    }

    public class Car{//este tipo de clases ya tiene el contructor


        /*public Car(int tireCount) {
            this.tireCount = tireCount;
        }*/

        public int tireCount;

        public int getTireCount() {
            return tireCount;
        }

        public void setTireCount(int tireCount) {
            this.tireCount = tireCount;
        }
    }

    class Employee{

        //public String EMployeeName; //si pudiera hacer esto, cualquiera veria esta variable
        static String EmployeeName;//en su lugar se le pone static por que se quiere usar en el metodo static
        static float salary;//esta es la vairable superior

        public static float getSalary() {
            return salary;
        }

        public static void setSalary(float salary) {
            Employee.salary = salary;
        }

        public static String getEmployeeName() {
            return EmployeeName;
        }

        public static void setEmployeeName(String employeeName) {
            EmployeeName = employeeName;
        }
/*//mutador
        //Método
        static void setEmployeeName(String name){
            EmployeeName = name;
        }

        static void  setSalary(float salary){
            salary = salary;//el this es para evitar redundancia y hace referencia a que habla de la variable superiro
        }

        //Accesor
        static float getSalary(){//se tiene que especificar que tipo de variable que es
            return salary;//siempre se tiene que regresar algo
        }

        static String getEmployeeName(){
            return EmployeeName;
        }*/
    }
}
