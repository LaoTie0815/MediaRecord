package io.github.leonhover.videorecorder.pub;

import android.media.AudioFormat;

/**
 * Created by wangzongliang on 17-3-23.
 */

public class Profile {

    public static final int DEFAULT_VIDEO_BIT_RATE = 1024 * 1000;
    public static final int DEFAULT_VIDEO_FRAME_RATE = 16;
    public static final int DEFAULT_VIDEO_I_FRAME_INTERVAL = 3;

    public static final int ORIENTATION_0 = 0;
    public static final int ORIENTATION_90 = 90;
    public static final int ORIENTATION_180 = 180;
    public static final int ORIENTATION_270 = 270;
    public static final int DEFAULT_ORIENTATION_HINT = ORIENTATION_0;

    public static final int DEFAULT_AUDIO_BIT_RATE = 128 * 1000;
    public static final int DEFAULT_AUDIO_SAMPLING_RATE = 44100;
    public static final int DEFAULT_AUDIO_CHANNEL_COUNT = 1;
    public static final int DEFAULT_AUDIO_CHANNEL_CONFIG = AudioFormat.CHANNEL_IN_MONO;

    public int videoBitRate = DEFAULT_VIDEO_BIT_RATE;
    public int videoFrameRate = DEFAULT_VIDEO_FRAME_RATE;
    public int videoWidth;
    public int videoHeight;
    public int videoIFrameInterval = DEFAULT_VIDEO_I_FRAME_INTERVAL;

    public int audioBitRate = DEFAULT_AUDIO_BIT_RATE;
    public int audioSamplingRate = DEFAULT_AUDIO_SAMPLING_RATE;
    public int audioChannelCount = DEFAULT_AUDIO_CHANNEL_COUNT;
    public int audioChannelConfig = DEFAULT_AUDIO_CHANNEL_CONFIG;

    public int orientationHint = DEFAULT_ORIENTATION_HINT;

    public boolean isRequestAsynchronousMode = false;

    public static class Builder {

        private int videoBitRate = DEFAULT_VIDEO_BIT_RATE;
        private int videoFrameRate = DEFAULT_VIDEO_FRAME_RATE;
        private int videoIFrameInterval = DEFAULT_VIDEO_I_FRAME_INTERVAL;
        private int videoWidth;
        private int videoHeight;
        private int orientationHint = DEFAULT_ORIENTATION_HINT;

        private int audioBitRate = DEFAULT_AUDIO_BIT_RATE;
        private int audioSamplingRate = DEFAULT_AUDIO_SAMPLING_RATE;
        private int audioChannelCount = DEFAULT_AUDIO_CHANNEL_COUNT;
        private int audioChannelConfig = DEFAULT_AUDIO_CHANNEL_CONFIG;

        public boolean isRequestAsynchronousMode = false;

        /**
         * ??????????????????
         * @param bitRate ??????????????????bit/sec
         * @return Builder
         */
        public Builder setVideoBitRate(int bitRate) {
            this.videoBitRate = bitRate;
            return this;
        }

        /**
         * ??????????????????
         * @param videoFrameRate ??????????????????frame/sec
         * @return Builder
         */
        public Builder setVideoFrameRate(int videoFrameRate) {
            this.videoFrameRate = videoFrameRate;
            return this;
        }

        /**
         * ?????????????????????
         * @param videoWidth ???
         * @param videoHeight ???
         * @return Builder
         */
        public Builder setVideoSize(int videoWidth, int videoHeight) {
            this.videoWidth = videoWidth;
            this.videoHeight = videoHeight;
            return this;
        }

        /**
         * ??????????????????????????????
         * @param videoIFrameInterval ???????????????????????????
         * @return Builder
         */
        public Builder setVideoIFrameInterval(int videoIFrameInterval) {
            this.videoIFrameInterval = videoIFrameInterval;
            return this;
        }

        /**
         * ?????????????????????
         * @param audioBitRate ??????????????????bit/sec
         * @return Builder
         */
        public Builder setAudioBitRate(int audioBitRate) {
            this.audioBitRate = audioBitRate;
            return this;
        }

        /**
         * ????????????????????????
         * @param audioSamplingRate ?????????????????????HZ
         * @return
         */
        public Builder setAudioSamplingRate(int audioSamplingRate) {
            this.audioSamplingRate = audioSamplingRate;
            return this;
        }

        /**
         * ???????????????????????????
         * @param audioChannelCount ??????
         * @return Builder
         */
        public Builder setAudioChannelCount(int audioChannelCount) {
            this.audioChannelCount = audioChannelCount;
            return this;
        }

        /**
         * ???????????????????????????,??????????????????????????????????????? {@link android.media.AudioFormat}??????channel mask???
         * @param audioChannelConfig ????????????
         * @return Builder
         */
        public Builder setAudioChannelConfig(int audioChannelConfig) {
            this.audioChannelConfig = audioChannelConfig;
            return this;
        }

        /**
         * ??????????????????????????????
         * @param orientation ??????
         * @return Builder
         */
        public Builder setOrientationHint(int orientation) {
            this.orientationHint = orientation;
            return this;
        }

        /**
         * ????????????????????????????????????????????????
         * @param on ??????
         * @return Builder
         */
        public Builder setAsynchronousMode(boolean on) {
            isRequestAsynchronousMode = on;
            return this;
        }

        public Profile build() {
            Profile profile = new Profile();
            profile.audioBitRate = this.audioBitRate;
            profile.audioChannelCount = this.audioChannelCount;
            profile.audioSamplingRate = this.audioSamplingRate;
            profile.audioChannelConfig = this.audioChannelConfig;

            profile.videoBitRate = this.videoBitRate;
            profile.videoFrameRate = this.videoFrameRate;
            profile.videoWidth = this.videoWidth;
            profile.videoHeight = this.videoHeight;
            profile.videoIFrameInterval = this.videoIFrameInterval;

            profile.orientationHint = this.orientationHint;

            profile.isRequestAsynchronousMode = this.isRequestAsynchronousMode;
            return profile;
        }
    }

}
