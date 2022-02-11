package HomeWorkApp;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private String money;
    private int age;

    public Person(String name, String position, String email, String phone, String money, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.money = money;
        this.age = age;
        System.out.println("ФИО: " +  name + ". Должность: " + position + ". Почта: " + email + ". Номер телефона: " + phone + ". Зарплата: " + money + " Возраст: " + age);
    }


    public static void main(String[] args) {
        Person[] arr = new Person[5];
        arr[0] = new Person("КЕН", "Котик", "erqw@gmail.com", "65349845", "216554", 21);
        arr[1] = new Person("ТАВ", "Директор", "waae@gmail.com", "12312412", "234412", 23);
        arr[2] = new Person("ТНН", "Уборщик", "shsh@mail.ru", "1231241", "1", 22);
        arr[3] = new Person("СУС", "Инженер", "wqdas@gmal.com", "1231241", "1231", 55);
        arr[4] = new Person("КЕК", "Менеджер", "asdas@gmail.com", "12312312", "123", 64);
        for(int i = 0; i < 5; i++) {
            if(arr[i].age > 40) {
                System.out.println("Имена сотрудников, больше 40 лет:" + arr[i].name);
            }

        }

    }
}