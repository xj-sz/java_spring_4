/*
    定义javaconfig的 业务类
 */
package jx.nc.achilsh.demo20210202.Busi;

import lombok.Data;

@Data
public class Keyboard {
    String channel;
    String key;

    public Keyboard(String ch, String k) {
        this.channel = ch;
        this.key = k;
    }

}
