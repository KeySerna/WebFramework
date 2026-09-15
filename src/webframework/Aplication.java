/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webframework;

import static webframework.WebFramework.get;

/**
 *
 * @author keysi
 */
public class Aplication {

    public static void main(String[] args) throws Exception {
        get("/pi", () ->
                String.valueOf(Math.PI));
        get("/e"), () ->
                String.valueOf(Math.E));
        get("/helloe", () -> {
            String message = "Hello world";
            return message;
            
        })

}
