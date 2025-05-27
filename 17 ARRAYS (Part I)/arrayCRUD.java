public class arrayCRUD {
    public static void main(String args[]){
        int marks[]=new int[10];

        marks[0]=50; //phy
        marks[1]=60; //chem
        marks[2]=70; //bio

        System.out.println("Marks of Phy = " + marks[0]);
        System.out.println("Marks of Chem = " + marks[1]);
        System.out.println("Marks of Bio = " + marks[2]);

        marks[2]=80;

        System.out.println("New Marks of Bio = " + marks[2]);
    }
}