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
            Scanner scanner1;
            scanner1 = new Scanner(System.in);
            command = scanner1.nextLine();
            if(command.equals("create")){
                photo = createPhoto();
                photos.add(photo);
            }
            else if(command.equals("find")){
                Photo photo1 = findCurrentPhoto(photos);
                if(photo1 == null){
                    System.out.println("Now such photo");
                }
                else {
                    System.out.print(photo1.getSize());
                    System.out.println("MB");
                    System.out.print(photo1.getResolution());
                    System.out.println(" MegaPixels");
                    System.out.println(photo1.getGPS());
                    System.out.println(photo1.getDate());
                }
            }
            else if(command.equals("change")) {
                changeDate(photo);
            }
            else if(command.equals("help")){
                System.out.println("To create new photo type `create`");
                System.out.println("To find photo type `find`");
                System.out.println("To change photo type `change`");
            }
            else {
                System.out.println("No such command; type help");
            }
        }
    }

    public static Photo findCurrentPhoto(List<Photo> photos) {
        System.out.println("Enter size of this photo");
        String string = scanner.nextLine();
        for(Photo photo:photos){
            if(photo.getSize().equals(string)){
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
        int Date = scanner.nextInt();
        Photo photo = new Photo(Size,Resolution,GPS,Date);
        return photo;
    }
    public static int changeDate(Photo photo) {
        System.out.println("Enter when did you take this photo");
        int Date = scanner.nextInt();
        photo.setDate(Date);
        return Date;
    }
}
