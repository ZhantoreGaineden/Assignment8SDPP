import javax.sound.sampled.*;
import java.io.File;

public class SoundPlayer {

    // Метод для воспроизведения звука
    public static void play(String filepath) {
        try {
            // Создаём аудио поток из файла
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(filepath));

            // Создаём клип и открываем его
            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            // Запускаем воспроизведение
            clip.start();

            // Ждём пока звук закончится
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (Exception e) {
            System.out.println("Error playing sound: " + filepath);
            e.printStackTrace();
        }
    }
}
