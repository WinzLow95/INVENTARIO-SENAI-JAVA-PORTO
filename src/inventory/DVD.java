/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author porto
 */
public class DVD extends Product {
    private int length;
    private int ageRating;
    private String filmStudio;
    
    public DVD(int number, String name, int qty, double price, int length, int rating, String studio){
        super(number, name, qty, price);
        this.length = length;
        this.ageRating = rating;
        this.filmStudio = studio;
    }
    
    public DVD(int number, String name, int qty, double price){
        super(number, name, qty, price);
    }
    
    public double getInventoryValue(){
        return(1.05 * (super.getPrice() * super.getQtyInStock()));
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public int getAgeRating(){
        return ageRating;
    }
    
    public void setAgeRating(int ageRating){
        this.ageRating = ageRating;
    }
    
    public String getFilmStudio(){
        return filmStudio;
    }
    
    public void setFilmStudio(String filmStudio){
        this.filmStudio = filmStudio;
    }
    
    public String toString(){
        return "\n\nNumero do Item  : " + getItemNumber() + "\nNome : " + getName() + "\nDuracao do Filme   : " + getLength() + "\nEstudio Cinematografico  : " + getFilmStudio() + "\nQuantidade em estoque: " + getQtyInStock() + "\nPreço    : " + getPrice() + "\nValor do Estoque  : " + getInventoryValue() + "\nStatus do Produto    : " + (getActive()?"Ativo":"Descontinuado"); 
    }
}
