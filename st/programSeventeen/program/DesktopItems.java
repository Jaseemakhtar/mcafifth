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
                System.out.println(i + 1 + ". " + files[i].getName());
            }

            items = files.length;
            System.out.println("\nTotal items on Desktop: " + items);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return items;
    }
}
