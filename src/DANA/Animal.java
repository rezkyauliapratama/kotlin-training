package DANA;

abstract class Animal {
    protected  boolean isMamal;
    protected boolean isCarivourus;

    public Animal(boolean isMamal, boolean isCarivourus){
        this.isCarivourus = isCarivourus;
        this.isMamal = isMamal;
    }

    public boolean getIsMamal() {
        return isMamal;
    }

    public boolean getIsCarivourus() {
        return isCarivourus;
    }

    abstract public String getGreeting();

    public void printAnimal(String name){
        System.out.println("A "+name+" says "+getGreeting()+", is "+(getIsCarivourus() ? "":"not")+" carnivour and is a "+(getIsMamal() ? "":"not")+" a mamal");
    }
}