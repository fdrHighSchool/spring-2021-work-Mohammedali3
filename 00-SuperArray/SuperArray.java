import java.util.Arrays;


public class SuperArray {
  // instance variables
  private int[] array;
  private int count;

  public SuperArray(){
    this.array = new int[10];
  }//end constructor

  public SuperArray(int length){
    this.array = new int[length];
  }//end constructor

 //empty
 //there is Space
 //array is full
  public void add(int val){
    int length = this.array.length;

    for(int i = 0; i < this.array.length; i++ ){
      if(this.array[i] = 0){
        this.array[this.count] = val;
        this.count++;
        return;
      }

      int temp[] = new int[length + 1];
      for(i = 0 ; i < Length; i++){
        temp[length] = this.array[i];
      }

      temp[temp.length-1 = val];
      array = new int[temp.length];
      array = temp;
    }
  }//end add

  public boolean isEmpty(){
    for(int i = 0; i < this.array.length; i++ ){
      if(this.array[i] != 0){
        return false;
      }
    }
    return true;
  }

  public String toString() {
   return Arrays.toString(this.array);
  } //end toString method

}//end SuperArray(main)
