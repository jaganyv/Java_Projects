import javax.sound.sampled.*;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;

public class NightChangesPlayer {
    public static void main(String[] args) {
        try {
            String songTitle = "🎵 Now Playing: Night Changes - One Direction 🎵";
            printWithTypingEffect(songTitle, 50);
            System.out.println("\n");

            File songFile = new File("src/night_changes.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(songFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            Map<Integer, String> lyrics = new TreeMap<>();
            lyrics.put(0, "We're only gettin' older, baby");
            lyrics.put(4000, "And I've been thinkin' about it lately");
            lyrics.put(8000, "Does it ever drive you crazy");
            lyrics.put(12000, "Just how fast the night changes?");
            lyrics.put(16000, "Everything that you've ever dreamed of");
            lyrics.put(20000, "Disappearing when you wake up");
            lyrics.put(24000, "But there's nothing to be afraid of");
            lyrics.put(28000, "Even when the night changes");
            lyrics.put(32000, "It will never change me and you");

            clip.start();
            long startTime = System.currentTimeMillis();

            new Thread(() -> {
                for (Map.Entry<Integer, String> entry : lyrics.entrySet()) {
                    try {
                        long waitTime = entry.getKey() - (System.currentTimeMillis() - startTime);
                        if (waitTime > 0) {
                            Thread.sleep(waitTime);
                        }
                        printWithTypingEffect(entry.getValue(), 50);
                        System.out.println();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            while (clip.isRunning()) {
                Thread.sleep(500);
            }

            clip.close();
            audioStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void printWithTypingEffect(String text, int delayMs) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delayMs);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
