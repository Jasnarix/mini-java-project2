class vehicle{
    protected String brand = "ford";
    public void honk(){
        System.out.println("Honk!!!");
    }    
}

class Main extends vehicle{
    private String modelName = "Mustang";
    public static void main(String[] args){
        Main myCar = new Main();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);

        
    }
}
