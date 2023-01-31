package chapter.chapter6;

public class Box4 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
        void setDim(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }
    }

