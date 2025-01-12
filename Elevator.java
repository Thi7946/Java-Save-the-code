package Unit5;
public class Elevator {
    public boolean doorOpen=false;
    public int currentFloor=1;
    final int MAX_Floor=9;
    final int MIN_Floor=1;
    
    public void openDoor(){
        System.out.println("Opening door!!");
        doorOpen=true;
        System.out.println("Door is open.");
    }
    public void CloseDoor(){
        System.out.println("Closeing door!!");
        doorOpen=false;
        System.out.println("Door is close.");
    }
    public void goUp(){
        if (currentFloor==MAX_Floor){
            System.out.println("Can't go UP!!!");
        }else{    
            System.out.println("Going up one floor!!!");
            currentFloor++;
            System.out.println("This floor is :"+currentFloor);
        }
    }
    public void goDown(){
        if (currentFloor==MIN_Floor){
            System.out.println("Can't go down!!!");
        }else{
            System.out.println("Going down one floor!!!");
            currentFloor--;
            System.out.println("This floor is :"+currentFloor);
        }
    }   
}
