import java.util.Objects;

public class openHash {

    static class openHashing {

        int[] arr;
        static int size;

        static int hash(int key) {

            return (key % size);
        }


        static boolean search(int[] arr, int item) {
            int index = hash(item);

            while (arr[index] != -1) {
                if (arr[index] == item) {
                    return true;
                }
                index = (index + 1) % size;
            }
            return false;
        }

        public void insert(int item) {
            int index = hash(item);

            while (arr[index] != -1) {
                index = (index + 1) % size;
            }
            arr[index] = item;
        }

        public static void delete(int[] arr,int item){
            int index = hash(item);

            while(arr[index] != -1){
                if(arr[index] == item){
                    arr[index] = -2;
                    return;
                }
            }
            index = (index + 1) % size;
        }
    }
}
