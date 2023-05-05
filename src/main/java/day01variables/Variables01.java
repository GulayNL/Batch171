package day01variables;//package ismi

public class Variables01 {

    public static void main(String[] args){

        //java bu satiri okumaz, kendimize ve baskalarina aciklamadir.
        /*
        java bu satirlari okumaz
         */

        //Variable nasil olusturulur?
        //Data Type + Variable name + Atama operatoru (Assignment Operatoru) + Variable degeri + Noktali Virgul

        int  age   = 13;

        //java cumlesi==> statement
        //Dilbilgisindeki nokta ne ise javadaki ";" ayni seydir. yani statement'in bittigini gosterir
        //eger varibale declaration yapar, Assignmant yapmazsaniz java kendi default degerini koyar
        //default deger sayilar icin sifirdir.
        //java da "=" assignment operator ve java bu operatoru gordugu zaman once sag tarafi yazdirir
        //java da esittir demek ==> "==" matematikte "=", java da "=="
        //data type + variableName ==> variable declaration
        //Assignment operator (=)+ variable degeri ==> assignmant

        /*
        java da temel de iki tip data vardir;
            1)primitive data type:
            char, boolean, short, int, long, float, double


           2)non-primitive data type:
           String

         */

        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        String studentName = "Ali Can";

        //Stringlere verilen degerler daima cift tirnak icinde olmalidir
        //Strin ler icin default value (==>varsayilan deger) "null" dir

        /*
        String variable olusturdugumuzda cogu zaman vir deger atariz. atama yapmazsak java o variable icin varsayilan deger olarak null koyar

         *null demek 0 demek degildir, 0 da coding te bir degerdir, null ise hiclik demektir
         *null demek icinde variable veya method bulunmayan bos bir objedir
         *{}==>eleman yok {0}==>elemani sifir
         */


        //char data type:
        //Tek karakterler icin kullanilir. sayi, sembol yada harf farketmez
        //Ornegin ==> A, x, 4, ?
        //Ornek 2: char data typenda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz

        char firstLatterofName = 'A';
        //Note : char data typende degerler her zaman tek tirnak icine konulmalidir
        // boolean data type;
        //boolean'lar sadece iki farkli deger alabilir: true (dogru) or false(yanlis)
        //isimlendirme yapilirken basina is konulur
        //Ornek 3: boolean data type inda emeklimisin sorusu icin bir variable olusturun ve false degerini atayin
        boolean isRetired = false;
        //byte data type;
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte : -128 den 127 e (dahil) tamsayi degerleri icin kullanilir
        //Ornek 4 : byte data tyep inde ogrenci yasi icin bir variable olusturun ve deger atayiniz
        byte studentAge = 127;

        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short : -32768 den + 32767 e (dahil) tamsayi degerleri icin kullanilir
        //Ornek 5 : site nufusu icin bir variable olusturun ve deger atayiniz
        short sitePopulation =1300;

        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int: -2,147,757,636 ile 147,483,647 e (dahil) tamsayi degerleri icin kullanilir
        //Ornek 6: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz
        int countryPopulation = 1313131313;

        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long: -9,223,372, 036, 854, 775,808 ile -9,223,372, 036, 854, 775,807 arasindaki sayilar icindir
        //ornek 7: Insan vucudundaki hicre sayisi icin variable olusturup deger atamasi yapiniz
        long cellNumberinHumanBody = 8787878787878411L;
        //note:Bir deger long ise sonuna "L" (tavsiye edilir) yada "L" konulur.

        //Eger long'a atadiginiz deger int'lerin araliginda ise sonan "L" koymaya gerek yok
        //long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder
        long weightOfSun = 123565545;

        //float data type:
        //virgullu sayilar (Decimal Numbers==>ondalikli sayilar) icin kullanilir. (fiyatlandirmalar=>12.99)

        //ornek 8: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturunuz
        float shirtPrice = 12.99f;
        float shoesePrice =15.99f;
        //Note: java ondalikli sayilari otomatik olarak double kabul eder
        //float olmasina israr ediyorsaniz sonuna "F" veya "f" koymailisiniz
        //4 byte yer kaplar

        //double data type:
        //double memory de 8 byte yer kaplar, ondalikli kisim icin daha fazla rakam alir
        //ondalikli sayilar icin kullanilir

        //ornek 9: Hucre agirligi ve Amip'in agirligi icin bir variable olusturunuz

        double weigthCell = 0.0000000000000000000000113;
       double weigthAmip=   0.0000000000000000000000015;

       //Ornek 10: Ogrenci notlari icin iki adet variable olusturnuz ve toplamlarini ekrana yazdiriniz
        // ------ekrana yazdirmak icin------
        System.out.println(5);//ekrana yazdirmak icindir
        System.out.println(15);//ekrana yazdirir ve pointer i ayni satirda tutar
        //--------------------

        byte note1= 55;
        byte note2 =33;
        System.out.println(note1 + note2);

        //homework
        /*
        1) 3 farkli data turunde variable olusturun ve bunlari farkli satirlarda yazdirin
        2) ulke ve sehir isimleri icin iki variable olusturun ve bunlari yazdirin
        3) iki tamsayi turunde variable toplamini yazdirin
         */

    }//main
}//class
