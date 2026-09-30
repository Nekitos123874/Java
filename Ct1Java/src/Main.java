public static void main(String[] args) {

    // Часть Г. Полиморфный массив
    Employee[] staff = {
            new Employee("Иванов И.И.", "Разработчик", 90000),
            new Employee("Петров П.П.", "Тестировщик", 70000),
            new Manager("Сидоров С.С.", "Руководитель разработки", 150000, 5),
            new Manager("Смирнова А.А.", "Руководитель тестирования", 120000, 3)
    };

    System.out.println("Сотрудники и премии");
    // Часть Г
    for (Employee item : staff) {
        System.out.println(item);
        System.out.println("Премия: " + item.calculateBonus() + " руб.");
        System.out.println();
    }


    // Часть Д
    System.out.println("Менеджеры");
    int managerCount = 0;

    for (Employee item : staff) {
        if (item instanceof Manager) {
            Manager manager = (Manager) item;
            managerCount++;
            System.out.println(manager.getName() + ", размер команды: " + manager.getTeamSize());
        }
    }
    System.out.println("Количество менеджеров: " + managerCount);

    // Часть Б
    System.out.println("Всего создано сотрудников: " + Employee.getEmployeeCount());

    // Часть Е
    double total = totalBonusBudget(staff);
    System.out.println("Общий бюджет на премии: " + total + " руб.");

    /* Часть Ж. Instanceof в части Г не нужен, потому что в Java работает динамическое связывание методов,
     если объект является Manager, то вызывается переопределённый calculateBonus()*/
}
public static double totalBonusBudget(Employee[] staff) {
    double total = 0;
    for (Employee item : staff) {
        total += item.calculateBonus();
    }
    return total;
}