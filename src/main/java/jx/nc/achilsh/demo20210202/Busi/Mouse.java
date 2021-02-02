/*
* 定义javaconfig 业务类
 */
package jx.nc.achilsh.demo20210202.Busi;

import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Data
public class Mouse {
    private String channel;
    private String mouseKey;

    public Mouse() {

    }
    public Mouse(String ch, String mkey) {
        channel = ch;
        mouseKey = mkey;
    }
}
