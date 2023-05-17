package day05concatinationoperatorstypecasting;

public class Concatination {
    public static void main(String[] args) {
        //Ornek 1) Bir string ve iki integer variable olusturun. String degeri ile integer larin toplamini console a yazdiriniz

        String s ="elma";
        int a =10;
        int b = 11;
        System.out.println(s + a+ b);//elma1011
        System.out.println(s+(a+b));//elma21
        System.out.println(s+a*b);//elma110
        System.out.println(a+b+s);//21elma
        System.out.println(a+s+b);//10elma11

        //Java da "+" sembolu iki sayi arasinda kullanilirsa toplama islemi olur
        //Java da "+" sembolu iki string arasinda veya bir string ve bir sayi arasinda kullanilirsa "concatination"  islemi olur
        //"concatination" birlestirme yapar
        //Note : Concatination islemlerinde java matematik teki islem onceligi kurallarini kullanir

        /*
        Matematikte islem onceligi
        1)once uslu sayilar
        2)Parantez ici islemler yapilir
        3)Carpma ve Bolmeler yapilir
        4)Toplama ve cikarmalar yapilir
        5)Ayni oncelikli olanlarda soldan saga baslanir
         */

        //Ornek 2) Size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz

        String shirt ="2300";
        String shoes ="5200";
        System.out.println(shirt+shoes);//23005200

        //Integer.valueOf() metodu String degerleri Integer e cevirir
       int toplamFiyat= Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //Ornek 3: Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz
        String tv = "1100";//"$1100"rakam olmayan karakter string de kullanilmaz
        String radio = "300";//"$300"
        System.out.println(tv+radio);//contatination $1100$300

        int totalPrice= Integer.valueOf(tv)+Integer.valueOf(radio);
        System.out.println(totalPrice);//
        //Note : valueOf() tum karakterleri rakam olan String leri sayilara cevirir
        //Eger valueOf() methodu kullanilirken String in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz
        //valueOf() methodu kullanilirken sadece rakam olan karakterler kullanilmalidir








    }//main
}//Class
