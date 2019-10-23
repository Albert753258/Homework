import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main {
    static Scanner scanner;
    public static void main(String[] args) {
        System.out.println("Type help");
        scanner  = new Scanner(System.in);
        String command = null;
        Photo photo = null;
        List<Photo> photos = new ArrayList<Photo>();
        while(true){
            command = scanner.nextLine();
            if(command.equals("Create")){
                photo = createPhoto();
                photos.add(photo);
            }
            else if(command.equals("Find")){
                Photo photo1 = findCurrentPhoto(photos);
                if(photo1 == null){
                    System.out.println("Now such photo");
                }
                else {
                    System.out.print(photo.getSize());
                    System.out.println("MB");
                    System.out.print(photo.getResolution());
                    System.out.println(" Megapixels");
                    System.out.println(photo.getGPS());
                    System.out.println(photo.getDate());
                }
            }
            else if(command.equals("help")){
                System.out.println("To create new photo type `Create`");
                System.out.println("To find photo type `Find`");
            }
            else {
                System.out.println("No such command; type help");
            }
        }
    }

    public static Photo findCurrentPhoto(List<Photo> photos) {
        System.out.println("Enter date when did you take this photo");
        String string = scanner.nextLine();
        for(Photo photo:photos){
            if(photo.getDate().equals(string)){
                return photo;
            }
        }
        return null;
    }



    public static Photo createPhoto() {
        System.out.println("Enter size");
        String Size = scanner.nextLine();
        System.out.println("Enter Resolution");
        String Resolution = scanner.nextLine();
        System.out.println("Enter where did you take this photo");
        String GPS = scanner.nextLine();
        System.out.println("Enter date when did you take this photo");
        String Date = scanner.nextLine();
        Photo photo = new Photo(Size,Resolution,GPS,Date);
        return photo;
    }
}
