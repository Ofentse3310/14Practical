import java.util.Objects;

public class openHash {
    static int size;

    static int hash(int key){

        return (key % size);
    }


    static boolean search(int[] arr, int item){
        int index = hash(item);

        while(arr[index] != -1){
            if(arr[index] == item){
                return true;
            }
            index = (index + 1) % size;
        }
        return false;
    }
}
