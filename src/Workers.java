public class Workers {
    String Name;
    String Profession;
    String Email;
    String Phone;
    int Salary;
    int Age;

    //конструктор класса Workers
    public Workers(String Name, String Profession, String Email, String Phone, int Salary, int Age) {
        this.Name = Name;
        this.Profession = Profession;
        this.Email = Email;
        this.Phone = Phone;
        this.Salary = Salary;
        this.Age = Age;
    }

    /**
     * метод выводит информацию по объекту в консоль
     */
    void getInfo() {
        System.out.println("Введите имя : " + Name);
        System.out.println(" Введите имя : " + Profession);
        System.out.println(" Введите почту : " + Email);
        System.out.println(" Введите телефон : " + Phone);
        System.out.println(" Введите зарплату : " + Salary);
        System.out.println(" Введите возраст : " + Age);
    }
}
