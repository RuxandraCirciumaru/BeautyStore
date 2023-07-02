public class MakeUp extends Product{
   private String color;
    private String size;

    public MakeUp(double price, double quantity, String name,  String color, String size){
        super(price, quantity, name);
        this.color = color;
        this.size = size;
    }

    public String getColor(){
        return color;
    }
    public String getSize(){
        return size;
    }
}
