import java.util.Arrays;

public class SuperArray {
  // instance variables
  private int[] array;
  private int count;

  public SuperArray(){
    this.array = new int[10];
  }//end constructor

  public SuperArray(){
    this.array = new int[Length];
  }//end constructor

 //empty
 //there is Space
 //array is full
  public void add(int val){
    int Length = this.array.length;

    for(int i = 0; i < this.array.length; i++ ){
      if(array[i] == null){
        this.array[i] = val;
        return;
      }

      int array[] = new int[Length + 1];

    }
  }//end add

  public boolean isEmpty(int val){
    for(int i = 0; i < this.array.length; i++ ){
      if(this.array[i] != null){
        return false;
      }
    }
    return true;
  }

}//end SuperArray(main)
