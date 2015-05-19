package com.tavant.subhash.nas;

import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import android.util.Log;

public class MyHostAPDUService extends HostApduService {

    private final String HSC_DEMO = "HCE_DEMO";
    private int msgCounter = 0;

    @Override
    public byte[] processCommandApdu(byte[] commandApdu, Bundle extras) {

        if (isSelectAPDU(commandApdu)) {
            Log.i(HSC_DEMO, "Application selected");
            return "HEllO PC".getBytes();
        } else {
            Log.i(HSC_DEMO, "Received: " + new String(commandApdu));
            return getNextMessage();
        }
    }

    /**
     * To check if APDU received is for SELECT_COMMAND
     * @param commandApdu
     * @return
     */
    private boolean isSelectAPDU(byte[] commandApdu) {
        return commandApdu.length >= 2 && commandApdu[0] == (byte) 0 && commandApdu[1] == (byte) 0xA4;
    }

    private byte[] getNextMessage() {
        return ("Message from android: " + msgCounter++).getBytes();
    }

    @Override
    public void onDeactivated(int reason) {
        Log.i(HSC_DEMO, "Deactivated: " + reason);
    }
}
