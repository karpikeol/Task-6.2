 public class Animal {

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

class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Meow");
    }

}

class Dog  extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Bark");
    }
}
class Wolf extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Если волк молчит, его лучше не перебивать");
    }
}
class  Lion extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Лев не тот кто Лев, а тот кто Лев, АУФФФ");
    }
}
