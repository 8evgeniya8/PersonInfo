package Tsukanova;

public class Person {
    //    Зробити клас Person та в ньому метод personInfo()
//    На вхід передавати йому чотири параметри: ім'я, прізвище, місто, телефон
//    Всередині методу формувати рядок у форматі:
//    Зателефонувати громадянину + ІМ'Я ПРІЗВИЩЕ + із міста + МІСТО можна за номером + ТЕЛЕФОН
//    Метод має повертати String
//    У main-методі зробити три виклики методу personInfo, щоразу передаючи нову людину;
//    Повинен вийти висновок такого типу:
//    Зателефонувати громадянинові Will Smith з міста New York можна за номером 2936729462846.
//    Зателефонувати громадянинові Jackie Chan з міста Shanghai можна за номером 12312412412.
//    Зателефонувати до громадян Sherlock Holmes з міста London можна за номером 37742123513.
    public static void main(String[]args){
        System.out.println(personInfo("Will Smith","New York","2936729462846"));
        System.out.println(personInfo("Jackie Chan","Shanghai","12312412412"));
        System.out.println(personInfo("Sherlock Holmes","London","37742123513"));
    }
    static String personInfo(String name,String сity,String phone){
        return "Зателефонувати громадянинові "+name+" з міста "+сity+" можна за номером "+phone;

    }
}
