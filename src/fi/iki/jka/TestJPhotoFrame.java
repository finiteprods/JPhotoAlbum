package fi.iki.jka;

import org.junit.Test;

public class TestJPhotoFrame {

    @Test
    public void noPhotosGivesMsgDialog() {
        String[] photos = {};
        try {
            JPhotoFrame photoFrame = new JPhotoFrame(null, photos);
            photoFrame.slideShow();
        }
        catch (Exception e) {
            // handle later
        }
    }
}
