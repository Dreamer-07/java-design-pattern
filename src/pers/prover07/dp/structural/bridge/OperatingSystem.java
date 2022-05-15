package pers.prover07.dp.structural.bridge;

/**
 * @author 小丶木曾义仲丶哈牛柚子露丶蛋卷
 * @version 1.0
 * @date 2022/5/15 11:41
 */
public abstract class OperatingSystem {

    /**
     * 聚合实现化角色
     */
    protected VideoFile videoFile;

    abstract void play();


    public void setVideoFile(VideoFile videoFile) {
        this.videoFile = videoFile;
    }
}
