package com.cienet.OOP;

public class ThisSuper_extends {  
    public static void main(String[] args) {  
    	Movie f = new Movie();  
        System.out.println("title" + f.title);  
        System.out.println("director" + f.daoyan);  
        System.out.println("star" + f.star);  
        System.out.println("showDate" + f.showDate);  
    }  
}  
class Movie {  
    String title;    
    String daoyan;    
    String star;      
    String showDate;   

    Movie() {  
        this("xxxx年xx月xx日");
    }  
    Movie(String showDate) {  
        this("大话西游", "某某某", "佚名");  
        this.showDate = showDate;  
    }  
    Movie(String title, String daoyan) {  
        this.title = title;  
        this.daoyan = daoyan;  
    }  
    Movie(String title, String daoyan, String star) {  
        this(title, daoyan);  
        this.star = star;  
    }  
}  
