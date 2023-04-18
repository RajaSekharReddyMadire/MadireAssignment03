package Question21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializarion {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		MyClass ob = new MyClass(1, "Test");
		try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("file.ser"))) {
		    obj.writeObject(ob);
		}
}
}
class MyClass implements Serializable {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
@Override
public String toString() {
    return "MyClass{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
}



}

