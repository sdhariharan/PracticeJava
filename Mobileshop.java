public class Mobileshop {
    String Brand,Model;
    long  Price;
    Mobileshop(String Brand,String Model,long Price)
    {
        this.Brand=Brand;
        this.Model=Model;
        this.Price=Price;
    }
    public void display_mobile()
    {
        System.out.println("Brand Name : "+Brand);
        System.out.println("Model Name : "+Model);
        System.out.println("Price : "+Price);
        
    } 
    public static void main(String[] args) {
        Mobileshop m=new Mobileshop("Samsung","Galaxy M01",7500);
        m.display_mobile();
    }
}
