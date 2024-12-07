/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author porto
 */
public class CD extends Product {
    private String artist;
    private int numberOfSongs;
    private String label;
    
    public CD(int number, String name, int qty, double price, String artist, int numSongs, String label){
        super(number, name, qty, price);
        this.artist = artist;
        this.numberOfSongs = numSongs;
        this.label = label;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public void setArtist(String artist){
        this.artist = artist;
    }
    
    public int getNumberOfSongs(){
        return numberOfSongs;
    }
    
    public void setNumberOfSongs(){
        this.numberOfSongs = numberOfSongs;
    }
    
    public String getLabel(){
        return label;
    }
    
    public void setLabel(String label){
        this.label = label;
    }
    
    public String toString() {
        return "\n\nNumeros do Item :   " + getItemNumber() + "\nNome   :   " + getName() + "\nArtista  :   " + getArtist() + "\nMusicas do album   :   " + getNumberOfSongs() + "\nSelo de Gravaçao" + getLabel() + "\nQuantidade em estoque   :   " + getQtyInStock() + "\nPreco :   " + getPrice() + "\nValor do Estoque    :   " + getInventoryValue() + "\nStatus do Produto  :   " + (getActive()?"Ativo":"Descontinuado");
    }
}
