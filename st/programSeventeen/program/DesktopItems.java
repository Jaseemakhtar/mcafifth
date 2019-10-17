package program;

import java.io.File;

public class DesktopItems {
    File desktopLocation;

    public DesktopItems(){
        desktopLocation = new File("C:\\Users\\CA172003\\Desktop");
    }

    public int countItems(){
        int items = 0;

        try {
            File[] files = desktopLocation.listFiles();

            System.out.println("Files present in Desktop: ");

            for (int i = 0; i < files.length; i++) {
                if(!files[i].getName().contains(".ini")){
                    items++;
                    System.out.println(items + ". " + files[i].getName());
                }

            }
            System.out.println("\nTotal items on Desktop: " + items);
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return items;
    }
}
