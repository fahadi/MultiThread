/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.local.multithread;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 *
 * @author developer
 */
public class Main {

    public static void main(String[] args) {

        for(int i=0;i<10;i++) {
            new Thread(new Customer(UUID.randomUUID().toString())).run();
        }
    }

}
