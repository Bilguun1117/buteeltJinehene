package b; 
import java.util.ArrayList;
import java.util.List;

public class Main<T> {
    // Функц 1: List үүсгэх
    public static <T> List<T> createList() {
        return new ArrayList<>();
    }

    // Функц 2: Элемент нэмэх
    public static <T> void addElement(List<T> list, T element) {
        list.add(element);
        System.out.println("Элемент " + element + " нэмэгдлээ.");
    }

    // Функц 3: Элемент устгах
    public static <T> void removeElement(List<T> list, int index) {
        if (index >= 0 && index < list.size()) {
            T removedElement = list.remove(index);
            System.out.println("Элемент " + removedElement + " устгагдлаа.");
        } else {
            System.out.println("Алдаа: Индекс буруу байна!");
        }
    }

    // Функц 4: Элемент хайх
    public static <T> void searchElement(List<T> list, T element) {
        int index = list.indexOf(element);
        if (index != -1) {
            System.out.println("Элемент " + element + " индекс: " + index);
        } else {
            System.out.println("Элемент " + element + " олдсонгүй.");
        }
    }

    // Функц 5: List-ийн утгыг хэвлэх
    public static <T> void printList(List<T> list) {
        if (list.isEmpty()) {
            System.out.println("List хоосон байна.");
        } else {
            System.out.print("List: ");
            for (T item : list) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    // Функц 6: List-ийн дарааллаар утгуудыг хэвлэх
    public static <T> void iterateList(List<T> list) {
        if (list.isEmpty()) {
            System.out.println("List хоосон байна.");
        } else {
            System.out.print("List-ийн утгууд: ");
            for (T item : list) {
                System.out.print(item + " ");
            }
           
        }
    }
    
   
    
    
    public static void main(String[] args) {
        List list = createList();
        
        
        addElement(list, 10);
        addElement(list, "121" );
        addElement(list, "sdsad");
       
        removeElement(list, 0);
        printList(list);

        iterateList(list);
        
        // Объектын тодорхойлолтыг хэвлэх
        Main<Integer> main = new Main<>();
       
    }
}
