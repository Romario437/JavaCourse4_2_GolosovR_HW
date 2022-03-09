package ru.iteco;

public class HWK_2_1_2 {
    public static void main(String[] args) {
        //номер1
        System.out.println("Номер 1:");
        String city = "Orel";
        int people = 500_000;
        int work = 20;
        System.out.println(city+"   - Город"+"\n"+people+" - Население"+"\n"+
                work+"%"+"    - Процент безработных"+"\n");

        //номер2
        System.out.println("Номер 2:");
        char section = 'D';
        byte place = 120;
        int cost = 1245;
        System.out.println(section+"      - Секция на трибуне"+"\n"+
                place+"    - Место"+"\n"+cost+"p."+" - Стоимость билета"+"\n");

        //номер3
        System.out.println("Номер 3:");
        String name = "Roman";
        int old = 18;
        int height = 178;
        System.out.println("Имя     -"+name);
        System.out.println("Возраст -"+old+" лет");
        System.out.println("Рост    -"+height+"см"+"\n");

        //номер4
        System.out.println("Номер 4:");
        char c1 ='A';
        int nomber = 953;
        String c2 = "AA";
        System.out.printf("Номер машины - %s%d%s", c1, nomber, c2+"\n"+"\n");

        //номер5
        System.out.println("Номер 5:");
        String company="\"SEA PORT\"";
        long pay=8_999_333_654L;
        int percent=25;
        System.out.println(company+"\t"+"Название компании"+"\n"+pay+"\t"+"Годовой доход"+"\n"+
                percent+"%"+"         Доля на рынке"+"\n");

        //номер6
        System.out.println("Номер 6:");
        char rh='+';
        byte b_g=3;
        String ctz="25%";
        System.out.println("Резус фактор: "+rh+"\n"+"Группа крови: "+b_g+"\n"+
                "Доля людей с этой группой крови: "+ctz+"\n"+"\n");

        //Номер7
        System.out.println("Номер 7:");
        String unv="\"ОКИ\"";
        int nc=350;
        float pd=1.1F;
        System.out.println("Название универа:      "+unv+"\n"+"Количество сотрудников: "+nc+
                "\n"+"Доля отчисленных:       "+pd+"\n");



    }
}
