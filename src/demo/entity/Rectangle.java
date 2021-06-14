package demo.entity;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle (int width, int height){
         this.width = width;
         this.height = height;
    }
    public int getArea(){
        return width*height;
    }
    public int getPerimeter(){
        return (width+height)*2;
    }
    public void setHeight(int height){
               this.height=height;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void display (){
        for (int i = 0;i < height;i++){
            for (int j = 0;j < width;j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        System.out.printf("Width and Height of Rectangle: %d, %d", width, height);
        System.out.printf("\nArea of Rectangle: %d \n",getArea());
        System.out.printf("Perimeter of Rectangle: %d \n", getPerimeter());
    }
}
