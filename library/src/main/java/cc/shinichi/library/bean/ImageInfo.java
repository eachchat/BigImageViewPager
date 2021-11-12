package cc.shinichi.library.bean;

import java.io.Serializable;

/**
 * @author 工藤
 * @email qinglingou@gmail.com
 * 图片信息
 */
public class ImageInfo implements Serializable {

    /**
     * 缩略图
     */
    private String thumbnailUrl;

    /**
     * 原图
     */
    private String originUrl;

    private long originSize;
    private String formatSize;

    public String getFormatSize() {
        return formatSize;
    }

    public void setFormatSize(String formatSize) {
        this.formatSize = formatSize;
    }

    public long getOriginSize() {
        return originSize;
    }

    public void setOriginSize(long originSize) {
        this.originSize = originSize;
    }


    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getOriginUrl() {
        return originUrl;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }
}