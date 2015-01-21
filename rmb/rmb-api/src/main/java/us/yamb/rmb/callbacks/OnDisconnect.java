package us.yamb.rmb.callbacks;

import us.yamb.rmb.Message;
import us.yamb.rmb.RMB;

@FunctionalInterface
public interface OnDisconnect extends RMBCallbackInterface
{
    public void onmessage(Message message);
}