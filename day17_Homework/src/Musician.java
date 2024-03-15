public class Musician {
    public void play(Instrument i){
        i.makeSound();
    }

    public static void main(String[] args){ 
        Instrument i1 = new Erhu();
        Instrument i2 = new Piano();
        Instrument i3 = new Violin();

        Musician m = new Musician();
        m.play(i1);
        m.play(i2);
        m.play(i3);
    }
}
