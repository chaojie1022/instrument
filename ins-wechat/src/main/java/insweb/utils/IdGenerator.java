package insweb.utils;

import java.util.UUID;

/**
 * Created by Administrator on 2015/11/12 0012.
 */
public class IdGenerator {
    public static final String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
