package lesson12_4_aqua;

public class Aquarium {
    int length;
    int width;
    int height;

    public Aquarium(int length, int weight, int height) {
        this.length = length;
        this.width = weight;
        this.height = height;
    }
   public double AquariumVolume(int length, int width, int height){
        return length * width * height * 0.001;
    }
}
