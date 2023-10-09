class Child extends Parent {
    private String childName;
    public Child(String parentName,String child){
        super(parentName);//Call the constructor 
        this.childName = child;

    }
    public void displayCInfo(){
        System.out.println("\n\t Child name : "+childName);
    }



    
}
