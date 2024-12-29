public class myCLL {

    static Node Head;
    static Node Tail;

    static int size = 0;

    static class Node{

        int Data;
        Node next;

        public Node(int val){
            this.Data = val;
        }

        public Node(int val, Node next){
            this.Data = val;
            this.next = next;
        }
    }

//----------------------Inserting Node from Head Side-----------------------------------------------------------    

    static void InsertFirst(int val){

        Node new_node = new Node(val);

        if(Head == null){
            Head = new_node;
            Tail = Head;
            Head.next = Tail;
            Tail.next = Head;
            size++;
        }
        else{
            new_node.next = Head;
            Head = new_node;
            size++;

            Node temp = Head;
            for(int i = 0; i < size-1; i++){
                temp = temp.next;
            }
            Tail = temp;
            Tail.next = Head;

        }
    }

//----------------------Display Function for Displaying All Nodes -----------------------------------------------------------    

    static void Display(){
        
        Node temp = Head;
        
        for(int i = 0; i < size; i++){
            System.out.print(temp.Data + "-->");
            temp = temp.next;
        }

        System.out.println("Head");
    }

//----------------------Function For Inserting Node at last-----------------------------------------------------------    

    static void InsertLast(int val){
        
        Node new_Node = new Node(val);

        if(Head == null){
            InsertFirst(val);
        }
        else{
            Tail.next = new_Node;
            Tail = new_Node;
            Tail.next = Head;
            size++;
        }
    }
    
//----------------------Function For Inserting Node at any given Index-----------------------------------------------------------    

    static void Insert(int val, int index){
        Node new_Node = new Node(val);

        if(Head == null || index == 1){
            InsertFirst(val);
        }else if(index == size){
            InsertLast(val);
        }
        else {
            Node prevNode = Head;
            Node nextNode = Head;
            for(int i = 1; i < index-1; i++){
                prevNode = prevNode.next;
            }
            for(int i = 1; i <= index-1; i++){
                nextNode = nextNode.next;
            }
            prevNode.next = new_Node;
            new_Node.next = nextNode;
            size++;
        }
    }

//----------------------Function For Deleting Node at given Index-----------------------------------------------------------    

    static void DeleteNodeAt(int index){

        if(Head == null){
            return;
        }
        if(index == 1){
            Head = Head.next;
            size--;
            return;
        }
        if(index == size){
            Node temp = Head;
            for(int i = 1; i < size-1; i++){
                temp = temp.next;
            }
            Tail = temp;
            Tail.next = Head;
            size--;
        }
        else {
            Node prevNode = Head;
            Node nextNode = Head;
            for(int i = 1; i < index-1; i++){
                prevNode = prevNode.next;
            }
            for(int i = 1; i <= index; i++){
                nextNode = nextNode.next;
            }

            prevNode.next = nextNode;
            Node temp = Head;

            for(int i = 1; i < size-1; i++){
                temp = temp.next;
            }
            Tail = temp;
            size--;
        }
    }



    public static void main(String[] args) {

        myCLL list = new myCLL();

        list.InsertFirst(10);
        // list.InsertFirst(11);
        // list.InsertFirst(12);
        // list.InsertFirst(13);
        list.InsertLast(11);
        list.InsertLast(12); 
        list.InsertLast(13);
        list.InsertLast(14); 
        list.InsertLast(15);
        list.Insert(14,5);
        list.DeleteNodeAt(6);
        list.Display();
        System.out.println("Size is : "+ size);
        System.out.println("Value of Head is : "+ Head.Data);
        System.out.println("Value of Tail is : "+ Tail.Data);
        System.out.println("Next Node of "+ Tail.Data + " is "+ Tail.next.Data);
        System.out.println("Next Node of "+ Head.Data + " is "+ Head.next.Data);
    }
}