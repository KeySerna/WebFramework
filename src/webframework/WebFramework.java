/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package webframework;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author keysi
 */
public class WebFramework {

    static Map<String, WebService> webServices = new HashMap();

    public static void get(String route, WebService ws) {
        webServices.put(route, ws);
    }

    public static void invoke(String route) {
        WebService ws = webServices.get(route);
        return ws.call();

    }

    public static void start() {
    }
}
