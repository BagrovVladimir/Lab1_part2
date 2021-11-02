
package lab1_part2;

import java.util.Arrays;


public class Lab1_part2 {

    public static void main(String[] args) {
        Izdatelstva iz1 = new Izdatelstva("Проспект", "Москва");
        Izdatelstva iz2 = new Izdatelstva("Питер", "Санкт-Петербург");
        Izdatelstva iz3 = new Izdatelstva("БХВ", "Санкт-Петебург");
        Izdatelstva iz4 = new Izdatelstva("Диалектика", "Киев");
        
        String[] authors1=new String[]{"Седжвик Роберт", "Уэйн Кевин"};
        String[] authors2=new String[]{"Вигерс Карл"};
        String[] authors3=new String[]{"Шилдт Герберт"};
        String[] authors4=new String[]{"Полубецева М.И."};
        
        /*System.out.println(iz1.getNazvanieIzdatelstva());
        System.out.println(Arrays.toString(authors1));*/
        
        Knigi book1 = new Knigi("Copmuter Science: основы программирования на Java, ООП, алгоритмы и структуры данных", authors1, 2018, iz2);
        Knigi book2 = new Knigi("Разработка требований к программному обеспечению. 3-е издание, дополненное", authors2, 2019, iz3);
        Knigi book3 = new Knigi("Java. Полное руководство, 10-е издание", authors3, 2018, iz4);
        Knigi book4 = new Knigi("C/C++. Процедурное программирование", authors4, 2017, iz3);
        //Knigi book5 = new Knigi("Конституция РФ", 2020, iz1);
        
        //book1.print();
        //System.out.println(book5.getKolvoAuthors(authors4));
       // book5.print();
       
       Knigi [] books = {book1, book2, book3, book4};
       Knigi.printAll(books);
       
        System.out.println("");
        
        System.out.println("издательство - "+iz3.getNazvanieIzdatelstva()+", город - "+iz3.getGorod());
       
        if (iz3.getGorod().equals("Санкт-Петербург")) {
            System.out.println("All right");    
        } else {
            iz3.setGorod("Санкт-Петербург");
            //System.out.println("");
            //System.out.println(iz3.getGorod());
            System.out.println("В названии города издательства БХВ была допущена опечатка");
            System.out.println("правильно: издательство - "+iz3.getNazvanieIzdatelstva()+", город - "+iz3.getGorod());
            System.out.println("");//В названии города издательства БХВ была допущена опечатка
            Knigi.printAll(books);//Необходим повторный вызов метода, для отображения корректной информации
        }
    }
    
}
