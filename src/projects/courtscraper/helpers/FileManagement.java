/**
 * @author Adam Bouloudene
 * @summary This class contains the file management for the temp folder. It can move the tempfolder and rename it. Aswell as rename individual pdfs.
 *
 */

package courtscraper.helpers;

import java.io.File;

import static courtscraper.helpers.FolderPaths.*;

public class FileManagement {

    public static void tempFileMove(String caseNumber) throws InterruptedException {
        File oldFolder = new File(TEMP_FOLDER_PATH);

        // Moves and renames
        oldFolder.renameTo(new File(DOWNLOADS_FOLDER_PATH + "\\" + caseNumber));
        new File(COURTLINK_SCRAPER_PATH + "\\Temp").mkdir();

        Thread.sleep(500);

    }

    public static void tempFileRename(String originalName, String newName) {
        File oldNamedFolder = new File(TEMP_FOLDER_PATH + "\\" + originalName + ".pdf");

        oldNamedFolder.renameTo(new File(TEMP_FOLDER_PATH + "\\" + newName + ".pdf"));
    }
}
