
package lab1_part2;

import java.util.Arrays;

public class Knigi {
    
    private String nameBook;
    private Izdatelstva iz;
    private int year;
    //private String oneAuthor;
    private String[] authors;
    
    public Knigi(String nameBook, int year, Izdatelstva iz){
        setNameBook(nameBook);
        setYear(year);
        setIz(iz);
    }
    
    /*public Knigi(String nameBook, String oneAuthor, int year, Izdatelstva iz){
        this(nameBook, year, iz);
        setAurhors(authors);
    }*/
    
    public Knigi(String nameBook, String[] authors,int year, Izdatelstva iz){
        this(nameBook, year, iz);
        setAuthors(authors);
    }
    
    
    public String getNameBook(){
        return nameBook;
    }
    
    public Izdatelstva getIz(){
        return iz;
    }
    
    public int getYear(){
        return year;
    }
    
    /*public String getOneAuthor(){
        return oneAuthor;
    }*/
    
    public String[] getAuthors(){
        return authors;
    }
    
    /*public int getKolvoAuthors(String oneAuthor){
        int a=1;
        return a;
    }*/
    
    public int getKolvoAuthors(String[] authors){
        return authors.length;
    }
    
    public String getAuthorWithIndex(int i){
        if (i>=0 && i<=authors.length-1) {
           return authors[i]; 
        } else {throw new ArrayIndexOutOfBoundsException();} 
    }
    
    public void setNameBook(String nameBook){
         if (nameBook != null && !nameBook.trim().isEmpty()) {this.nameBook=nameBook;} 
         else {throw new IllegalArgumentException();}   
    }
    
    public void setIz(Izdatelstva iz){
         if (iz != null) {this.iz=iz;} 
         else {throw new IllegalArgumentException();}   
    }
    
    public void setYear(int year){
         if (year >0) {this.year=year;} 
         else {throw new IllegalArgumentException();}   
    }
    
    public void setAuthors(String[] authors){
        for (String author : authors) {
            if (author != null && !author.trim().isEmpty()) {
                this.authors=authors;} 
            else {throw new IllegalArgumentException();}
            
        }
    }
        
        /*for (int i = 0; i < authors.length; i++) {
            String author = authors[i];
              if (author != null && !author.trim().isEmpty()){
                  this.authors[i]=authors[i];}
              else {throw new IllegalArgumentException();}
        }  
    }*/
    
   public void print(){
       if (getKolvoAuthors(authors)!=0) {
          System.out.print(nameBook+"; ");
       for (String author : authors) {
            if (author != null && !author.trim().isEmpty()) {
                System.out.print(author+"; ");
       //for (int i = 0; i < authors.length; i++) {
            //String author = authors[i];
              //if (author != null && !author.trim().isEmpty()){
                  //this.authors[i]=authors[i];
                  //System.out.print(authors[i]);
                  }
            //else {System.out.print(iz.getNazvanieIzdatelstva()+year);}
     } System.out.print(iz.getNazvanieIzdatelstva()+"; "+year+"; ");
   }
           
        //else {System.out.println(nameBook+"; "+iz.getNazvanieIzdatelstva()+"; "+year+"; ");
       //}
   }    
   
   public static void printAll(Knigi[] books){
       for (Knigi book : books) {
           book.print();
           System.out.println("");
       } 
   }
           
}
