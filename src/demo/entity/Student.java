package demo.entity;

public class Student {
    private int id;
    private String name;
    private int gender;

    public Student(int id, String name, int gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

//        public Student() {
//        this.id = 1;
//        this.name ="Kien";
//        this.gender = true;
//    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int isGender(){
        return this.gender;
    }
    public void setGender(int gender){
        this.gender =gender;
    }
    public void printfInfo (){
        System.out.printf("--------------------------- \n");
        System.out.printf("ID |         Name         |  Male  |\n");
        System.out.printf("%d | %s | %d  |\n", this.id,this.name,this.gender);
    }
}
