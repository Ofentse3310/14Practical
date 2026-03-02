

public class chainedHash {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        static class HashTable{
            private Node[] arr;
            private int size;

            public HashTable(int size) {
                this.size = size;
                arr = new Node[size];
            }

            private int Hash(int key){
                return key % size;
                }

            public void insert(int key){
                int index = Hash(key);
                Node newNode = new Node(key);
                newNode.next = arr[index];
                arr[index] = newNode;
            }
            public boolean Search(int key){
                int index = Hash(key);
                Node current = arr[index];

                while(current != null){
                    if(current.data == key){
                        return true;
                    }
                    current = current.next;
                }
                return false;
            }
            public void delete(int key){
                int index = Hash(key);
                Node current = arr[index];
                Node prev = null;

                while(current != null){
                    if(current.data == key){
                        if(prev.data == key){
                            arr[index] =current.next;
                        }
                        else{
                            prev.next = current.next;
                        }
                        return;
                    }
                    prev = current;
                    current = current.next;
                }

            }
            public void display(){
                for(int i = 0; i < size; i++){
                    System.out.println(i);
                    Node current = arr[i];

                    while (current != null){
                        System.out.println(current.data + " ");
                        current = current.next;
                    }
                }

            }
        }

    }


}
