package b; 
import java.util.ArrayList;
import java.util.List;

public class Main {
    // Функц 1: List үүсгэх
    public static List<Integer> createList() {
        return new ArrayList<>();
    }

    // Функц 2: Элемент нэмэх
    public static void addElement(List<Integer> list, int element) {
        list.add(element);
        System.out.println("Элемент " + element + " нэмэгдлээ.");
    }

    // Функц 3: Элемент устгах
    public static void removeElement(List<Integer> list, int index) {
        if (index >= 0 && index < list.size()) {
            int removedElement = list.remove(index);
            System.out.println("Элемент " + removedElement + " устгагдлаа.");
        } else {
            System.out.println("Алдаа: Индекс буруу байна!");
        }
    }

    // Функц 4: Элемент хайх
    public static void searchElement(List<Integer> list, int element) {
        int index = list.indexOf(element);
        if (index != -1) {
            System.out.println("Элемент " + element + " индекс: " + index);
        } else {
            System.out.println("Элемент " + element + " олдсонгүй.");
        }
    }

    // Функц 5: List-ийн утгыг хэвлэх
    public static void printList(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List хоосон байна.");
        } else {
            System.out.println("List: " + list);
        }
    }

    // Функц 6: List-ийн дарааллаар утгуудыг хэвлэх
    public static void iterateList(List<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("List хоосон байна.");
        } else {
            System.out.print("List-ийн утгууд: ");
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    
    
    public static void main(String[] args) {
        // Функц 1: List үүсгэх
        List<Integer> myList = createList();

        // Функц 2: Элемент нэмэх
        addElement(myList, 10);
        addElement(myList, 20);
        addElement(myList, 30);

        // Функц 3: Элемент устгах
        removeElement(myList, 0);
        
        // Функц 4: Элемент хайх
        searchElement(myList, 10);
        

        // Функц 5: List-ийн утгыг хэвлэх
        printList(myList);

        // Функц 6: List-ийн дарааллаар утгуудыг хэвлэх
        iterateList(myList);
    }
}
