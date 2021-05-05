package lesson12_3_aqua;

public class Aquarium {
    int length;
    int width;
    int height;

    public Aquarium(int length, int weight, int height) {
        this.length = length;
        this.width = weight;
        this.height = height;
    }
     //public double Aquariumvolume(){
       // return length * width * height * 0.001;
    //}




    public double Aquariumvolume() {
        return length * width * height * 0.001;
    }

    public double AquariumVolume(int length, int width, int height) {
        return 0;
    }
}

