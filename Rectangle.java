class Rectangle{
    int width, height;
    public Rectangle(int w, int h){
        width = w;
        height = h;
    }
    public boolean equals(Object obj){
        Rectangle rec=(Rectangle)obj;
        if (width == rec.width && height == rec.height) {
            return true;
        }
        return false;
    }
    

}