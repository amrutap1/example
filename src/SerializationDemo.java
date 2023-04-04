import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        try{
            Employee emp= new Employee(1233412L,"AABC",125000);
            System.out.println("Employee before serialization "+emp);
            FileOutputStream fileOut=new FileOutputStream("D:\\hello.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fileOut);
            oos.writeObject(emp);
            oos.flush();
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            Employee emp;
            FileInputStream fileIn=new FileInputStream("d:\\hello.txt");
            ObjectInputStream ois=new ObjectInputStream(fileIn);
            emp=(Employee) ois.readObject();
            ois.close();
            System.out.println("Employee after deserialization "+emp);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
