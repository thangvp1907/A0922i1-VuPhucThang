package Queuelienketvong;


public class Myqueue {

    private Queue Queue;

    private class Node{
        public int data;

        public Node link;

        public Node(int data){
            this.data=data;
        }
    }

    private class Queue{
        public Node front = null;
        public Node rear = null;

        public Queue(){
            front = rear;
        }
    }

    public void enQueue(int data){
        //tao 1 node mới
        Node newNode = new Node(data);

        //check nếu rỗng(null)
        if(Queue.rear==null){
            Queue.front =newNode;
            Queue.rear =newNode;
            Queue.rear.link=Queue.front;
        }else {
            Queue.rear.link= newNode;
            Queue.rear=newNode;
            Queue.rear.link=Queue.front;
        }
    }

    //Lấy phần tử theo vị trí front
    //kiểm tra front có null không
    public void deQueue(){
        if(Queue.front==null){
            System.out.println("null");
        }else {
            //Nếu front == rear
            if(Queue.front == Queue.rear){
                Queue.front= null;
                Queue.rear=  null;
            }else {
                //front sẽ chuyển qua node có nối của front ban đầu
                Queue.front=Queue.front.link;
                //Nối của rear sẽ nối tiếp front mới
                Queue.rear.link=Queue.front;
            }
        }
    }



}
