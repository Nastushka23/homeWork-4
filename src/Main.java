public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задача 1");
        int age=17;
        int adulthood=18;
        if (age>=adulthood) {
            System.out.println("Возраст совершеннолетия наступил");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }

        //task2
        System.out.println("Задача 2");
        int temperature=5;
        int normalTemperature=5;
        if (temperature>normalTemperature){
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        //task3
        System.out.println("Задача 3");
        int speed=30;
        int normalSpeed=60;
        if (speed>normalSpeed){
            System.out.println("Если скорость " +speed+ " км/ч придется заплатить штраф!");
        } else {
            System.out.println("Если скорость " +speed+" км/ч можно ехать спокойно");
        }
        //task4
        System.out.println("Задача 4");
        int years=19;

        int schoolAge=7;
        int kindergartenAge=2;
        int universityAge=18;
        int workAge=24;
        if (years>=kindergartenAge && years<schoolAge){
            System.out.println("Если возраст человека равен "+years+ ", то ему нужно ходить в детский сад.");
        } else if(years>=schoolAge && years<universityAge){
            System.out.println("Ходит в школу");
        } else if(years>=universityAge && years<workAge){
            System.out.println("Ходит в Университет");
        } else if(years>=workAge){
            System.out.println("Ходит на работу");
        } else {
            System.out.println("Введен некорректный возраст.");
        }
        //task5
        System.out.println("Задача 5");
        int agePeople=1;
        if (agePeople<5){
            System.out.println("Не может кататься на аттракционе");
        } else if(agePeople>5 && agePeople<14){
            System.out.println("Может кататься только в сопровождении взрослого");
        } else if (agePeople>14){
            System.out.println("Может кататься без сопровождения взрослого");
        }
        //task6
        System.out.println("Задача 6");
        int capacity=102;
        int seating=60;
        int place=1102;
        if (place<=seating){
            System.out.println("Есть сидячие места");
        } else if(place>seating && place<capacity){
            System.out.println("Есть стоячие места");
        } else if(place>capacity){
            System.out.println("Мест нет");
        }
        //task7
        System.out.println("Задача 7");
        int one=25;
        int two=58;
        int three=49;
        if (one>two && one>three){
            System.out.println(one);
        } else if(two>one && two>three){
            System.out.println(two);
        } else if(three>two && three>one){
            System.out.println(three);
        }






    }

    }