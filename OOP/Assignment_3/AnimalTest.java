
public class AnimalTest
{
    public static void main(String[] args){
        AnimalTest testAnimal = new AnimalTest();//creates new animal object to run the test methods on 
        testAnimal.test1();
        testAnimal.test2();
    }
    public void test1(){
        Animal[] animals = new Animal[4];//creates an array of type Animal that stores the animal objects
        animals[0] = new Canary("Rog");
        animals[1] = new Ostrich();
        animals[2] = new Shark();
        animals[3] = new Trout();
        
        System.out.println("Test1: Animal Traits");
        for(int i = 0; i<4; i++){ //loops through the array priting out each animals toString method
            System.out.println(animals[i]);
        }
    }
    public void test2(){
        Animal[] animals = new Animal[4];
        animals[0] = new Canary("Rog");
        animals[1] = new Ostrich();
        animals[2] = new Shark();
        animals[3] = new Trout();
        
        String[] compare = {"Canary: ", "Ostrich: ", "Shark: ", "Trout: "};//creates an array that stores the animal types as strings
        System.out.println("Test2: Animal Comparison");
        for(int i = 0; i<4; i++){
            System.out.println("-----------");
            System.out.printf("---%s---\n", compare[i]);//loops through the array helps format the output
            for(int j = 0; j<4; j++){
            System.out.print(compare[j]);    
            System.out.println(animals[i].equals(animals[j]));//loops through the array and compares the animals with each others and print out the results
            }
        }
    }
}
