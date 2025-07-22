package org.lessons.java.best_of_the_year.classes;

public class Movies {

    private String id;
    private String title;

    public Movies(String id, String title){
        this.id= id;
        this.title=title;
    }

    public String getId(){
        return this.id;
    }

    
    public void setId(String id){
        this.id= id;
    }

    
    public String getTitle(){
        return this.title;
    }
    
    
    public void setTitle(String title){
        this.title=title;
    }

     @Override
    public String toString() {
        return  "Title: " + title;
    }
}
