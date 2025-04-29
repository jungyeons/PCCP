import java.util.LinkedList;

public class MyData{
    int data;
    MyData(int data){
        this.data = data;
    }
    static MyData createData(int data){
        return new MyData(data);
    }
    @Override
    public String toString() {
        return "MyData{" +
                "data=" + data +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return data == myData.data;
    }
    public static void main(String[] args) {
        LinkedList<MyData> linkedList = new LinkedList<>();
        linkedList.add(MyData.createData(1));
        linkedList.add(MyData.createData(2));
        linkedList.add(MyData.createData(3));
        System.out.println(linkedList.toString());
        System.out.println(linkedList.contains(MyData.createData(1)));
    }
}
