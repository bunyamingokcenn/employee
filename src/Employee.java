public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    //kurucu metot
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    //vergi hesaplama
    double tax(double salary) {
        double tax = 0.0;
        if (this.salary > 1000) {
            tax = (int) (this.salary * 0.03);

        }

        return tax;
    }

    //bonus hesaplama
    double bonus(int workHours) {
        double bonus;
        if (this.workHours > 40) {
            int plusWork = (this.workHours - 40);
            bonus = plusWork * 30;
        } else {
            bonus = 0;
        }

        return bonus;
    }

    //maaş artışı hesaplama
    double raiseSalary(int hireYear) {
        int workYear, thisYear = 2021;
        double raise;
        workYear = (thisYear - this.hireYear);
        if (workYear <= 9) {
            raise = (this.salary * 0.05);
        } else if (workYear < 20) {
            raise = (this.salary * 0.10);
        } else {
            raise = (this.salary * 0.15);

        }

        return raise;
    }

    //Çalışan bilgilerini ekrana yazdırma metodu
    void toStringEmployee() {
        double taxAndBonus = bonus(this.workHours) - tax(this.salary);
        double newSalary = this.salary + taxAndBonus + raiseSalary(this.hireYear);

        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax(this.salary));
        System.out.println("Bonus : " + bonus(this.workHours));
        System.out.println("Maaş Artışı : " + raiseSalary(this.hireYear));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + taxAndBonus));
        System.out.println("Toplam Maaş: " + newSalary);
    }
}
