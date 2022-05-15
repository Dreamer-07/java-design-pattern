package pers.prover07.dp.structural.bridge;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 11:45
 */
public class Client {

    public static void main(String[] args) {
        // 创建一个操作系统
        Windows windows = new Windows();
        // 设置要播放的视频格式
        windows.setVideoFile(new Mp4VideoFile());
        // 播放视频
        windows.play();
    }

}
