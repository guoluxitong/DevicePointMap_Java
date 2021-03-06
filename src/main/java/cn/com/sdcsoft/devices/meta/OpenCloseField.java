package cn.com.sdcsoft.devices.meta;


import cn.com.sdcsoft.devices.SdcSoftDevice;

import static cn.com.sdcsoft.devices.map.DevicePointMap.KEY_OPEN_CLOSE;

/**
 * Created by jialiang on 2018/4/19.
 */

public abstract class OpenCloseField extends ByteField {
    protected int value;

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void setDeviceFieldForUIKey(DeviceFieldForUI fieldForUI) {
        fieldForUI.setKey(KEY_OPEN_CLOSE);
    }
}
