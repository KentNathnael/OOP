public class Director {
    private String nama;
    private String description;
    public Director(String nama, String description){
        this.nama = nama;
        this.description = description;
    }
    public String getNama(){
        return nama;
    }
    public  String getDescription(){
        return description;
    }
}
