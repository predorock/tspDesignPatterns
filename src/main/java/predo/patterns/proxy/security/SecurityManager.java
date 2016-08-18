package predo.patterns.proxy.security;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by predo1 on 18/08/16.
 */
public class SecurityManager {

    private static Map<String,String> accounts = new HashMap<String, String>();

    static {
        accounts.put("predorock","proxypattern");
        accounts.put("alan","lovesiren");
    }

    public static boolean checkCredentials(String user, String pass){
        boolean access = false;
        if(accounts.containsKey(user)){
            if(accounts.get(user).compareTo(pass) == 0) {
                access = true;
            }
        }
        return access;
    }

}
