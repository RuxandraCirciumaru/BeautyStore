public class SkinCare extends Product {
    private String skinType;

    public SkinCare(double price,double quantity, String name, String skinType){
        super(price, quantity, name);
        this.skinType = skinType;
    }

    public String getSkinType(){
        return skinType;

    }
}
