public class Animal2 {

    public void makeNoise(){
        System.out.println("Bro is making noise");
    }
    public  void roam(){
        System.out.println("Bro is roaming");
    }

    public void sleep() {
        System.out.println(" Bro is sleeping...");
    }


}

class Feline extends Animal2{
    @Override
    public void roam(){
        System.out.println("The feline prowls gracefully.");
    }
}

class Canine extends Animal2{
@Override
    public void roam(){
    System.out.println("The canine trots in a pack.");
}
}
class Cat2 extends Feline{
    @Override
    public void makeNoise(){
        System.out.println("МЯЯЯЯЯУ");
    }

}

class Dog2  extends Canine{
    @Override
    public void makeNoise(){
        System.out.println("Гав");
    }
}
class Wolf2 extends Canine{
    @Override
    public void makeNoise(){
        System.out.println("Лучше умереть голодным волуом, чем жить сытым шакалом");
    }
}
class  Lion2 extends Feline{
    @Override
    public void makeNoise(){
        System.out.println("Лев, если и писал код, то так чисто для души, все что от кайфа писалось, без outOfBounds");
    }
}

