package cn.com.sdcsoft.devices;

import cn.com.sdcsoft.devices.meta.DeviceFieldForUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Device_PLC_YuReZhengQi extends Device_PLC_YuRe {
    public Device_PLC_YuReZhengQi()
    {
        BYTE_ARRAY_LENGTH = 490;
    }

    @Override
    public List<DeviceFieldForUI> getDeviceFocusFields() {
        HashMap<String, DeviceFieldForUI> map = this.getBaseInfoFields();
        ArrayList<DeviceFieldForUI> list = new MyArrayList<DeviceFieldForUI>();

        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_DAYS));
        list.add(this.getBaseInfoFields().get(SdcSoftDevice.KEY_POINT_RUN_HOURS));

        list.add(getUiItem(this.getBaseInfoFields(),"ba_shuiweizhuangtai"));

        if(this.getBaseInfoFields().containsKey("ba_guoluyalizhuangtai")){
            list.add(this.getBaseInfoFields().get("ba_guoluyalizhuangtai"));
        }else{
            list.add(getUiItem(this.getMockFields(),"mo_zhengqiyali"));
        }

        return list;
    }
}

