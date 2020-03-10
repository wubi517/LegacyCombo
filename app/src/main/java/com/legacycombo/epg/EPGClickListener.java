package com.legacycombo.epg;


import com.legacycombo.models.EPGChannel;
import com.legacycombo.models.EPGEvent;

/**
 * Created by Kristoffer on 15-05-25.
 */
public interface EPGClickListener {

    void onChannelClicked(int channelPosition, EPGChannel epgChannel);

    void onEventClicked(int channelPosition, int programPosition, EPGEvent epgEvent);

    void onResetButtonClicked();
}
