package model;

import java.util.Scanner;

public class TestAlarmMusic {
    public void alarmClock (String title) {
        String q = title;
        try {
            Scanner sc = new Scanner(System.in);
            String responseBody = SpotifyCall.trackSearch(q);
//            System.out.println(responseBody);
            String trackURI = SpotifyCall.getTrackURI(1, SpotifyCall.trackSearch(q));

            System.out.println("Type STOP to stop");
            SpotifyCall.playTrack(trackURI);
            String stop = sc.next();
            if (stop.equals("STOP"))
                SpotifyCall.stopPlaying();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
